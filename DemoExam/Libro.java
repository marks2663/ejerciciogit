
public class Libro {
	/*-(2 puntos)Diseña la clase Libro que tiene los siguientes atributos(String titulo,String autor,int hojas) implementa sus métodos 
	la constructora Libro(String titulo),sus getter y setter y finalmente sobreescribe su método toString para que muestre 
	el título. Finalmente crea un programa que cree dos libros y los imprima por pantalla.*/
	
	private String titulo;
	private String autor;
	private int hojas;
	public static int contlibr=0;
		
	public Libro(){
		contlibr++;
	}
	public Libro(String titulo){
		this.titulo=titulo;
	}
	
	public static int getContlibr() {
		return contlibr;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		titulo=titulo.toUpperCase();
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		autor=autor.toLowerCase();
		String car1;
		car1=autor.substring(0,1);
		car1=car1.toUpperCase();
		autor=car1+autor.substring(1);
		this.autor = autor;
	}
	public int getHojas() {
		return hojas;
	}
	public void setHojas(int hojas) {
		this.hojas = hojas;
	}
	
	public String toString(){
		return titulo;
	}
	
	
}
