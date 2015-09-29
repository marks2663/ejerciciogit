import java.util.Scanner;

public class Ejercicio2 {
	

	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
		
		// define una var. para guardar la edad
		int edad;
		//define una var. isMayor para saber si es mayor de edad
		boolean isMayor;
		//solicita la edad por consola "Introduzca su edad: "
		System.out.println("Introduzca su edad: ");
		//leer por consola la edad introducida-entero y guardarlo en la var edad
		Scanner sc=new Scanner(System.in);
		edad = sc.nextInt();
		//Muestro el mensaje por la pantalla
		System.out.println("Edad: " +edad);
	}

}
