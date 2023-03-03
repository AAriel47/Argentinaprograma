package clase3;
import java.util.Scanner;
//import java.util.Arrays;
public class Ejercicio1c {
	static int[] numeros = new int[3];
	static int[] numero = new int[3];
	static boolean seguir = true;
	static int control;
	static int a = 0;
	static int b = 0;
	static int c = 0;
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		while(seguir) {
			System.out.print("Ingrese el primer Número: ");
			numeros[0]=teclado.nextInt();
			System.out.print("Ingrese el segundo Número: ");
			numeros[1]=teclado.nextInt();
			System.out.print("Ingrese el tercer Número:");
			numeros[2]=teclado.nextInt();
			System.out.print("Ingrese el Número de control:");
			control = teclado.nextInt();
			if (control<numeros[0]) { a = numeros[0];}
			if(control<numeros[1]) {b = numeros[1];}
			if(control<numeros[2]){ c= numeros[2];	
				}
			System.out.println("Resultado: "+(a+b+c));
			System.out.println("Desea seguir s/n:");
			String re = teclado.next().substring(0,1);
			if ("s".equalsIgnoreCase(re)) {
				a = 0;
				b = 0;
				c = 0;
				continue;
			}else {break;
			}
		}
		teclado.close();
		System.out.println("Gracias por participar");
	}
}

