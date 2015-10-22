
public class programa {
		//esto luego quitaremos
	public static void main(String[]args){
		
		Alumno a1,a2,a3;
		a1=new Alumno();
		a2=new Alumno();
		a3=new Alumno();
		
		a1.setNombre("Marcos");
		a2.setNombre("Alves");
		a3.setNombre("Cardoso");
		
		
		
		System.out.println(a1.getNombre());
		
		
		a1.setNota1(6.5);
		System.out.println("Nota 1: "+a1.getNota1());
		
		a1.setNota2(9);
		System.out.println("Nota 2: "+a1.getNota2());
		
		a1.setNota3(5);
		System.out.println("Nota 3: "+a1.getNota3());
		
		System.out.println("La nota media de "+a1.getNombre()+" es: "+a1.getNotaMedia());
		System.out.println("El número de alumnos en la clase es: "+Alumno.getContAlumnos());
		
		
		Asignatura asig1, asig2, asig3;
		
		asig1=new Asignatura();
		asig1.setNombre("Programación");
		System.out.println("\nCódigo de la asignatura "+asig1.getNombre()+": "+asig1.getCod());
		asig1.setHoras(115);
		
		
		asig2=new Asignatura();
		asig2.setNombre("Entornos");
		System.out.println("\nCódigo de la asignatura "+asig2.getNombre()+": "+asig2.getCod());
		asig1.setHoras(300);
		
		
		asig3=new Asignatura();
		asig3.setNombre("Bases de datos");
		System.out.println("\nCódigo de la asignatura "+asig3.getNombre()+": "+asig3.getCod());
		asig1.setHoras(300);
		
	}
}
