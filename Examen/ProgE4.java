
public class ProgE4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CancionE4 c1=new CancionE4("With you");
		CancionE4 c2=new CancionE4("99 Problems");
		
		c1.setAutor("Linkin Park");
		c1.setDuracion(200);
		c1.setEstilo("Alternativo");
		c1.setEscuchada(true);
		
		c2.setAutor("Jay-Z");
		c2.setDuracion(300);
		c2.setEstilo("Hip-Hop");
		c2.setEscuchada(false);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
