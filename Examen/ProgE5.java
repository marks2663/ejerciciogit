import java.util.Scanner;

public class ProgE5 {


		public static void main(String[] args) {
			CancionE5 cn=new CancionE5();
			Scanner sc=new Scanner(System.in);
			int opc;
			do{
			System.out.println("\n0.-Salir");
			System.out.println("1.-Añadir Cancion");
			System.out.println("2.-Imprimir estilos");
			System.out.println("Opción: ");
			opc=sc.nextInt();
			
			switch(opc){
			
				case 1:opcCancion(cn);break;
				case 2:cn.getEstilo();break;
				
			}
			}while(opc!=0);
			
		}
		private static void opcCancion(CancionE5 cn){
			Scanner sc=new Scanner(System.in);
			int opc;
			do{
			System.out.println("\n0.-Salir");
			System.out.println("1.-Titulo");
			System.out.println("2.-Autor");
			System.out.println("3.-Estilo");
			System.out.println("Opción: ");
			opc=sc.nextInt();
			
			switch(opc){
			
				case 1:anadirTitulo(cn);break;
				case 2:anadirAutor(cn);break;
				case 3:anadirEstilo(cn);break;
				
			}
			}while(opc!=0);
		}
		private static void anadirTitulo(CancionE5 cn){
			Scanner sc=new Scanner(System.in);
			String titulo;
			
			System.out.println("Introduzca el titulo de la cancion: ");
			titulo =sc.nextLine();
						cn.setTitulo(titulo);
		}
		private static void anadirAutor(CancionE5 cn){
			Scanner sc=new Scanner(System.in);
			String autor;
			System.out.println("Introduzca el Autor de la cancion: ");
			autor=sc.nextLine();
			cn.setAutor(autor);
		}
		private static void anadirEstilo(CancionE5 cn){
			Scanner sc=new Scanner(System.in);
			String esti;
			System.out.println("Introduzca Estilo: ");
			esti=sc.nextLine();
			String pri=esti.substring(0,1).toUpperCase();
			esti=pri+esti.substring(1);
			cn.addEstilo(esti);
		}
		
	}

