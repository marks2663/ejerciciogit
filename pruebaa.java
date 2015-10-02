package pruebaa;

import java.util.Scanner; 
public class pruebaa{
	public static void main (String[] afa){
		Scanner scan = new Scanner(System.in); 
		int op = 0; 

		do{
			System.out.println("\n1.- Alumno"); 
			System.out.println("2.- Maestro"); 
			System.out.println("3.- Salida"); 											
			
			op = scan.nextInt(); 
			switch(op){
				case 1: 
					int op1 = 0; 
					do{
						System.out.println("\n\t1.- Altas"); 
						System.out.println("\t2.- Bajas"); 
						System.out.println("\t3.- Salir"); 
						op1= scan.nextInt(); 
						switch(op1){
							case 1: System.out.println("se selecciono altas de alumnos"); break; 
							case 2: System.out.println("se selecciono bajas de alumnos"); break; 
							default: System.out.println("Saliendo..."); break; 
						}
					}while(op1<3); 
					break; 
				case 2:
					System.out.println("Se seleciono Maestro"); break; 
				default:  System.out.println("Saliendo..."); break; 
			}
		}while(op <3); 
		
	}

}