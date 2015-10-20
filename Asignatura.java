
public class Asignatura {
	public final int MAX_ALUM=25;
	public String nombre;
	public int horas;
	public double notaMedia;
	
	public Asignatura(){
		System.out.println("Objeto creado");
	}
	
	public Asignatura(String nombre){
		this.nombre=nombre;
	}
	public Asignatura (String nombre, int horas){
		this.horas=horas;
		this.nombre=nombre;
		
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Asignatura prog=new Asignatura("");
	prog.nombre="Programación";
	prog.horas=270;
	System.out.println();
	Asignatura ent=new Asignatura("Entornos");
	Asignatura db=new Asignatura("DBDD",170);
}
}