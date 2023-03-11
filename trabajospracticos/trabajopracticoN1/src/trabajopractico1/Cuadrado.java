package trabajopractico1;
import java.util.Scanner;
public class Cuadrado {
static double base;
static double cuadrado;
static String resp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		while (true) {

			System.out.println("Ingrese un número:");
			base = teclado.nextDouble();
			cuadrado = Math.pow(base, 2);
			System.out.println("Cuadrado del número:"+cuadrado);
			System.out.println("Desea continuar s/n:");
			resp = teclado.next().substring(0,1);
			if("s".equalsIgnoreCase(resp)) {
				continue;
			}else {
				break;
			}
		}
		teclado.close();
	}

}
