import java.util.Scanner;

public class ProductoCantPrecio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String producto;
		int cantidad;
		double precio;
		double total;
		
		//Declaracion del objeto Scanner
		Scanner sc=new Scanner(System.in);
		
		//Solicitar nombre de producto
		System.out.print("Introduzca el nombre del producto: ");
		
		//leer producto
		producto = sc.next();
		
		//solicitar cantidad
		System.out.print("Cantidad: ");
		
		//leer cantidad
		cantidad = sc.nextInt();
		
		//solicitar precio
		System.out.print("Precio: ");
		
		//leer precio
		precio=sc.nextDouble();
		total=cantidad*precio;
		
		//muestra en pantalla "10 patatas - total:13€
		System.out.println(cantidad+" "+producto +" - total: "+ total+"€");
		
	}

}
