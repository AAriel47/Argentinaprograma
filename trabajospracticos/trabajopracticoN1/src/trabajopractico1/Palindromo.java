package trabajopractico1;
import java.util.Scanner;
public class Palindromo {
	static String palabra;
	static String resp;
	static int ultima;
	static int medio;
	static int i = 0;
	static String a;
	static String b;
	static String seguir;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		while (true) {
			System.out.println("Ingrese una palabra:");
			palabra = teclado.next();
			ultima = palabra.length();
			if (palabra.length()%2!=0) {
				medio = (((palabra.length())/2)+1);
				while(true) {
					a = palabra.substring(i, i+1);
					b = palabra.substring(ultima-1, ultima);
					if ((a).equalsIgnoreCase(b)){
						i++;
						ultima--;
						if (ultima==medio) {
							if ((a).equalsIgnoreCase(b)){
								System.out.println("la palabra "+palabra+" es un palindromo");
								break;
							}else {
								System.out.println("la palabra "+palabra+" no es un palindromo");
								break;
							}
						}
					}else {
						System.out.println("la palabra "+palabra+" no es un palindromo");
						break;
					}
				}
			}else {
				medio = (((palabra.length())/2));
				while(true) {
					a = palabra.substring(i, i+1);
					b = palabra.substring(ultima-1, ultima);
					if ((a).equalsIgnoreCase(b)){
						i++;
						ultima--;
						if (ultima==(medio+1)) {
							a = palabra.substring(medio-1,medio);
							b = palabra.substring(medio, medio+1);
							if ((a).equalsIgnoreCase(b)){
								System.out.println("la palabra "+palabra+" es un palindromo");
								break;
							}else {
								System.out.println("la palabra "+palabra+" no es un palindromo");
								break;
							}
						}
					}else {
						System.out.println("la palabra "+palabra+" no es un palindromo");
						break;
					}
				}
			}
			System.out.println("Desea continuar s/n: ");
			seguir = teclado.next().substring(0,1);
			if("s".equalsIgnoreCase(seguir)) {
				i=0;
				ultima=0;
				continue;
			}else {
				System.out.println("gracias por participar".toUpperCase());
				break;
				
			}
		}
		teclado.close();
	}

}
