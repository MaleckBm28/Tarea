package principal;

import java.util.Scanner;

import clases.Persona;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Persona per;
		
		// Creacion del objeto
		per = new Persona();
		
		/*Introducir datos de la persona
		System.out.println("Introduce el nombre de la persona : ");
		per.setNombre(teclado.next());
		System.out.println("Introduce la edad de la persona : ");
		per.setEdad(teclado.nextInt());
		System.out.println("Introduce el DNI de la persona");
		per.setDni(teclado.next());
		*/
		
		//Introducir datos con el setDatos
		
		per.setDatos();
		
		//Manipular clase persona
		
		per.mostrar();

		if(per.esMayorDeEdad()) {
			System.out.println("Esta persona es mayor de edad");
		} else {
			System.out.println("Esta persona no mayor de edad");
		}
		
	teclado.close();
	}

}
