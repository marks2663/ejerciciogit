public class Profesor {
	//programa
	//crea el profe1 (Nombre: "Aitor" apellido:"Alkorta"
	//crea la asig1 ("programacion")
	//asigna al profe1 la asig1
	//imprime en pantalla Aitor Alkorta(nom+apel) imparte programacion(asig1) 
	private String nombre;
	private String apel;
	private String dni;
	private Asignatura asignatura;
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApel() {
		return apel;
	}
	public void setApel(String apel) {
		this.apel = apel;
	}
	public Profesor(String nombre,String apel){
		this.nombre=nombre;
		this.apel=apel;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Asignatura getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	public String toString(){
		return nombre+" " +apel;
	}
	
}
