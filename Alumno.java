
public class Alumno {

	private String nombre;
	private int edad;
	private double nota1;
	private double nota2;
	private double nota3;
	private double notaMedia;
	private static final int NUM_EVAL=3;
	private static int contAlumnos=0;

	
	public Alumno(){
		//System.out.println("Alumno Creado");
		contAlumnos++;
	}
	public Alumno(String nombre) {
		this.nombre=nombre;
		contAlumnos++;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public static int getContAlumnos() {
		return contAlumnos;
	}	
	public static void setContAlumnos(int contAlumnos) {
		Alumno.contAlumnos = contAlumnos;
	}
	public void setNota1(double nota1){
		this.nota1=nota1;
	}
	public double getNota1(){
		return nota1;
	}
	
	public void setNota2(double nota2){
		this.nota2=nota2;
	}
	public double getNota2(){
		return nota2;
	}
	
	public void setNota3(double nota3){
		this.nota3=nota3;
	}
	public double getNota3(){
		return nota3;
	}
	
	public double getNotaMedia(){
		return (nota1+nota2+nota3)/NUM_EVAL;
	}
	public String toString(){
		return nombre+" "+getNotaMedia();
	}
	
}
