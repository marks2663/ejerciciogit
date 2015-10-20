
public class Amigo {
	//def ctes
	//def atributos
		private String nombre;
		private String tlfno;
		private double nota1;
		private double nota2;
		private double nota3;
		
	//def metodos
		//constructoras
		public Amigo(){
			System.out.println("creando un alumno");
		}
		public Amigo(String nombre){
			this.nombre=nombre;
		}
		public Amigo(String nombre,int tlfno){
			this.nombre=nombre;
			this.tlfno=Long.toString(tlfno);
		}
		public Amigo (String nombre, String tlfno){
			this.nombre=nombre;
			this.tlfno=tlfno;
		}
		//metodos getter y setter
		public void setNombre(String nombre){
			//pone el nombre pasado como parametro al objeto
			this.nombre=nombre;
						
		}
		public String getNombre(){
			//devuelve el nombre del amigo
			return this.nombre;
		}
		public void setTlfno(long tlfno){
			this.tlfno=Long.toString(tlfno);
					
		}
		/*public long getTlfno(){
			return Long.parseLong(tlfno);
		}*/
		public void setTlfno(String tlfno) {
			this.tlfno=tlfno;
		}
		public String getTlfno(){
			return tlfno;
		}
}
