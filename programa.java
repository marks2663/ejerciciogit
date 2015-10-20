
public class programa {
	//esto luego quitaremos
public static void main(String[]args){
	/*	Amigo amigo1=new Amigo("miguel");
		amigo1.setTlfno("0032342345987");
		System.out.println(amigo1.getTlfno());
		
		
		Asignatura prog=new Asignatura();
		prog.nombre="Programación";
		prog.horas=270;
		System.out.println();
		Asignatura ent=new Asignatura("Entornos");
		Asignatura db=new Asignatura("DBDD",170);*/
	Alumno a1=new Alumno();
	a1.setNombre("Marcos");
	System.out.println(a1.getNombre());
	Alumno nota1=new Alumno();
	nota1.setNota1(6.5);
	System.out.println("Nota 1: "+nota1.getNota1());
	
	Alumno nota2=new Alumno();
	nota2.setNota2(9);
	System.out.println("Nota 2: "+nota2.getNota2());
	
	Alumno nota3=new Alumno();
	nota3.setNota3(5);
	System.out.println("Nota 3: "+nota3.getNota3());
	
	
}


				
			

/**amigo1.nombre="miguel";
for(int i=0;i<3;i++){
	System.out.println(amigo1.nombre);
**/
}
