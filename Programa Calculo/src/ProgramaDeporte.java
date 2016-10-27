import java.util.Scanner;

public class ProgramaDeporte {
	
	public static void main(String[] args) {
		int grados;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una temperatura");
		grados = teclado.nextInt();
		
		if(grados>29){
			System.out.println("Se recomienda Natacion");
		}else if(grados>21 && grados<=29){
			System.out.println("Se recomienda Tenis");
		}else if(grados>0 && grados<=21){
			System.out.println("Se recomienda Golf");
		}
		
		
		
	}

}
