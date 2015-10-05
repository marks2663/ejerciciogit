import java.util.Scanner;

public class EjerciciosCondicionalesII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EjerciciosCondicionalesII.escribeReves();
		//EjerciciosCondicionalesII.escribeTextoNum();
		//EjerciciosCondicionalesII.getDiasEntreFechas();
		//EjerciciosCondicionalesII.getMayor();
		//EjerciciosCondicionalesII.getNumCifras();
		//EjerciciosCondicionalesII.getSigDia();
		//EjerciciosCondicionalesII.getSigDiaSimple();
		//EjerciciosCondicionalesII.getSigSeg();
		//EjerciciosCondicionalesII.isCapicua();
		//EjerciciosCondicionalesII.isFechaOK();
		//EjerciciosCondicionalesII.isIgual();
		//EjerciciosCondicionalesII.ordenaNum();
	}
	//********************* Ejercicios condicionales II *******************
	//LOS EJERCICIOS QUE USAS FECHAS NO UTILIZAR LAS CLASES ESPECIFICAS DE JAVA
	public static void isIgual(){
		Scanner sc=new Scanner(System.in);
	//isIgual():Pedir dos números y decir si son iguales o no.
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
			//getMayor():Pedir dos números y decir cual es el mayor.
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
		//ordenaNum():Pedir tres números y mostrarlos ordenados de mayor a menor
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
		//getNumCifras():Pedir un número entero con una máximo de 4 cifras y devuelve el número de cifras que tiene.
		Scanner sc=new Scanner(System.in);
		int num;
		int length;
		final int MAX_LENGTH=4;
		do{
			System.out.println("Introduzca un número con un máx de 4 cifras: ");
			num=sc.nextInt();
			length = String.valueOf(num).length();
		}while (length>MAX_LENGTH);
		System.out.println("El número introducido tiene: "+length);
	}
		
	public static void escribeReves(){
		//escribeReves():Pedir un número entero con una máximo de 4 cifras y escríbelo al revés.
		Scanner sc=new Scanner(System.in);
		int num;
		int length;
		int c1=0;
		int c2=0;
		int c3=0;
		int c4=0;
		
		final int MAX_LENGTH=4;
		do{
			System.out.println("Introduzca un número con un máx de 4 cifras: ");
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
		//isCapicua()Pedir un número entero con una máximo de 4 cifras y devuelve si es capicúa o no.
	    Scanner sc=new Scanner(System.in);
        int num;
        int length;
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        int numReves;
        final int MAX_LENGTH=4;
        do{//Haz esto mientras la longitud sea mayor que MAX_LENGHT 
            System.out.println("Introduzca un número con un máx de 4 cifras: ");
            num=sc.nextInt();
            length = String.valueOf(num).length();
            
        
        }while (length>MAX_LENGTH);//mientras la longitud introducida sea mayor que MAX_LENGHT 
         
        c1=(int)num/1000;
        c2=(int)(num%1000)/100;
        c3=(int)((num%1000)%100)/10;
        c4=(int)((num%1000)%100)%10;
        numReves=(int)(c1+c2*Math.pow(10,length-3)+c3*Math.pow(10,length-2)+c4*Math.pow(10,length-1));
        //Math.pow(c1 + c2*Math.pow(10,"elevado a longitud -3)"
        System.out.println((int)(c1+c2*Math.pow(10,length-3)+c3*Math.pow(10,length-2)+c4*Math.pow(10,length-1)));
        if (numReves==num){
            System.out.println("El numero es capicua");
        }
        else{
            System.out.println("El numero NO es capicua");
        }
	}
	public static void isFechaOK(){
		//isFechaOK():Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
		//dias:1..28, 30 y 31 días;meses:1..12;Sin años bisiestos.
		int dia;
		int mes;
		int agno;
		int lenghtAgno;
		
		final int AGNO_MAX_LENGHT=4;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca el dia: ");
		dia=sc.nextInt();
		
		System.out.println("Introduzca el mes: ");
		mes=sc.nextInt();
		
		System.out.println("Introduzca el año: ");
		agno=sc.nextInt();
		lenghtAgno=String.valueOf(agno).length();
		
		if(dia>=1&&dia<=31){
			switch (mes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: 			
				if (dia>=1&&dia<=31){
					System.out.println("La fecha introducida es correcta: "+dia+"/"+mes+"/"+agno);
				}
				else{
					System.out.println("La fecha introducida es incorrecta");
				}break;
			case 2:
				if (dia>=1&&dia<=28){
					System.out.println("La fecha introducida es correcta: "+dia+"/"+mes+"/"+agno);
				}
				else{
					System.out.println("La fecha introducida es incorrecta");
				}break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia>=1&&dia<=30){
					System.out.println("La fecha introducida es correcta: "+dia+"/"+mes+"/"+agno);
				}
				else{
					System.out.println("La fecha introducida es incorrecta");
				}break;
				
			
			}
		}
		else{
			System.out.println("La fecha introducida es incorrecta");
		}
		
		
		
	}
	public static void getSigDiaSimple(){
		//getSigDiaSimple():Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos
		//los meses tienen 30 días.
		int dia;
		int mes;
		int agno;
		int lenghtAgno;
		
		final int AGNO_MAX_LENGHT=4;

		Scanner sc=new Scanner(System.in);
		
		do{
		System.out.println("Introduzca el dia: ");
		dia=sc.nextInt();
		
		System.out.println("Introduzca el mes: ");
		mes=sc.nextInt();
		
		System.out.println("Introduzca el año: ");
		agno=sc.nextInt();
		lenghtAgno=String.valueOf(agno).length();
			if((!(dia>=1&&dia<=30) || !(mes>=1&&mes<=12) || lenghtAgno>AGNO_MAX_LENGHT)){
				System.out.println("Fecha mal introducida.");
			}
		}while(!(dia>=1&&dia<=30) || !(mes>=1&&mes<=12) || lenghtAgno>AGNO_MAX_LENGHT);
		
		dia ++;
		if (dia>30){
			dia=1;
			mes ++;
			if (mes>12){
				mes=1;
				agno ++;
			}
		}
		System.out.println("El dia siguiente es: "+dia+"/"+mes+"/"+agno);
		
		
		
	}
	public static void getSigDia(){
		//getSigDia():Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente.
		//teniendo en cuenta que los meses tienen:28,30,31 días. No tener en cuenta los bisiestos.
		
		int dia;
		int mes;
		int agno;
		int lenghtAgno;
		
		final int AGNO_MAX_LENGHT=4;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca el dia: ");
		dia=sc.nextInt();
		
		System.out.println("Introduzca el mes: ");
		mes=sc.nextInt();
		
		System.out.println("Introduzca el año: ");
		agno=sc.nextInt();
		lenghtAgno=String.valueOf(agno).length();
		
		if(dia>=1&&dia<=31){
			switch (mes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: 			
				if (dia>=1&&dia<=31){
					dia ++;
					if(dia>31){
						dia=1;
						mes++;
						if(mes>12){
							mes=1;
							agno++;
						}
					}
					System.out.println("El dia siguiente es: "+dia+"/"+mes+"/"+agno);
				}
				else{
					System.out.println("La fecha introducida es incorrecta");
				}break;
			case 2:
				if (dia>=1&&dia<=28){
					dia ++;
					if(dia>28){
						dia=1;
						mes++;
						if(mes>12){
							mes=1;
							agno++;
						}
					}
					System.out.println("El dia siguiente es: "+dia+"/"+mes+"/"+agno);
				}
				else{
					System.out.println("La fecha introducida es incorrecta");
				}break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia>=1&&dia<=30){
					dia ++;
					if(dia>31){
						dia=1;
						mes++;
						if(mes>12){
							mes=1;
							agno++;
						}
					}
					System.out.println("El dia siguiente es: "+dia+"/"+mes+"/"+agno);
				}
				else{
					System.out.println("La fecha introducida es incorrecta");
				}break;
				
			
			}
		}
		else{
			System.out.println("La fecha introducida es incorrecta");
		}
		
	}
	public static void getDiasEntreFechas(){
		//getDiasEntreFechas()Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30
		//días.
		Scanner sc=new Scanner(System.in);
		int dia1;
		int mes1;
		int agno1;
		int dia2;
		int mes2;
		int agno2;
		do{
		System.out.println("Fecha 1");
		System.out.println("Introduzca dia");
		dia1=sc.nextInt();
		System.out.println("Introduzca mes");
		mes1=sc.nextInt();
		System.out.println("Introduzca año");
		agno1=sc.nextInt();
		
		System.out.println("Fecha 2");
		System.out.println("Introduzca dia");
		dia2=sc.nextInt();
		System.out.println("Introduzca mes");
		mes2=sc.nextInt();
		System.out.println("Introduzca año");
		agno2=sc.nextInt();
			if((!(dia1>=1&&dia1<=30) || !(mes1>=1&&mes1<=12))
			|| (!(dia2>=1&&dia2<=30) || !(mes2>=1&&mes2<=12))){
			System.out.println("Fecha mal introducida.");
			}
		}while(!(dia1>=1&&dia1<=30) || !(mes1>=1&&mes1<=12) || (!(dia2>=1&&dia2<=30) || !(mes2>=1&&mes2<=12)));
		
		int totalDias=dia2-dia1-1+30*(mes2-mes1)+365*(agno2-agno1);
		System.out.println("Días de diferencia: "+totalDias);

		
	}
	public static void getSigSeg(){
		//getSigSeg():Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.
		
		Scanner sc=new Scanner(System.in);
		int h;
		int m;
		int s;
		
		System.out.println("Introduzca una hora: ");
		h=sc.nextInt();
		System.out.println("Introduzca un minuto: ");
		m=sc.nextInt();
		System.out.println("Introduzca un segundo");
		s=sc.nextInt();
		
		s++;
		
		if (s>=59){
		s=0;
		m ++;
			if (m>=59){
				m=0;
				h ++;
				if(h>=24){
					h=0;
				}
			}
		}
		System.out.println("Fecha: "+h+":"+m+":"+s);
	}
	public static void escribeTextoNum(){
		//escribeTextoNum():Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 46 mostrar: cuarenta y seis.
		int num;
		int unidades, decenas;
		Scanner sc=new Scanner (System.in);
		do{
			System.out.println("Introduzca un numero de dos digitos: ");
			num=sc.nextInt();
		}while (!(num<100));
		
		unidades=num%10;
		decenas=num/10;
		
		switch (decenas){
		case 0:
			System.out.print("");break;
		case 1:
			if(decenas==1&&unidades==2){
				System.out.print ("Doce");
			
			}
			else{
				System.out.print ("Diez");
			}
			break;
		case 2:
			System.out.print("Veinte");break;
		case 3:
			System.out.print("Treinta");break;

		case 4:
			System.out.print("Cuarenta");break;
		case 5:
			System.out.print("Cincuenta");break;
		case 6:
			System.out.print("Sesenta");break;
		case 7:
			System.out.print("Setenta");break;
		case 8:
			System.out.print("Ochenta");break;
		case 9:
			System.out.print("Noventa");break;
		}
		
		
			if (unidades==0){
				System.out.print ("");
			}
			else if(unidades==2&&decenas==1){
				System.out.print ("");

			}
			else{
				System.out.print (" y");
			}
			
			
		switch (unidades){
		case 0:
			System.out.print("");break;
		case 1:
			System.out.print(" uno");break;

		case 2:
			if(decenas==1&&unidades==2){
				System.out.print ("");
			}
			else{System.out.print(" dos");break;
			}break;
		case 3:
			System.out.print(" tres");break;

		case 4:
			System.out.print(" cuatro");break;

		case 5:
			System.out.print("cinco");break;

		case 6:
			System.out.print(" seis");break;

		case 7:
			System.out.print(" siete");break;

		case 8:
			System.out.print(" ocho");break;
		case 9:
			System.out.print(" nueve");break;


		}
		
	}
}

