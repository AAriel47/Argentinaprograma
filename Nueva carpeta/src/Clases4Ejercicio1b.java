
import java.util.Arrays;
import java.util.Scanner;
public class Clases4Ejercicio1b {
		// TODO Auto-generated method stub
		static String opcion;
		static int[] numeros = new int[3];
		static int[] numero = new int[3];
		static boolean seguir = true;
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			while(seguir) {
				System.out.print("Ingrese el primer Número: ");
				numeros[0]=teclado.nextInt();
				System.out.print("Ingrese el segundo Número: ");
				numeros[1]=teclado.nextInt();
				System.out.print("Ingrese el tercer Número:");
				numeros[2]=teclado.nextInt();
				System.out.print("Seleccione 'a' de mayor a menor y 'b' para menor a mayor");
				opcion = teclado.next().substring(0,1);
				comparar(numeros[0],numeros[1], numeros[2], opcion);
			
				System.out.println("Desea seguir s/n:");
				String re = teclado.next().substring(0,1);
				if ("s".equalsIgnoreCase(re)) {
					continue;
				}else {break;
				}
			}
			teclado.close();
			System.out.println("Gracias por participar");
	}

		public static void comparar(int a, int b, int c, String opcion) {
			switch (opcion) {
			case "a": for(int i=0; i<=2;i++) {
					if ((a>b)&&(a>c)){
						numero[0]=a;
						if(b>c) {
							numero[1]=b;
							numero[2]=c;
						}else {
							numero[1]=c;
							numero[2]=b;
						}
					}else {
						if (b>c) {
							numero[0]=b;
							if (a>c) {
								numero[1]=a;
								numero[2]=c;
							}else {
								numero[1]=c;
								numero[2]=a;
							}
						}else {
							numero[0]=c;
							if (a>b) {
								numero[1]=a;
								numero[2]=b;
							}else {
								numero[1]=b;
								numero[2]=a;
							}
							
						}
					}
				}
						System.out.println("Números de mayor a menor: " + Arrays.toString(numero));
					break;
			case "b":  Arrays.sort(numeros);
						System.out.println("Números de menor a mayor: " + Arrays.toString(numeros));
				break;
			default: System.out.println("Opción invalida");	
			}
		}
}
