package trabajopractico1;
import java.util.Scanner;
public class AreaCuadrada2 {
static double catetoa;
static double catetob;
static double hipo;
static int lado;//lado del cuadrato
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		while(true) {
			System.out.println("Ingreso de lo catetos del triángulo".toUpperCase());
			System.out.println("Ingrese el Cateto A:");
			catetoa = teclado.nextInt();
			System.out.println("Ingrese el Cateto B:");
			catetob = teclado.nextInt();
			hipo=Math.sqrt(Math.pow(catetoa,2)+Math.pow(catetob, 2));
			System.out.println(hipo);
			if (hipo>200) {
				System.out.println("Calculo del Area del cuadadro".toUpperCase());
				System.out.println("el Área del cuadrado de lados: ".toUpperCase()+hipo+" es: "+Math.pow(hipo, 2));
			}else {
				System.out.println("Calculo del Area del cuadadro".toUpperCase());
				System.out.println("el Área del cuadrado de lados: ".toUpperCase()+hipo+" es: "+(hipo*2));
		}
			System.out.println("Desea continuar s/n");
			if ("s".equalsIgnoreCase((teclado.next().substring(0,1)))){
				continue;
			}else {
				System.out.println("Gracias por participar");
				break;
			}
		}
		teclado.close();
	}

}