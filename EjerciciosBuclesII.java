import java.util.Scanner;

public class EjerciciosBuclesII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//siete7();
		//producto10();
		//factorial();
		//sueldos();
		//numMayMen();
		tablaMulti();
	}
	
	public static void siete7(){
		//Escribir todos los números del 100 al 0 - de 7 en 7.	
		
		for (int i=100;i>0;i-=7)
		System.out.println(i);
	}

	public static void producto10(){
		//Muestra el producto de los 10 primeros números impares.

		long producto=1;
		for (int i=1;i<20;i+=2){
			producto=producto*i;
		}
		System.out.println(producto);
	}

	public static void factorial(){ 	//Pedir un número y calcular su factorial.

		Scanner sc=new Scanner(System.in);
		 int fact = 1; 
	     int n;
	     System.out.println("Introduzca un numero: ");
	     n=sc.nextInt();
	     for (int i = 1; i <= n; i++) {
	            fact =fact* i;
	        }
	        System.out.println(fact);
	}
	
	public static void sueldos(){	//Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€
		Scanner sc=new Scanner(System.in);
		int sueldo;
		int contador=10;
		long suma=0;
		int mayor1000=0;
		do{
			System.out.println("Introduzca un sueldo: ");
			sueldo=sc.nextInt();
			if (sueldo>=1000){
				mayor1000++;
			}
			contador --;
			suma=suma+sueldo;
		}while (!(contador==0));
		System.out.println("La suma de los sueldos introducidos es :"+suma +" € ");
		System.out.println("Hay " +mayor1000+" sueldos mayores que 1000€");
	}
	public static void numMayMen(){
		//Pide 10 número y muestra el mayor, el menor y la media.
		Scanner sc=new Scanner(System.in);
		int num;
		int mayor=Integer.MIN_VALUE;
		int menor=Integer.MAX_VALUE;
		int media;
		int suma=0;
		
		for (int i=1;i<10;i++){
		System.out.println("Introduzca un numero: ");
		num=sc.nextInt();
			if(num<menor){
				menor=num;
			}
			if (num>mayor){
				mayor=num;
			}
			suma=suma+num;
		}
		media=suma/10;
		System.out.println("El numero mayor es: "+mayor);
		System.out.println("El numero menor es: "+menor);
		System.out.println("La media de la suma es: "+ media);		
	}
	public static void tablaMulti(){
		//Pide un número entre 1 y 10 y muestra su tabla de multiplicar.
	}


	//Pide 6 notas y muestra cuantos han aprobado y cuantos han suspendido.

	//Pide 6 número y muestra si ha habido algún suspenso.

	//Muestra las tablas de multiplicar del 1 al 10.

	//Calcula un número entre el 1 y el 10 aleatoriamente, el usuario tendrá tres intentos para acertar.
}
