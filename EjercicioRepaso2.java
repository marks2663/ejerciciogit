import java.util.Scanner;

public class EjercicioRepaso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//def. una var para guardar el nombre de la ciudad de nacimiento
		String cityNaci;
		//def. una var para comprobar la longitud del DNI e inicializa a su valor actual.
		/***Para ver la longitud de un string
		 * String DNI = "XXXXXXXXX";
		 * final int longDNI = DNI.length();
		 * System.out.println (longDNI);
		 */
		
		
		//def. una var para guardar el sueldo
		double sueldo;
		//guarde en ciudad nacimiento "Donostia"
		cityNaci="Donostia";
		//inicializa la var sueldo a 3.600€
		sueldo=3600;
		
		//Muestra mensajes por pantalla
		//escribe en pantalla "tu sueldo es 3600"
		System.out.println("Tu sueldo es "+(int)sueldo+".");
		//escribe en pantalla "has nacido en donostia"
		System.out.println("Has nacido en "+cityNaci+".");
		//definir el objeto Scanner para leer
		Scanner sc=new Scanner(System.in);
		//Solicita lugar de nacimiento
		System.out.println("Lugar de nacimiento: ");
		
		//guarda en la var el lugar de nac. introd. por usuario
		cityNaci=sc.nextLine();
		System.out.println(cityNaci);
		
		//def. una var para comprobar la longitud del DNI e inicializa a su valor actual.
		String dni;
		final int MAX_LENGTH=9;
		System.out.println("Introduzca su DNI: ");
		dni=sc.next();
		if(dni.length()==MAX_LENGTH){
			System.out.println("Su DNI es "+dni);	
		}
		else{
			System.out.println("ERROR! Tiene que escribir 9 digitos!");
		}
		final int NOTA_MAX=10;
		int nota=NOTA_MAX+1;
		//System.out.println("Introduzca la nota: ");
		
		//comprobar si ha aprobado
				
		while (!(nota>=0 && nota<=10)){
		System.out.println("Introduzca la nota: ");
		nota=sc.nextInt();
			if(nota>=0&&nota<=10){
		
			/*if(nota>=5){
				System.out.println("Usted ha aprobado!");
			}
			else{
				System.out.println("Usted ha suspendido :(...");
			}
			*/
			if(nota<5){
				System.out.println("Su nota es INSUFICIENTE "+nota);
			}
			else if(nota <7){
				System.out.println("Su nota es SUFICIENTE "+nota);
			}
			else if(nota <9){
				System.out.println("Su nota es NOTABLE "+nota);
			}
			else{
				System.out.println("Su nota es SOBRESALIENTE "+nota);
			}
			}
			else{
				System.out.println("Introduzca un numero entre 0 y 10.");
			}
			
		}
		
		
		
		
		
	}

}
