import java.util.Scanner;

public class EjercicioIf1 {
	/*pedir al usuario su edad y le va a decir
	* si es mayor de edad o no
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad;
		final int MAYOR=18;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca su edad: ");
		//comprobar si ha introducido un entero
		
	
		if(sc.hasNextInt()){
		//si es un entero:
			edad = sc.nextInt();
			 if (edad >= MAYOR)
			 {
				 System.out.println("Eres mayor de edad");
			 }
			 else
			 {
				 System.out.println("No eres mayor de edad");
			 }
		}
		//Si no es un entero:
		else{
			System.out.println("Deberias introducir un entero.");
		}
	
	}
	
}
