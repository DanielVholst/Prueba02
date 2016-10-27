package numeros;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String letra="";
		int numero=-2, valor=2,contador=0;
		
		
		
			while(valor!=-1){
				System.out.println("Introduce una letra, 0 para terminar: ");
			letra=metodo.pedirCadena();
		
			numero=-2;
			switch (letra){
			case "0":
				valor=-1;
				numero=-3;
				System.out.println("Has acumulado "+contador+" fallos, volaste del programa y el programa volo de ti");
				if(contador>2){
					System.out.println("Has tenido mas de 2 fallos, menudo zoquete");
				}
				break;
			case "a": case "b": case "c":
			numero=1;
			break;
			
			case "d": case "e": case "f":
			numero=2;
			break;
			
			case "g": case "h": case "i":
			numero=3;
			break;
			
			case "j": case "k": case "l":
			numero=4;
			break;
			
			case "m": case "n": case "ñ":
			numero=5;
			break;
	
			
			case "o": case "p": case "q":
			numero=6;
			break;
			
			case "r": case "s": case "t":
			numero=7;
			break;
			
			case "u": case "v": case "w":
			numero=8;
			break;
			
			case "x": case "y": case "z":
			numero=9;
			break;
			
			default:
				System.out.println("Eso no es una letra comprendida entre a-z");
				numero=-1;
				contador++;
			}
			if(numero==-1){
				System.out.println("La liaste petarda, se te acumula un fallo");
			}
			if(numero>0 && numero<10){
				//System.out.println(numero);
			System.out.println("La letra introducida :"+ letra+ "  se corresponde al numero:  "+ numero+" has acumulado "+contador+" fallos");
			}
				
			}
	
	}

}
