import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***-(1 puntos)Genera un número aleatorio entre el 1 y el 10. Pide un numéro al usuario y muestra si es menor, mayor o ha
		acertado.*/
		Scanner sc=new Scanner(System.in);
		int numAle=(int) (Math.random()*10+1);
		int numIntr;
		
		System.out.println("Introduzca un número: ");
		numIntr=sc.nextInt();
		
		if(numIntr==numAle){
				System.out.println("Has acertado");
			}else if(numIntr<numAle){
				System.out.println("El numero introducido es MENOR");
			}else if(numIntr>numAle){
				System.out.println("El numero introducido es MAYOR");
			}
		}
		
	}


