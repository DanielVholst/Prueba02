import java.util.Scanner;
public class calculo {
private static Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int uno, dos,tres,suma,producto;
teclado=new Scanner(System.in);
System.out.println("Introduce el primer numero");
uno=teclado.nextInt();
System.out.println("Introduce el segundo numero");
dos=teclado.nextInt();
System.out.println("Introduce el tercer numero");
tres=teclado.nextInt();
System.out.println("Has introducido: "+uno+" , "+dos+" , "+tres+"");
System.out.println("");

if(uno<0){
	System.out.println("Se van a multiplicar los tres numeros");
	System.out.println("");

	producto=uno*dos*tres;
	System.out.println("El resultado "+uno+" , "+dos+" , "+tres+" , " +"es: " + producto);
	
}
else{
	System.out.println("Se van a sumar los tres numeros");
	System.out.println("");

	suma=uno+dos+tres;
	System.out.println("El resultado de la suma de "+uno+" , "+dos+" , "+tres+" , " +"es: " + suma);
}


	}

}
