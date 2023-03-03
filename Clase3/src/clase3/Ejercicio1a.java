package clase3;
import java.util.Scanner;
public class Ejercicio1a {
/*Declaración de variables*/
	static String carac;
	static String palabra;
	static boolean seguir = true;
	static int numeros[]= new int[3];
	static int cont = 0;
	static int contc = 0;
	static int i = 1;
	static boolean men = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		while (seguir) {
			/* la variable men es para corregir un error que produce java al usar teclado.nextLine*/
			if (men) {teclado.nextLine();}
			System.out.print("Ingrese una palabra:");
			palabra = teclado.nextLine();
			System.out.println("Ingrese letra:");
			carac = teclado.nextLine();
			while (i<=(palabra.length())) {
				if ((carac.substring(0, 1)).equals(palabra.substring(cont,i )) ) {
					contc++;
				}
				cont++;
					i++;	
				}
			System.out.println("la letra '"+carac+"'"+" aparece "+contc);
			System.out.print("Desea seguir participando s/n:");
			String resp = teclado.next();
			if ("s".equalsIgnoreCase(resp.substring(0, 1))) {
				cont = 0;
				contc = 0;
				i = 1;
				 men = true;
				/*limpiar pantalla*/
					teclado.reset();
				continue;}
			else {
				break;
				}
		}
		System.out.println("Adios, gracias por participar");

	}

}
