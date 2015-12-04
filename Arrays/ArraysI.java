import java.util.Arrays;
import java.util.Scanner;

public class ArraysI {

	public static void main(String[] args) {
		//notasArray();
		//diezEnt();
		//aleatorio();
		aleatorioDos();
		//nombreReves();
	}
	public static void notasArray(){
		//Crear un array que solicite 3 notas, las almacene en un array y muestre la nota media 
		int[] lstNotas=new int[3];
		int suma = 0;
		
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<lstNotas.length;i++){
			System.out.println("Introduzca la nota "+(i+1)+":");
			lstNotas[i]=sc.nextInt();
			suma=suma+lstNotas[i];
		}
		double notaMedia=suma/lstNotas.length;
		System.out.println("La nota media es: "+notaMedia);
	}
	public static void diezEnt(){
		//Solicita al usuario 10 enteros y guardalos en un array, y muestra la suma total, el menor y el mayor de los números introducidos
		Scanner sc=new Scanner(System.in);
		int[] ent=new int[10];
		int suma=0;
		int numMay=Integer.MIN_VALUE;
		int numMen=Integer.MAX_VALUE;
		
		for(int i=0;i<ent.length;i++){
			System.out.println("Introduce el número "+(i+1)+" : ");
			ent[i]=sc.nextInt();
			if(ent[i]<numMen){
				numMen=ent[i];
			}
			if(ent[i]>numMay){
				numMay=ent[i];
			}
			suma=suma+ent[i];
		}
		System.out.println("La suma de todos los números introducido es: "+suma);
		System.out.println("El numero mayor es: "+numMay);
		System.out.println("El numero menor es: "+numMen);
	}

	public static void aleatorio(){
		//Crear un array con 10 enteros aleatorios con valores entre 1 y 6. Imprime los valores introducidos en el array.
		int[] numAle=new int[10];
		for(int i=0;i<numAle.length;i++){
			numAle[i]=(int) (Math.random()*(6-0)+1);
			System.out.println("En la casilla número "+(i+1)+" del array está el numero: "+numAle[i]);
		}
		
	}

	public static void aleatorioDos(){
		//Modifica el programa anterior para que pida un número al usuario y si el número está en el array le muestre las posiciones en las que se encuentra dicho número, en caso contrario escriba el mensaje 'número desconocido'
		Scanner sc=new Scanner(System.in);
		int[] numAle=new int[10];
		int num;
		int contCoin=0;
		int[] numAcierto=new int[10];
		
		System.out.println("Introduzca un número entre el 1 y el 6: ");
		num=sc.nextInt();
		for(int i=0;i<numAle.length;i++){
			numAle[i]=(int) (Math.random()*(6-0)+1);
			if (num==numAle[i]){
				contCoin++;
				numAcierto[i]=i;
				System.out.print("Has acertado las casillas: ");
				System.out.println((i+1));
			}
		}
		if(contCoin>0){
			System.out.println("Hay "+contCoin+" coincidencias");
		}else{
			System.out.println("Numero desconocido...");
		}
	}
	

		public static void nombreReves(){
			//Pide al usuario 8 nombres y escríbelos en orden inverso al introducido
			String[] nombre=new String[8];
			Scanner sc=new Scanner(System.in);
			String nom;
			for(int i=0;i<nombre.length;i++){
				System.out.println("Introduzca el nombre numero "+(i+1)+": ");
				nom=sc.next();
				nombre[i]=nom;
			}
			
			for (int i=nombre.length-1;i>0;i--){
				System.out.print(nombre[i]+" ");
			}
		}
}
