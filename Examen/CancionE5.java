
public class CancionE5 {

	private String titulo;
	private String autor;
	private int contEst=0;
	private EstiloE5[] estilo=new EstiloE5[4];
	
	private int duracion;
	private boolean escuchada=false;
	
	

	public void getEstilo() {
		for(int i=0;i<estilo.length;i++){
			if (estilo[i]!=null)
				System.out.print( estilo[i]+ " ");
			
		}
	
	}
	public void addEstilo(String style){
		EstiloE5 est=new EstiloE5();
		est.setEstilo(style);
		estilo[contEst]=est;
		contEst++;
	}
	
	public CancionE5(String titulo){
		this.titulo=titulo;
	}
	
	
	public CancionE5() {
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public boolean isEscuchada() {
		return escuchada;
	}
	public void setEscuchada(boolean escuchada) {
		this.escuchada = escuchada;
	}
	public String toString(){
		return autor+" - "+titulo;
	}
	
	
}

