package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/********************************
		 * Definicion de constantes
		 *******************************/
		
		final String NOM_INSTI="IES Zubiri-Manteo BHI";
		
		
		//define una variable para guardar un nombre
		String nombre;
		//define una var. para guardar apellido
		String apellido;
		//define una var. para guardar la altura
		double altura;
		//define una var. para guardar la edad
		int edad;
		//define una var. para guardar si es mayor de edad o no
		boolean isMayorEdad;
		//dale al nombre valor juan
		nombre="juan ";
		//dale al apellido el valor perez
		apellido="perez";
		//dale a edad el valor 34
		edad=34;
		//dale a altura el valor 1.86
		altura=1.86;
		//dale el valor verdadero a mayor de edad
		isMayorEdad=true;
		//escribe en consola 'juan perez tiene xx anos'
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Edad: "+ edad);
		System.out.println("Altura: " + altura);
		System.out.println("Es mayor de edad? " + isMayorEdad);
		System.out.println("Edad actualizada: " +(edad +1));
	
	
		
		
		
	}

}
