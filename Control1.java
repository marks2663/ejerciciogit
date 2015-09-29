import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DEFINICION DE VARIABLES
		//var para guardar el nombre de una asignatura
		String asig;
		//var para guardar el número de alumnos matriculados
		int alumMatric;
		//var para guardar la nota del alumno1
		double notaAlum1;
		//var para guardar la nota del alumno2
		double notaAlum2;
		//var para guardar la nota media obtenida por los alumnos en la asignatura
		double notaMedia;

		//INICIALIZACIÓN DE VARABLES
		//guarda en la var asignatura el texto 'programacion'
		asig="Programación";
		//guarda en la var num. de alum. matric. el valor 2
		alumMatric=2;
		//guarda en la var nota del alumno1 el valor 6.7
		notaAlum1=6.7;
		//guarda en la var nota del alumno2 el valor 4.9
		notaAlum2=4.9;

		//MOSTRAR MENSAJES EN LA CONSOLA
		//Escribe en consola el nombre de la asignatura
		System.out.println("Asignatura: "+asig);
		//Escribe en consola a partir de los valores de las variables: 'en programacion hay 2 alumnos'
		System.out.println("En la asignatura "+asig+" hay "+alumMatric+" alumnos.");
		
		//Añade el objeto SCANNER
		Scanner sc=new Scanner(System.in);
		
		//PROGRAMA A IMPLEMENTAR
		//Pide al usuario que introduzca la asignatura
		System.out.println("Introduzca la asignatura: ");
		//guarda en la var. asign. el texto introducido por el usuario
		asig=sc.nextLine();
		//Pide al usuario que introduzca la nota del primer alumno
		System.out.println("Introduzca la nota del primer alumno: ");
		notaAlum1=sc.nextDouble();
		//Pide al suario la nota del segundo alumno
		System.out.println("Introduzca la nota del segundo alumno: ");
		notaAlum2=sc.nextDouble();
		//Guarda en la var media la media de las notas introducidas por el usuario
		notaMedia=(notaAlum1+notaAlum2)/alumMatric;
		//Muestra por pantalla el mensaje 'la nota media en xxx es yy'
		System.out.println("La nota media en "+asig+" es "+notaMedia);
		sc.close();
		
		System.out.println("---------------------------FIN PROGRAMA--------------------");
	}
}
