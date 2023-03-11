package clasen4;

import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio1c {
		// TODO Auto-generated method stub
		static String opcion;
		static int[] numeros = new int[3];
		static int[] numero = new int[3];
		static boolean seguir = true;
		static int o = 0;
		static int repe = 0;
		static int valor;
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
						numero=numeros.clone();
				break;
			default: System.out.println("Opción invalida");	
			}
			comparar(numero);

		}
		
		public static void comparar(int []numero) {

				if (numero[0]==numero[1]&&numero[0]==numero[2] ) {
					valor=numero[0];
					repe=3;
				}else if(numero[0]==numero[1]){
					valor=numero[0];
					repe=2;
				}else if(numero[0]==numero[2]){
					valor=numero[0];
					repe=2;
				}else if(numero[1]==numero[2]){
					valor=numero[1];
					repe=2;
				}else {
					repe = 0;
				}
				mensaje(valor, repe);

		}
		public static void mensaje(int valor, int repe) {
			if (repe!=0) {
				System.out.println("El número "+valor+" se repite "+repe+" veces");
			}else {
				System.out.println("No se repite ningun Número");
			}

		}
}
