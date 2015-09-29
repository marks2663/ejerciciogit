import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declarar constantes
		final int NUM_EVAL=3;
		
		
		//calcular la nota final de una asignatura
		
		String nomAsig;
		
		double nota1T;
		double nota2T;
		double nota3T;
		double notaFinal;
		//Declaracion del objeto Scanner
		
		Scanner sc=new Scanner(System.in);
		
		//Solicita la asignatura
		
		System.out.println("Asignatura: ");
		
		//leer la asignatura
		
		nomAsig = sc.nextLine();
				
		//Solicitar la nota 1TRI
		System.out.println("Nota del 1º Trimestre: ");
		
		//leer nota 1TRI
		nota1T = sc.nextDouble();
		System.out.println(nota1T);	
		
		//Solicitar la nota 2TRI
		System.out.println("Nota del 2º Trimestre: ");
		
		//leer nota 2TRI
		nota2T = sc.nextDouble();
		System.out.println(nota2T);	
		
		//Solicitar la nota 3TRI
		System.out.println("Nota del 3º Trimestre: ");
		
		//leer nota 3TRI
		nota3T = sc.nextDouble();
		System.out.println(nota3T);	
		//Calcular la media --> notaFinal
		
		notaFinal=(nota1T+nota2T+nota3T)/NUM_EVAL;
		
		//escribir la notaFinal
		System.out.println("Nota final de "+ nomAsig+": "+ Math.round(notaFinal));
		System.out.println("Aprobado: "+ (notaFinal>=5));
	}

}
