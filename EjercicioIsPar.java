import java.util.Scanner;

public class EjercicioIsPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//intruduce el numero 37
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("introduzca un numero: ");
		
		if(sc.hasNextInt()){
			num = sc.nextInt();
			if(num % 2 == 0){
				System.out.println("El numero "+num+" es par.");
			}
			else{
				System.out.println("El número "+num+" es impar.");
			}
		}
		else{
			System.out.println("Deberías introducir un número entero");
		}
		//El numero 37 es impar
	}

}
