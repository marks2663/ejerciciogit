import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new int [4] significa que he creado un array con 4 casillas
		int[] lstnum=new int[4];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<lstnum.length;i++){
			System.out.println("Introduzca un numero "+(i+1) +" :");
			lstnum[i]=sc.nextInt();
		}
		System.out.println("Generando los numeros introducidos al reves ...........");
		//imprimir numero al reves
		for (int j=lstnum.length-1;j>=0;j--){
			System.out.print(lstnum[j]);
		}
		
	}

}
