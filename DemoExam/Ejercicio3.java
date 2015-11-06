import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/** (2 punto)Modifica el ejercicio anterior para que pida números al usuario hasta que acierte el número mostrándole si
				es menor o mayor cada vez que introduzca un número sin acertar.
			 */
		Scanner sc=new Scanner(System.in);
		int numAle=(int) (Math.random()*10+1);
		int numIntr;
		do{
			System.out.println("Introduzca un número: ");
			numIntr=sc.nextInt();
			
			if(numIntr==numAle){
				System.out.println("Has acertado!!!!");
			}else if(numIntr<numAle){
				System.out.println("El numero introducido es MENOR");
			}else if(numIntr>numAle){
				System.out.println("El numero introducido es MAYOR");
			}
		}while(!(numIntr==numAle));
		
		
		
	}

}
