package trabajopractico1;
import java.util.Scanner;

public class Corazon {
static float edad;
static float pulsacion;
static String res;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		while(true) {
			System.out.println("Ingrese la edad: ");
			edad = teclado.nextInt();
			pulsacion=(220-edad)/10;
			System.out.println("Las pulsaciones por cada 10 segundos de ejercicio son: "+pulsacion);
			System.out.println("Desea continuar s/n:");
			res=teclado.next();//.substring(0,1);
			if("s".equalsIgnoreCase(res)){
				continue;
			}else {
				break;
			}
		}
		teclado.close();
	}

}
