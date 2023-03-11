package clasen4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2a {
	static String acumula;
	static String nume;
	static String sumac;
	static String[] nume1;
	static String datos;
	static String valor;
	static int suma;
	static String[] resultado= new String[20];
	public static void main(String[] args) {
		Path ruta = Paths.get("numeros.txt");
		Path rutaresultado = Paths.get("resultados.txt");
	// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		while(true) {
			System.out.println("Ingrese los números separados por coma");
			String datos = teclado.next();
			try {
				if (!Files.exists(ruta)) {
					Files.createFile(ruta);
				}
				Files.writeString(ruta,datos );
			}
			catch(IOException e) {
				System.err.println(e);
			}
			try{
				for(String linea:Files.readAllLines(ruta)){
					nume = linea;
				}
				String numeros[] = nume.split(",");
				for(int i=0;i<numeros.length;i++) {
					valor = numeros[i];
					suma = suma+ Integer.parseInt(valor);
				}
				System.out.println(" la suma de los numeros "+Arrays.toString(numeros)+" da: "+suma);
				
			}
			catch(IOException e) {
				System.err.println(e);
			}
			
			//guardar en resultado.txt
			sumac=String.valueOf(suma);
			try {
				if (Files.exists(rutaresultado)) {
					for(String lineas:Files.readAllLines(rutaresultado)){
					acumula = lineas;
							}
				}else {
					Files.createFile(rutaresultado);
					nume="";
				}
				if (nume=="") {Files.writeString(rutaresultado, sumac);
				}else {
					acumula = acumula+","+sumac;
					Files.writeString(rutaresultado, acumula);
				}
			}
			catch(IOException e) {
				System.err.println(e);
			}
			
			try{
				for(String linea1:Files.readAllLines(rutaresultado)){
					System.out.println("Los resultados obtenidos hasta el momento son: "+linea1);

				}
			}
			catch(IOException e) {
				System.err.println(e);
			}
			System.out.println("Desea continuar s/n:");
			if((teclado.next().substring(0, 1)).equalsIgnoreCase("s")) {
				suma=0;
				continue;
			}else {
				break;
			}
		}
			teclado.close();
		}
}

