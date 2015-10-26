
public class Asignatura {

	
	private String nombre;
	private int horas;
	private static final int MAX_HORAS=400;
	private static int CONT_ASIG=1;
	private String cod="ZUB"+CONT_ASIG;
	
	public Asignatura(){
		CONT_ASIG++;
	}
	
	public void setCod(String cod){
		this.cod=cod;
	}
	public String getCod(){
		return cod;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
		
	}
	public void setHoras(int horas) {
		this.horas = horas;
		if(horas>=MAX_HORAS){
			System.out.println("No se puede introducir más de 400 horas");
		}else {
			System.out.println("El numero de horas de la asignatura es: "+horas);
		}
	}
		
}
