import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
	//	buclesfor();
		buclesWhile();
		//pruebaFor();
	}

	public static void buclesfor(){
		// TODO Auto-generated method stub
				/**
				 * FOR
				 */
				
			// escribir los numeros ascendentemente hasta 10
			int n;
			for (n=1;n<=10;n++){
				System.out.println(n);
			}
				
			//escribir los pares menores de 10
			int par;
			for (par=2;par<=10;par=par+2){
				System.out.println(par);
			}
			
			//escribir los numeros descendentemente del 10 al 0
			
			int m;
			for (m=10;m>=0;m--){
				System.out.println(m);
			}
			
			//pedir un nº por consola e imprimir los enteros del 0 hasta ese numero
			int num;
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduzca un numero: ");
			num=sc.nextInt();
				
			for (int i=0;i<=num;i++){
				System.out.println(i);
			}
			sc.close();
			
			//prueba for
			
			int num1,suma;
			
			suma=0;
			for (int i=0; i<10;i++){
			System.out.println("Introduzca numero:");
			num1=sc.nextInt();
			suma=suma+num1;
			}
			System.out.println("La suma es: " +suma);
	}
	public static void pruebaFor(){
		/**
		 * WHILE
		 */
		int num1,suma;
		Scanner sc=new Scanner(System.in);

		suma=0;
		for (int i=0; i<10;i++){
		System.out.println("Introduzca numero:");
		num1=sc.nextInt();
		suma=suma+num1;
		}
		System.out.println("La suma es: " +suma);
	}
	public static void buclesWhile(){
		/**
		 * WHILE
		 */
		int num1,suma;
		Scanner sc=new Scanner(System.in);

		suma=0;
		int contador=0;
		System.out.println("Cuantos nº quieres sumar?:");
		contador=sc.nextInt();
		for (int i=0; i<contador;i++){
		System.out.println("Introduzca numero:");
		num1=sc.nextInt();
		suma=suma+num1;
		}
		System.out.println("La suma es: " +suma);
	}
}
