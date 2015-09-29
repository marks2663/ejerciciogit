import java.util.Scanner;

public class EjerciciosCondicionalesII {

	private static final int MAX_LENGHT = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjerciciosCondicionalesII.escribeReves();
		EjerciciosCondicionalesII.escribeTextoNum();
		EjerciciosCondicionalesII.getDiasEntreFechas();
		//EjerciciosCondicionalesII.getMayor();
		//EjerciciosCondicionalesII.getNumCifras();
		EjerciciosCondicionalesII.getSigDia();
		EjerciciosCondicionalesII.getSigDiaSimple();
		EjerciciosCondicionalesII.getSigSeg();
		EjerciciosCondicionalesII.isCapicua();
		EjerciciosCondicionalesII.isFechaOK();
		//EjerciciosCondicionalesII.isIgual();
		//EjerciciosCondicionalesII.ordenaNum();
	}
	//********************* Ejercicios condicionales II *******************
	//LOS EJERCICIOS QUE USAS FECHAS NO UTILIZAR LAS CLASES ESPECIFICAS DE JAVA
	public static void isIgual(){
		Scanner sc=new Scanner(System.in);
	//isIgual():Pedir dos n�meros y decir si son iguales o no.
		int num1;
		int num2;
		System.out.println("Introduzca un numero: ");
		num1=sc.nextInt();
		System.out.println("Introduzca otro numero: ");
		num2=sc.nextInt();
		if(num1==num2){
			System.out.println("Son iguales");
		}
		else{
			System.out.println("Son distintos");
		}
		
		
	}
	
	public static void getMayor(){
			//getMayor():Pedir dos n�meros y decir cual es el mayor.
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Introduzca un numero: ");
		num1=sc.nextInt();
		System.out.println("Introduzca otro numero: ");
		num2=sc.nextInt();
		
		if (num1>num2){
			System.out.println(num1+" es mayor que "+num2);
		}
			else if(num1<num2){
				System.out.println(num2+" es mayor que "+num1);
			}
		else{
			System.out.println(num1+" es igual a "+num2);
		}
	
	}
		
	public static void ordenaNum(){
		//ordenaNum():Pedir tres n�meros y mostrarlos ordenados de mayor a menor
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		System.out.println("Introduzca el numero 1: ");
		num1=sc.nextInt();
		System.out.println("Introduzca el numero 2: ");
		num2=sc.nextInt();
		System.out.println("Introduzca el numero 3: ");
		num3=sc.nextInt();
		
		if(num1>=num2){
			if(num1>=num3){
				if(num3>=num2){
					System.out.println(num1+" => "+ num3+" => "+num2);
				}
				else{
					System.out.println(num1+ " => "+num2+" => "+num3);
				}
			}
			
			else{
				System.out.println(num3+" => "+num1+" => "+num2);
			}//num3>num1
			
		}
		else if(num2>=num1){
				if (num2>=num3){
					if(num3>=num1){
						System.out.println(num2+" => "+ num3+" => "+num1);
					}
					else{
						System.out.println(num2+" => "+ num1+" => "+num3);
					}
				}
				else{
					System.out.println(num3+" => "+num2+" => "+num1);
				}
				
		}
		
		
		
		
	}
	
	
	
	public static void getNumCifras(){
		//getNumCifras():Pedir un n�mero entero con una m�ximo de 4 cifras y devuelve el n�mero de cifras que tiene.
		Scanner sc=new Scanner(System.in);
		int num;
		int length;
		final int MAX_LENGTH=4;
		do{
			System.out.println("Introduzca un n�mero con un m�x de 4 cifras: ");
			num=sc.nextInt();
			length = String.valueOf(num).length();
		}while (length>MAX_LENGTH);
		System.out.println("El n�mero introducido tiene: "+length);
	}
		
	public static void escribeReves(){
		//escribeReves():Pedir un n�mero entero con una m�ximo de 4 cifras y escr�belo al rev�s.
		Scanner sc=new Scanner(System.in);
		int num;
		int length;
		int c1=0;
		int c2=0;
		int c3=0;
		int c4=0;
		
		final int MAX_LENGTH=4;
		do{
			System.out.println("Introduzca un n�mero con un m�x de 4 cifras: ");
			num=sc.nextInt();
			length = String.valueOf(num).length();
		}while (length>MAX_LENGTH);
		
		c1=(int)num/1000;
		c2=(int)(num%1000)/100;
		c3=(int)((num%1000)%100)/10;
		c4=(int)((num%1000)%100)%10;
		
		//Math.pow(c1 + c2*Math.pow(10,"elevado a longitud -3)"
		System.out.print((int)(c1+c2*Math.pow(10,length-3)+c3*Math.pow(10,length-2)+c4*Math.pow(10,length-1)));
		
	}
		
	public static void isCapicua(){
		//isCapicua()Pedir un n�mero entero con una m�ximo de 4 cifras y devuelve si es capic�a o no.
	}
	public static void isFechaOK(){
		//isFechaOK():Pedir el d�a, mes y a�o de una fecha e indicar si la fecha es correcta. 
		//dias:1..28, 30 y 31 d�as;meses:1..12;Sin a�os bisiestos.
	}
	public static void getSigDiaSimple(){
		//getSigDiaSimple():Pedir el d�a, mes y a�o de una fecha correcta y mostrar la fecha del d�a siguiente. suponer que todos
		//los meses tienen 30 d�as.
	}
	public static void getSigDia(){
		//getSigDia():Pedir el d�a, mes y a�o de una fecha correcta y mostrar la fecha del d�a siguiente.
		//teniendo en cuenta que los meses tienen:28,30,31 d�as. No tener en cuenta los bisiestos.
	}
	public static void getDiasEntreFechas(){
		//getDiasEntreFechas()Pedir dos fechas y mostrar el n�mero de d�as que hay de diferencia. Suponiendo todos los meses de 30
		//d�as.
	}
	public static void getSigSeg(){
		//getSigSeg():Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.
	}
	public static void escribeTextoNum(){
		//escribeTextoNum():Pedir un n�mero de 0 a 99 y mostrarlo escrito. Por ejemplo, para 46 mostrar: cuarenta y seis.
	}
}
