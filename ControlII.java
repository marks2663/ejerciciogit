import java.util.Scanner;

public class ControlII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		edadCristo();
		nota();
		letra();
	}
	public static void edadCristo(){
		//realiza un programa que solicite un número si el numero es 33, muestra 
		//'tienes la edad de cristo', si es menor 'eres menor que cristo' y si es mayor  'eres más viejo que cristo'.
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		num=sc.nextInt();
		if (num==33){
			System.out.println("Tienes la edad de Cristo.");
			
		}else if(num>33){
			System.out.println("Eres mayor que cristo.");
		}else if (num<33){
			System.out.println("Eres menor que Cristo.");
		}
		
	}
	public static void nota(){
		Scanner sc=new Scanner(System.in);
		//realiza un programa que solicite una nota, que no tiene decimales, y 
		//muestra INSUFICENTE(0-4), SUFICIENTE(5), BIEN(6), NOTABLE(7,8),SOBRESALIENTE(9,10),
		//ERROR en caso contrario. Para este ejercicio hay que utilizar la estructura switch
		
		int nota;
		System.out.println("Introduzca una nota: ");
		nota=sc.nextInt();
		
		switch (nota){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Insuficiente " + nota);
				break;
			case 5:
				System.out.println("Suficiente "+nota);
				break;
			case 6:
				System.out.println("Bien "+nota);
				break;
			case 7:
			case 8:
				System.out.println("Notable "+nota);
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente "+nota);
				break;
			default:
				System.out.println("Nota introducida incorrecta");
		}
		
		
	}
	public static void letra(){
		//realiza un programa que solicite al usuario una letra y le diga si es vocal o consonante
		Scanner sc=new Scanner(System.in);
		char letra;
		System.out.println("Introduzca una letra: ");
		letra=sc.next().charAt(0);
		
		switch(letra){
			case 'a': case 'A':
			case 'e':case 'E':
			case 'i':case'I':
			case 'o': case'O':
			case'u': case 'U':
				System.out.println("Es una vocal");
				break;
			default:
				System.out.println("Es una consonante.");
		}
		
		
	}
}
