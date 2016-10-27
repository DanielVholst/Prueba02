package mes;

import java.util.Scanner;

public class meses {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated method stub
		int x;
		System.out.println("Introduce un numero y te dire a que mes corresponde");
		x=teclado.nextInt();
		
		while(x<1 || x>12){
			System.out.println("No vale introducelo otra vez "+ x);
			x=teclado.nextInt();
		}
		
		if(x==1){
			System.out.println("El mes es enero");
		
		}else if(x==2){
			System.out.println("El mes es febrero");
				
		}else if(x==3){
			System.out.println("El mes es marzo");
			
		}else if(x==4){
			System.out.println("El mes es abril");
			
		}else if(x==5){
			System.out.println("El mes es mayo");
			
		}else if(x==6){
			System.out.println("El mes es junio");
			
		}else if(x==7){
			System.out.println("El mes es julio");
			
		}else if(x==8){
			System.out.println("El mes es agosto");
			
		}else if(x==9){
			System.out.println("El mes es septiembre");
			
		}else if(x==10){
			System.out.println("El mes es octubre");
			
		}else if(x==11){
			System.out.println("El mes es nobiembre");
			
		}else if(x==12){
			System.out.println("El mes es diciembre");
			
		}
		
		/*switch(x){
		case 1:
			System.out.println("El mes es enero");
			break;
		case 2:
			System.out.println("El mes es febrero");
			break;
		case 3:
			System.out.println("El mes es marzo");
			break;
		case 4:
			System.out.println("El mes es abril");
			break;
		case 5:
			System.out.println("El mes es mayo");
			break;
		case 6:
			System.out.println("El mes es junio");
			break;
		case 7:
			System.out.println("El mes es julio");
			break;
		case 8:
			System.out.println("El mes es agosto");
			break;
		case 9:
			System.out.println("El mes es septiembre");
			break;
		case 10:
			System.out.println("El mes es octubre");
			break;
		case 11:
			System.out.println("El mes es noviembre");
			break;
		case 12:
			System.out.println("El mes es diciembre");
			break;
		
		}*/
		
		
	
	
		

		}

}
