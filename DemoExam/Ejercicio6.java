import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/**-(2 puntos)Crea un programa que solicite 10 números por consola, 
			 * los imprima todos y muestre el valor y la posición del menor y del
			 * mayor:
				[4,2,5,1,7,9,3,0,2,10]
				el menor es 0 en la posición 8
				el mayor es 10 en la posición 10
			  */
		Scanner sc=new Scanner(System.in);

		int[] num=new int[10];
		int mayor=Integer.MIN_VALUE;
		int menor=Integer.MAX_VALUE;
		int posMay=0;
		int posMen=0;
		
		for (int i=0;i<num.length;i++){
			System.out.println("Introduzca el número "+(i+1)+":");
			num[i]=sc.nextInt();
			if(num[i]>mayor){
				mayor=num[i];
				posMay=i;
			}else if(num[i]<menor){
				menor=num[i];
				posMen=i;
			}
			
		}
		
		System.out.print ("[");
		for(int i=0;i<num.length-1;i++){
			System.out.print (""+num[i]+", ");
		}
		System.out.println(num[9]+"]");
		
		System.out.println("El número mayor es: "+mayor+" en la posicion: "+(posMay+1));
		System.out.println("El número menor es: "+menor+" en la posicion: "+(posMen+1));
		
	}

}
