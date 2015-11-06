import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/***-(1 punto)Pide al usuario su edad(22) y su nombre(juan) y muestra como resultado "juan en el 2017 tendras 24 años".*/
		Scanner sc=new Scanner(System.in);
		
		int edad;
		String nombre;
		
		System.out.println("Introduzca su nombre: ");
		nombre=sc.next();
		System.out.println("Introduzca su edad: ");
		edad=sc.nextInt();
		
		System.out.println(nombre+" en el 2017 tendrá "+(edad+2)+" años.");

	}

}
