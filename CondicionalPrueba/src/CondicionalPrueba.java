import java.util.Scanner;
public class CondicionalPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declarar constantes
		final int NUM_EVAL=3;
		final int MAX_NOTA=10;
		
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
		
		if(notaFinal>=5){
			System.out.println("Usted ha aprobado "+nomAsig);
			System.out.println("Su nota final es: "+Math.round(notaFinal));
		}
		else{
			System.out.println("Usted ha suspendido "+nomAsig);
			System.out.println("Su nota final es: "+Math.round(notaFinal));
		}

		
	}

}