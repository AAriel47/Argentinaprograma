package trabajopractico1;
import java.util.Scanner;
public class DensidaddePoblacion {
	static float poblacion;
	static float superficie;
	static float densidad;
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		while(true) {
			System.out.println("Ingrese la cantidad de población: ");
			poblacion=teclado.nextFloat();
			System.out.println("Ingrese la superficie:");
			superficie=teclado.nextFloat();
			densidad = poblacion/superficie;
			System.out.println("la cantidad de habitantes por km/2 es: "+densidad);
			System.out.println("Desea continuar s/n: ");
			if("s".equalsIgnoreCase((teclado.next().substring(0,1)))) {
				continue;
			}else {
				break;
			}
		}
		teclado.close();
		
	}

}
