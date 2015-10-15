import java.util.Scanner;

public class ControlIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sumaNum();
		//tablaMulti();
		//passwd();
	}
	
	public static void sumaNum(){
		//pide un número al usuario y calcula las suma de los numeros enteros hasta el introducido:1+2+3+4+num
		Scanner sc=new Scanner(System.in);
		int num;
		int suma=0;
		System.out.println("Introduzca un número: ");
		num=sc.nextInt();
		for (int i=0;i<=num;i++){
			suma=suma+i;
		}
		System.out.println("Las suma de los numeros enteros hasta el introducido es: "+suma);
	}
	
	public static void tablaMulti(){
		//pide un número al usuario y muestra su tabla de multiplicar
		int num;
		int prod;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		num=sc.nextInt();
		for (int i=1;i<=10;i++){
			prod=num*i;
			System.out.println(num+" x "+i+" = "+prod);
		}
	}
	
	public static void passwd(){
		//pide al usuario un password hasta que lo introduzca correctamente. El password sera "admin".
		Scanner sc=new Scanner(System.in);
		
		String pswd="admin";
		String intr;
		do{
			System.out.println("Introduzca una contraseña:");
			intr=sc.nextLine();
			if(intr.equals(pswd)){
				System.out.println("Contraseña correcta");
			}else{
				System.out.println("Contraseña incorrecta, vuelva a intentarlo...");
			}
		}while(!(intr.equals(pswd)));
		
	}

}
