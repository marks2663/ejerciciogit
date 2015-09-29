import java.util.Scanner;

public class EjerciciosEstructurasCondicionalesI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*************************
		* IMPLEMENTA LOS SIGUIENTES PROGRAMAS UTILIZANDO 
		* ESTRUCTURAS CONDICIONALES
		**************************/
		//EjerciciosEstructurasCondicionalesI.diaSemana();
		//EjerciciosEstructurasCondicionalesI.mesAno();
		//EjerciciosEstructurasCondicionalesI.password();
		EjerciciosEstructurasCondicionalesI.usuPass();
		//dado el día numérico devuelva el dia literal de la semana
	
	}
	public static void diaSemana() {
		int diaNum;
		String dia;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca el día de la semana: ");
		diaNum=sc.nextInt();
		if(diaNum==1){
				dia="Lunes";
				System.out.println("El día de la semana introducido es: "+dia);
		}
		
			else if(diaNum==2){
				dia="Martes";
				System.out.println("El día de la semana introducido es: "+dia);
			}
			else if(diaNum==3){
				dia="Miercoles";
				System.out.println("El día de la semana introducido es: "+dia);
			}
			else if(diaNum==4){
				dia="Jueves";
				System.out.println("El día de la semana introducido es: "+dia);
			}
			else if(diaNum==5){
				dia="Viernes";
				System.out.println("El día de la semana introducido es: "+dia);
			}
			else if(diaNum==6){
				dia="Sábado";
				System.out.println("El día de la semana introducido es: "+dia);
			}
			else if(diaNum==7){
				dia="Domingo";
				System.out.println("El día de la semana introducido es: "+dia);
			}
			
		
		else{
			System.out.println("Introduzca un numero entre 1 y 7");
		}
		
	}
	
		public static void mesAno(){
		//dado el mes del año devuelva el número de días q tiene
		
		int diaMes;
		String mes;
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un numero de mes: ");
		diaMes=sc.nextInt();
		if (diaMes==1){
			mes="31 días";
			System.out.println("El mes introducido tiene: "+mes);
		}
			else if(diaMes==2){
				mes="28 o 29 días";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==3){
				mes="31 días";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==4){
				mes="30 días";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==5){
				mes="31 días";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==6){
				mes="30 días";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==7){
				mes="31 días";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==8){
				mes="31 días";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==9){
				mes="30 días";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==10){
				mes="31 días";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==11){
				mes="30 días";
				System.out.println("El mes introducido tiene: "+mes);
			}
			else if(diaMes==12){
				mes="31 días";
				System.out.println("El mes introducido tiene: "+mes);
			}
		else{
			System.out.println("Introduzca un numero del 1 al 12");
		}
		
		}

		public static void password(){
			
			//Solicita al usuario un password, si no es '1234' escribe 'passwd incorrecto' si no 'Bienvenido'
			String password;
			String passControl="1234";
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduzca su contraseña: ");
			password=sc.next();
			if (password.equals(passControl)){
				
				System.out.println("Bienvenido");
			}
			else {
				
				System.out.println("Contraseña incorrecta");
			}
		}


		//Soliciata al usuario un usuario y passwd, si es 'admin' y '1234' mostrar 'Bienvenido', sino 'usuario o passwd incorrecto'
		
		public static void usuPass(){
			Scanner sc=new Scanner(System.in);
			String usuario;
			String usuaCorrec="admin";
			String password;
			String passCorrec="1234";
			
			do{
				
				System.out.println("Introduzca su usuario: ");
				usuario=sc.nextLine();
				System.out.println("Introduzca su contraseña: ");
				password=sc.nextLine();
				//Si el usuario o la contraseña son incorrectas, mensaje de error.
				if(!usuario.equals(usuaCorrec)||!password.equals(passCorrec))
					System.out.println("Usuario o Password incorrecto");
			
			}
			//Se ejecutará el "do" mientras el usuario O la contraseña sean incorrectas. si son correctas: "Bienve"
			while (!usuario.equals(usuaCorrec)||!password.equals(passCorrec));
				
			System.out.print("Bienve");
				
				
	}
				
			
}

	



