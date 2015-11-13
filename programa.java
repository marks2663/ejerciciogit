import java.util.Scanner;

public class programa {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un gestor de tarea
		ToDoMngr gt=new ToDoMngr(10);
		
		Scanner sc=new Scanner(System.in);
		int opc;
		do{
		System.out.println("\n0.-Salir");
		System.out.println("1.-Añadir");
		System.out.println("2.-Finalizar");
		System.out.println("3.-Imprimir");
		System.out.println("Opción: ");
		opc=sc.nextInt();
		
		switch(opc){
		
			case 1:anadirTarea(gt);break;
			case 2:finTarea(gt);break;
			case 3:gt.imprTareas();break;
			
		}
		}while(opc!=0);
		
		//crear tarea
		/*gt.addTarea("Estudiar");
		gt.addTarea("Correr");
		gt.addTarea("Estuding");
		gt.finTarea(0);
		gt.imprTareas();*/

	}

	private static void anadirTarea(ToDoMngr gt){
		Scanner sc=new Scanner(System.in);
		String desc;
	
		System.out.println("Descripción de la tarea: ");
		desc=sc.nextLine();
		gt.addTarea(desc);
	}

	private static void finTarea(ToDoMngr gt){
		Scanner sc=new Scanner(System.in);
		int ind;
		System.out.println("Num tarea:");
		ind =sc.nextInt();
		gt.finTarea(ind);
	}
}
