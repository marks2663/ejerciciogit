package ejerciciosrepaso;

import java.util.Scanner;

public class EjerciciosRepaso {
//escribe tu nombre en una linea de comentario
	//Marcos Alves Cardoso Oliveira
//escribe como comentario de varias lineas un texto
	/*
	 * Marcos
	 * Alves
	 * Cardoso
	 * Oliveira
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*******************************************
		 * DEFINE LAS SIGUIENTES VARIABLES O CONSTANTES
		 ********************************************/
		
		//cantidad de alumnos en el aula
		int cantAlum;
		//cantidad maxima de alumnos teniendo un valor de 24
		final int MAX_ALUM=24;
		//una var. que me diga si  el aula esta completa o no
		String completa;
		completa = "El aula está completa.";
		String nocompleta;
		nocompleta="Hay sitio en el aula.";
		//nota mas alta del aula
		double notaMasAlta;
		//el DNI del alumno
		String dni;
		//tlfno del alumno
		String tlf;
			
		/*******************************************
		 * ASIGNA LOS SIGUIENTES VALORES A LAS VARS 
		 * DEFINIDAS ANTERIORMENTE
		 ********************************************/
		
		//cant de alumn aula inicializa a 10
		cantAlum=10;
		
		//muestra en pantalla si hay sitio o no en el aula
		if (cantAlum==MAX_ALUM){
			System.out.println(completa);
		}
		else{
			System.out.println(nocompleta);
		}
		//guarda en DNI tu dni
		dni="x8238582M";
		System.out.println("DNI: "+dni);
		//incrementa en 1 la cantidad de alumnos en aula
		cantAlum=10+1;
	
		//guarda en tel alumno un número de tlfno
		tlf="699116685";
		//decrementa en 1 la cantidad de alumnos en aula
		cantAlum=10-1;
		
		/*******************************************
		 * MUESTRA POR PANTALLA LOS SIGUIENTES MENSAJES
		 ********************************************/
		
		//muestra la cant de alum en aula
		System.out.println("Cantidad de alumnos: "+cantAlum);
		//muestra el mensaje "en el aula hay xx alumnos"
		System.out.println("En el aula hay "+ cantAlum+" alumnos");
		//muestra el mensaje "La cantidad máxima de alumnos es: xxx"
		System.out.println("La cantidad máxima de alumnos es :"+ MAX_ALUM);
		
		
		/*******************************************
		 * DEFINE UN OBJETO SCANNER PARA LEER POR CONSOLA
		 ********************************************/
		Scanner sc=new Scanner(System.in);
		/*******************************************
		 * LEE LAS SIGUIENTES VARIABLES POR CONSOLA
		 ********************************************/
		
		//Pide la cantidad de alumnos por consola
		System.out.println("Introduzca el nº de alumnos: ");
		//guarda en la var. correspondiente el valor introducido
		cantAlum = sc.nextInt();
		//Pide la nota más alta por consola
		System.out.println("Introduzca la nota más alta: ");
		//guarda en la var. correspondiente el valor introducido
		notaMasAlta = sc.nextDouble();
		//Pide el dni del alumno por consola
		System.out.println("Introduzca el DNI: ");
		//guarda en la var. correspondiente el valor introducido
		dni = sc.next();
		
		
		/*******************************************
		 * DESARROLLA LOS SIGUIENTES PROGRAMAS
		 ********************************************/
		
		//EjRep1: Muestra por consola el area de un circulo de radio 2
			
			
			//define vars.
			double area;
			int radio;
			final double PI=Math.PI;
			
			//aplica vars.
			radio = 2;
			
			//calculos
			area=PI*(radio*radio);
			
			// muestra en pantalla
			System.out.println("El area de un circulo de radio 2 es :" +area);
			
		//EjRep2:Muestra por consola el sueldo bruto mensual si al año cobro 24.000€
		
			//define vars.
			double sueldoBrutoMes;
			double sueldoAno;
			int numPagas;
			//aplica vars.
			System.out.println("Introduzca su sueldo anual: ");
			sueldoAno=sc.nextDouble();
			System.out.println("Introduzca el nº de pagas que percibe en un año: ");
			numPagas=sc.nextInt();
			sueldoBrutoMes=sueldoAno/numPagas;
			// muestra en pantalla
			System.out.println("Si cobra "+ sueldoAno+ " euros anuales, entonces cobra "+Math.round(sueldoBrutoMes)+" euros al mes.");
		
		//EjRep3: Muestra los beneficios teniendo en cuenta: gastos=128.000,ingresos=350.000
		//beneficio=ingresos-gastos
		
			//define vars.
			int ingresos;
			int gastos;
			int beneficio;
			//aplica vars.
			ingresos=350000;
			gastos=128000;
			//calculos
			beneficio=ingresos-gastos;
			// muestra en pantalla
			System.out.println("El beneficio de la empresa ha sido de: "+beneficio+" €");
		//EjRep4:Pide al usuario su nombre y muestra "Hola XXX"
			
			//define vars.
			String nombre;
			System.out.println("Introduzca su nombre: ");
			nombre=sc.next();
			System.out.println("Hola "+nombre);
			
		//EjRep5:Pide al usuario su edad y muestra "El próximo año tendrás xxx años"
			//define vars.
			int edad;
			// muestra en pantalla
			System.out.println("Introduzca su edad: ");
			edad=sc.nextInt();
			System.out.println("El próximo año tendrás "+(edad+1)+" años.");
			
		//EjRep6:Pide al usuario su altura y muestra su peso ideal.
		//peso ideal=0,75 *(altura en cm – 150) + 50
			//define vars.
			double altura;
			double pesoIdeal;
			//aplica vars.
			System.out.println("Introduzca su altura: ");
			altura=sc.nextDouble();
			//calculos
			pesoIdeal=0.75 *((altura*100)-150) +50;
			// muestra en pantalla
			System.out.println("Su peso ideal es: "+pesoIdeal);
			
		//EjRep7:Pide al usuario su nombre, primer apellido y segundo apellido
		//muestra "Perez Lopez, Juan"
			//define vars.
			String nombre7;
			String apell7;
			
				
			System.out.println("Introduzca su nombre: ");
			nombre7=sc.next();
			System.out.println("Introduzca sus apellidos: ");
			apell7=sc.nextLine();
		
			
			// muestra en pantalla
			System.out.println(apell7+" "+", "+nombre7);
			
		//EjRep8: Pide al usuario una cantidad de dinero y un número de personas
		//muestra "Cada persona debe pagar xxx€ y xxx céntimos"
			
			//define vars.
			double dinero;
			int numPers;
			int euro;
			double centimos;
			double totalPers;
			//aplica vars.
			System.out.println("Introduzca la cantidad a pagar: ");
			dinero=sc.nextDouble();
			System.out.println("Introduzca el nº de personas: ");
			numPers=sc.nextInt();
			//calculos
			totalPers=dinero/numPers;
			euro=(int)totalPers;
			centimos=(totalPers-euro)*100;
			// muestra en pantalla
			System.out.println("Cada persona debe pagar "+euro+"€ y "+(int)centimos+" céntimos");
	}

}
