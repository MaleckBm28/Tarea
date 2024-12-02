package clases;

import java.util.Scanner;

public class Persona {
	Scanner teclado = new Scanner(System.in);

	private String nombre;
	private int edad;
	private String dni;

	private final int MAYORIA_DE_EDAD = 18;

	public Persona() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getMAYORIA_DE_EDAD() {
		return MAYORIA_DE_EDAD;
	}

	// Método setDatos
	public void setDatos() {
		System.out.println("Introduce el nombre de la persona : ");
		nombre = teclado.next();

		// Validamos edad correcta
		do {
			System.out.println("Introduce la edad de la persona : ");
			edad = teclado.nextInt();
			if (edad > 120 || edad < 0) {
				System.out.println("Introduce una edad entre 0 y 120");
			}
		} while (edad > 120 || edad < 0);

		do {
			System.out.println("Introduce el DNI de la persona");
			dni = teclado.next();
			if (!validarDni()) {
				System.out.println("Formato de DNI incorrecto");
			}
		} while (!validarDni());
	}

	// metodos
	public void mostrar() {
		System.out.println("Los datos de la persona son nombre:" + nombre + ", edad=" + edad + "" + ", dni=" + dni);
	}

	public boolean esMayorDeEdad() {
		boolean mayor;
		if (edad >= MAYORIA_DE_EDAD) {
			mayor = true;
		} else {
			mayor = false;
		}
		return mayor;
	}

	private boolean validarDni() {
		// Declaraciones
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int dni, resto;
		String dniLetra, dniSinLetra;
		Scanner sc = new Scanner(System.in);

		dniLetra = this.dni;
		if (dniLetra.length() < 10) {
			dniSinLetra = dniLetra.substring(0, dniLetra.length() - 1);
		} else {
			dniSinLetra = dniLetra.substring(0, dniLetra.length() - 2);
		}

		dni = Integer.parseInt(dniSinLetra);
		resto = dni % 23;
		if (dniLetra.charAt(dniLetra.length() - 1) == letras.charAt(resto)) {
			return true;
		}else {
			return false;
		}
	
	}

}