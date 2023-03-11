package trabajopractico1;
import java.util.Scanner;
public class ConversionDolar {
static double dolar;
static int euro;
static final double unidad= 1.06;//1 EUR Es igual a 1.06 Dólar

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		while(true) {
			System.out.println("unidad de cambio '1 EUR Es igual a 1.06 Dólar'");
			System.out.println("Cantidad de Euros: ");
			euro = teclado.nextInt();
			dolar = euro*unidad;
			System.out.println(euro+" Euro/s es a "+dolar+" dolar/es");
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
