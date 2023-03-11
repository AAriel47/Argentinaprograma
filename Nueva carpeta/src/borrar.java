import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Clases4Ejercicio3 {
	static String[] alfabeto = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"," "};
	static String mensaje;
	static int largomensa;
	static int desplazamiento;
	static int i = 0;
	static int ind = 0;
	static String a;
	static String b;
	static char aa;
	static String seguir;
	static int puntero;
	static int deco;
	static String nume;
	static String resp;

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);

		Path code = Paths.get("codificado.txt");
		Path decode = Paths.get("decodificado.txt");
		while (true) {

				System.out.println("Desea codificar 'a' o decodificar 'b'");
				resp = teclado.nextLine();
				if("a".equalsIgnoreCase(resp.substring(0,1))) {
					System.out.println("Ingrese el mensaje a codificar, solo letras y espacios:");
					mensaje = teclado.nextLine().toLowerCase();
					System.out.println("Ingrese el Número de desplazamiento: 'entre 1 y 5':");
					desplazamiento = teclado.nextInt();
					largomensa = mensaje.length();
					String [] codi =  new String[largomensa+1];
					String [] mens = mensaje.split("");
					System.out.println("mensaje"+Arrays.toString(mens));
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
							codi[i]= String.valueOf(desplazamiento);
							String codificacion = Arrays.toString(codi);
							System.out.println("puto"+codificacion);
							try {	
								if (!Files.exists(code)) {
									Files.createFile(code);
								}
								Files.writeString(code,codificacion );
							}
							catch(IOException e) {
								System.err.println(e);
							}
							System.out.println("Mensaje Codificado: "+Arrays.toString(codi));
							break;
						}
					}
				}else if("b".equalsIgnoreCase(resp.substring(0,1))) {
					/*Decodificación*/
					//try {
						if (!Files.exists(code)) {
							System.out.println("El archivo codificado.txt no existe");
						}else {
							try{
								for(String linea:Files.readAllLines(code)){
									nume = linea;
								}
								String nume1 = nume.substring(1,nume.length()-1);
								String[] decodificar = nume1.split(", ");
								//char[] decodificar = nume.toCharArray();
					
								String ultimo = nume.substring(nume.length()-2,nume.length()-1);
								int c = 0;
								int n = 0;
								for(int e = 0; e<decodificar.length;e++) {
									if("["!=decodificar[e]) {
										if(","!=decodificar[e]){
											if ("]"!=decodificar[e]){
												n = e;
												if ((" "==decodificar[e])&&(" "==decodificar[n++])){
													c++;
												}else if (" "!=decodificar[e]) {
													c++;
												}
											}
										}
					
									}
								}
								int m = 0;
								int g = 0;
								c=c-1;
								String[] decomen = new String[c];
								for(int f = 0; f<decodificar.length-1;f++) {
									if("["!=decodificar[f]) {
										if(","!=decodificar[f]){
											m = f;
											if((" "==decodificar[f])&&(" "==decodificar[m++])){
												decomen[g]=decodificar[f];
												g++;
												if(g==c) {
													break;
												}
											}else if (" "!=decodificar[f]) {
												decomen[g]=decodificar[f];
												g++;
												if(g==c) {
													break;
												}
			
											}
										}
									}
									
								}
								System.out.println("rsu"+Arrays.toString(decomen));
								System.out.println("Ingrese la clave de Decodificación, el Número de desplazamiento: 'entre 1 y 5':");
								desplazamiento = teclado.nextInt();
								i = 0;
								ind=0;
								String[] mensaje = new String[c];
								System.out.println("sssxxxs"+ultimo);
								if(String.valueOf(ultimo).equals(String.valueOf(desplazamiento))) {
									while (i<=c) {
										a = String.valueOf(decomen[i]);
										while (true) {
											b = alfabeto[ind];
											System.out.println("ssss"+String.valueOf(decomen[i])+"xx"+b);

											if (a.equalsIgnoreCase(b)) {
												puntero = (ind-(desplazamiento));
												if (puntero>=0) {
													mensaje[i]=alfabeto[puntero];
													break;
												}else { deco = (30+(puntero-2));
													mensaje[i]=alfabeto[deco];
													break;
												}
											}
											ind++;
											System.out.println("ind"+ind);
										}
										System.out.println("Mensaje Decodificado1: "+Arrays.toString(mensaje));
	
										i++;
	
										ind=0;
										System.out.println("iiii"+i+"c"+c);
										
										
										try {	
											if (!Files.exists(decode)) {
												Files.createFile(decode);
											}
											Files.writeString(decode,Arrays.toString(mensaje) );
										}
										catch(IOException e) {
											System.err.println(e);
										}
									
										
										if (i==c) {
											System.out.println("Mensaje Decodificado2: "+Arrays.toString(mensaje));
											break;
										}
									}
								}else{
									System.out.println("La clave es erronea...".toUpperCase());
								}
							}
							catch (IOException e) {
								System.err.println(e);
							}
						}
			}
			System.out.println("Desea continuar s/n: ");
			teclado.nextLine();
	
			seguir = teclado.nextLine();
			System.out.println("seguir"+seguir);
			if("s".equalsIgnoreCase(seguir.substring(0,1))) {
				i=0;

				continue;
			}else {
				System.out.println("mierda");
	
				break;
			}
		}
		teclado.close();
		System.out.println("Gracios por participar");
	}
}
/*

*/