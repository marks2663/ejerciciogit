
public class Ejercicio4programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * -(2 puntos)Dise�a la clase Libro que tiene los siguientes atributos(String titulo,String autor,int hojas) implementa sus m�todos 
		la constructora Libro(String titulo),sus getter y setter y finalmente sobreescribe su m�todo toString para que muestre 
		el t�tulo. Finalmente crea un programa que cree dos libros y los imprima por pantalla.
		 */
		
		Libro l1=new Libro();
		l1.setTitulo("Juego de tronos");
		l1.setAutor("GG.RR");
		l1.setHojas(500);
		
		Libro l2=new Libro();
		l2.setTitulo("Peter Pan");
		l2.setAutor("unknown");
		l2.setHojas(300);
		
		System.out.println("Libro 1: "+l1);
		System.out.println("Autor del libro "+l1+" es: "+l1.getAutor());
		System.out.println("\nLibro 2: "+l2);
		System.out.println("Autor del libro "+l2+" es: "+l2.getAutor());
		
		System.out.println("\nCantidad de libros: "+Libro.getContlibr());
	}

}
