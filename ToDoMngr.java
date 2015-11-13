
public class ToDoMngr {
	private Tarea[] lstTareas;
	private int contTareas;
	
	
	public ToDoMngr (int numTareas){
		lstTareas=new Tarea[numTareas];
		contTareas=0;
	}
	
	public void addTarea(String desc){
		Tarea t=new Tarea();
		t.setDescr(desc);
		t.setFinalizada(false);
		lstTareas[contTareas]=t;
		contTareas++;
	}

	public void finTarea(int ind){
		lstTareas[ind].setFinalizada(true);
	}
	
	public void imprTareas(){
		for (int i=0;i<contTareas;i++){
			System.out.print(i+" "+lstTareas[i].getDescr()+ " (");
			if (lstTareas[i].isFinalizada()){
				System.out.print("X)\n");
			}else{
				System.out.print(" )\n");
			}
			
		}
	}
}
