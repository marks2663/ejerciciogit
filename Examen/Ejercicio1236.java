import java.util.Scanner;

public class Ejercicio1236 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio1();
		//Ejercicio2();
		//Ejercicio3();
		Ejercicio6();
	}

	public static void Ejercicio1(){
	//pide al usuario su año de nacimiento y su nombre y muestra como resultado "juan tienes 20 años"
		Scanner sc=new Scanner (System.in);
		
		int añoActual=2015;
		int añoNaci = 0;
		String nombre;
		
		System.out.println("Introduzca su nombre: ");
		nombre=sc.nextLine();
		
		System.out.println("Introduzca su año de nacimiento:");
		añoNaci=sc.nextInt();
		int añoP=añoActual-añoNaci;
		
		System.out.println(nombre+" tienes "+añoP+" años.");
	
	}
	public static void Ejercicio2(){
		Scanner sc=new Scanner(System.in);
		
		int diaSema;
		
		System.out.println("Introduzca un dia de la semana: ");
		diaSema=sc.nextInt();
		
		switch (diaSema){
		case 1:System.out.println("Hoy es Lunes ");break;
		case 2:System.out.println("Hoy es Martes ");break;
		case 3:System.out.println("Hoy es Miercoles ");break;
		case 4:System.out.println("Hoy es Jueves ");break;
		case 5:System.out.println("Hoy es Viernes");break;
		case 6:System.out.println("Hoy es Sabado");break;
		case 7:System.out.println("Hoy es Domingo");break;
		default:System.out.println("El numero introducido no es un dia de la semana.");
		}
		
	}
	public static void Ejercicio3(){
		Scanner sc=new Scanner(System.in);
		
		int nota;
		int suma=0;
		int media;
		int contNota=0;
		
		do{
			System.out.println("Introduzca una nota: ");
			nota=sc.nextInt();
			if(nota>=0){
			suma=suma+nota;
			contNota++;
			}
		}while(nota>=0);
		
		media=(int)suma/contNota;

		switch (media){
		case 1:
		case 4:System.out.println("Tienes un INSUFICIENTE ("+((double)suma)/contNota+")");break;
		case 5:System.out.println("Tienes un SUFICIENTE ("+((double)suma)/contNota+")");break;
		case 6:System.out.println("Tienes un BIEN ("+((double)suma)/contNota+")");break;
		case 7:
		case 8:System.out.println("Tienes un NOTABLE ("+((double)suma)/contNota+")");break;
		case 9:
		case 10:System.out.println("Tienes un SOBRESALIENTE ("+((double)suma)/contNota+")");break;
		}
		
	}
	public static void Ejercicio6(){
		Scanner sc=new Scanner(System.in);
		
		String[] palabras=new String [10];
		int aciertos=0;
		String palaIntr;
		
		
		
		for(int i=0;i<palabras.length;i++){
			System.out.println("Introduzca la palabra "+(i+1));
			palabras[i]=sc.next();
		}
		
		do{
			int numAle=(int) (Math.random()*9+0);
			System.out.println("Aciertos "+aciertos+". Siguiente palabra a "+palabras[numAle]+": ");
			palaIntr=sc.next();
			if(palaIntr.equals(palabras[numAle+1])){
				aciertos++;
			}
		}while(aciertos!=3);
		
		if (aciertos==3){
			System.out.println("Has acertado 3 palabras!!!");
		}
			
			
	
	}
}
