package trabajopractico1;
import java.util.Scanner;
public class ValorAbsoluto {
static float numero;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		while(true) {
			System.out.println("Ingrese un numero con positivo o negativo");
			numero=teclado.nextFloat();
			System.out.println("Numero ingresado: "+numero+" valor absoluto: "+Math.abs(numero));
			System.out.println("Desea continuar s/n:");
			if ("s".equalsIgnoreCase((teclado.next().substring(0,1)))){
				continue;
			}else {
				break;
			}
		}
		teclado.close();

	}

}
