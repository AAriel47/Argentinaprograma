package clase3;
import java.util.Scanner;
import java.util.Arrays;
public class Encriptar {
	static String[] alfabeto = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"," "};
	static String mensaje;
	static int largomensa;
	static int desplazamiento;
	static int i = 0;
	static int ind = 0;
	static String a;
	static String b;
	static String seguir;
	static boolean corregir = false;
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	while (true) {
		/*corregir la uso para solucionar el problema de ingreso por teclado*/
		if (corregir) {
			teclado.nextLine();
		}
		System.out.println("Ingrese el mensaje a codificar, solo letras y espacios:");
		mensaje = teclado.nextLine();
		System.out.println("Ingrese el Número de desplazamiento: 'entre 1 y 5':");
		desplazamiento = teclado.nextInt();
		largomensa = mensaje.length();
		String [] codi =  new String[largomensa];
		String [] mens = mensaje.split("");
		int puntero;
		int deco;
		while (i<=largomensa) {
			a = mens[i];
			while (true) {
				b = alfabeto[ind];
				if (a.equalsIgnoreCase(b)) {
					puntero = (ind+desplazamiento);
					if (puntero<28) {
						codi[i]=alfabeto[(puntero)];
						break;
					}else { deco = (puntero-28);
						codi[i]=alfabeto[deco];
						break;
						}
				}
				ind++;
				}
			i++;
			ind=0;
			if (i==largomensa) {
				System.out.println("Mensaje Codificado: "+Arrays.toString(codi));
				break;
			}

		}
		
		/*Decodificación*/
		
		String[] decodificar = new String[codi.length];
		System.out.println("Ingrese la clave de Decodificación: 'entre 1 y 5':");
		desplazamiento = teclado.nextInt();
		i = 0;
		largomensa = codi.length;
		ind = 0;
		puntero = 0;
		while (i<=largomensa) {
			a = codi[i];
			while (true) {
				b = alfabeto[ind];
				if (a.equalsIgnoreCase(b)) {
					puntero = (ind-(desplazamiento));
					if (puntero>=0) {
						decodificar[i]=alfabeto[(puntero)];
						break;
					}else { deco = (30+(puntero-2));
						decodificar[i]=alfabeto[deco];
						break;
						}
				}
				ind++;
				}
			i++;
			ind=0;
			if (i==largomensa) {
				System.out.println("Mensaje Decodificado: "+Arrays.toString(decodificar));

				break;
			}

		}
		System.out.println("Desea continuar s/n: ");
		seguir = teclado.next().substring(0, 1);
		if("s".equalsIgnoreCase(seguir)) {
			corregir=true;
			i=0;
			continue;
		}else {
			break;
		}
	
	}
	System.out.println("Gracios por participar");
	}
}