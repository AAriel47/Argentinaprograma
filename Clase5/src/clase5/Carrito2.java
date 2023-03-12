package clase5;
import java.util.Arrays;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Path;
public class Carrito2 {
	//programa para cargar productos en base.txt y realizar una venta
	static double importe;
	static double importe2;
	static String res;
	static String resul;
	static String resul2;
	static int codigo;
	static String codigo2;
	static String articulo;
	static double precio;
	static double descuento;
	static String cargar;
	static String [] producto;
	static String cargar2;
	static boolean salir=false;
	static boolean salir2=true;
	static String cantidad;
	static Path venta1 = Paths.get("ventas1.txt");
	static Path productos1 = Paths.get("productos1.txt");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		while(salir2) {

			System.out.println("producto de limpieza".toUpperCase());
			System.out.println("Ejemplo: Detergente, Lavandina 'codigo 1 - 30");
			System.out.println("producto de Higiene personal".toUpperCase());
			System.out.println("Ejemplo: Shampoo, Pasta dental 'codigo 31 y 60");
			System.out.println("Presione 'a' Cargar los productos en productos.txt - 'c' Imprimir productos");
			System.out.println("Presione 'b' Realizar una venta - 'd' Imprimir ventas");
			System.out.println("Presione 's'Salir ");
			switch (res=teclado.next().substring(0,1).toLowerCase()) {
				case "a": 
						System.out.println("Articulo:");
						teclado.nextLine();
						articulo=teclado.nextLine();
						System.out.println("Codigo: ");
						codigo2=teclado.next();
						//try
							try {
								if(!Files.exists(productos1)) {
									Files.createFile(productos1);
								}else {
									for(String linea:Files.readAllLines(productos1)) {
										cargar = linea;
									}
									String [] codigo1 = cargar.split(" ");
									for (int i = 0; i<codigo1.length;i++) {
										if ((codigo1[i]).equals(codigo2)){
												System.out.println("codigo existente".toUpperCase());
												System.out.println("presione cualquier tecla y luego enter".toUpperCase());
												teclado.next();	
												salir = true;
												break;
										}
									}
									if (salir) {
										salir = false;
										continue;
									}
									}
								}
							
							catch(IOException e) {
								System.err.print(e);
							}
					
						//final try
						codigo = Integer.valueOf(codigo2);
						System.out.println("Precio: ");
						precio=teclado.nextDouble();
						System.out.println("Descuento");
						descuento=teclado.nextDouble();
						Articulos Arti = new Articulos(articulo, codigo, precio, descuento);
						resul = Arti.cargaArt(articulo, codigo, precio, descuento);
						try {
							if(!Files.exists(productos1)) {
								Files.createFile(productos1);
							}else {
								for(String linea:Files.readAllLines(productos1)) {
									cargar = linea;
								}
							}
							if ("".equals(cargar)) {
								Files.writeString(productos1, cargar);
							}else {
								cargar = cargar+" - "+resul;
								Files.writeString(productos1,cargar);
							}
						}
						catch(IOException e){
							System.err.print(e);
						}
						break;
				case "b": 
						//try
						System.out.println("Codigo: ");
						codigo2=teclado.next();
						try {
							if(!Files.exists(productos1)) {
								System.out.println("El archivo productos.txt no tiene productos cargados");
								System.out.println("Presione cualquier tecla y luego enter");
								teclado.next();
								continue;
							}else {
								for(String linea:Files.readAllLines(productos1)) {
									cargar = linea;
								}
								String [] codigo1 = cargar.split(" ");

								for (int i = 0; i<codigo1.length;i++) {
									if ((codigo1[i]).equals(codigo2)){
										codigo = Integer.valueOf(codigo2);
										i++;
										System.out.println(codigo1[i]);
										i++;
										articulo=" ";
										while (true) {
											if ("Precio:".equals(codigo1[i])) {
												break;
											}
											articulo= articulo+" "+String.valueOf(codigo1[i]);
											i++;
										}
										
										//i++;
										System.out.println(articulo);
										System.out.println(codigo1[i]);
										i++;
										System.out.println(codigo1[i]);
										precio=Double.valueOf(codigo1[i]);
										i++;
										System.out.println(codigo1[i]);
										i++;
										System.out.println(codigo1[i]);
										descuento=Double.valueOf(codigo1[i]);
										System.out.println("Cantidad: ");
										cantidad = teclado.next();
										System.out.println("Importe a pagar:");
										if(descuento>0) {
											importe = (precio-(precio*(descuento/100)))*Double.valueOf(cantidad);
										}else {
											importe = (precio*Double.valueOf(cantidad));
										}
										System.out.println(importe);
										System.out.println("Presione cualquier tecla y luego enter");
										teclado.next();												
										break;
									}else if(i==codigo1.length-1) {
										System.out.println("Producto inexistente, presione cualquier tecla y luego enter");
										teclado.next();
										salir = true;
										break;
									}
								}
								if (salir) {
									continue;
								}
								}
							}
						
						catch(IOException e) {
							System.err.print(e);
						}
					
					
						//fintry

						Articulos ventas1 = new Articulos(articulo, codigo, precio, descuento, importe);
						resul2 = ventas1.cargaVen(articulo, codigo,  precio, descuento, importe);
						try {
							if(!Files.exists(venta1)) {
								Files.createFile(venta1);
							}else {
								for(String linea2:Files.readAllLines(venta1)) {
									cargar2=linea2;
								}
							}
							if("".equals(cargar2)) {
								Files.writeString(venta1, cargar2);
							}else {
								cargar2 = cargar2+" - "+resul2;
								Files.writeString(venta1, cargar2);
							}
							
						}
						catch(IOException e){
							System.err.print(e);
						}
						break;
				case "c":
						try {
							if(!Files.exists(productos1)) {
								System.out.println("No se cargaron productos hasta el momento");
								System.out.println("presione cualquier tecla y luego enter".toUpperCase());
								teclado.next();
								continue;
							}else {
								for(String linea:Files.readAllLines(productos1)) {
									cargar = linea;
								}
	
							}
						}
						catch(IOException e){
							System.err.print(e);
						}
						String [] producto = cargar.split(" ");//cargar.substring(1,cargar.length()-1);
						for (int e = 0; e<producto.length;e++) {
							if ("-".equals(producto[e])){
								e++;
								System.out.println(" salto de linea ");
							}
							System.out.print(producto[e]+" ");
						}
						System.out.println(" ");
						System.out.println("final de informe de Articulos".toUpperCase());
						System.out.println("presione cualquier tecla y luego enter ".toUpperCase());
						teclado.next();
						break;
				case "d":
					try {
						if(!Files.exists(venta1)) {
							System.out.println("No se cargaron productos hasta el momento");
							System.out.println("presione cualquier tecla y luego enter".toUpperCase());
							teclado.next();
							continue;
						}else {
							for(String linea:Files.readAllLines(venta1)) {
								cargar = linea;
							}

						}
					}
					catch(IOException e){
						System.err.print(e);
					}
					String [] producto1 = cargar.split(" ");//cargar.substring(1,cargar.length()-1);
					for (int f = 0; f<producto1.length;f++) {
						if ("-".equals(producto1[f])){
							f++;
							System.out.println(" salto de linea ");
						}
						System.out.print(producto1[f]+" ");
					}
					System.out.println(" ");
					System.out.println("final de informe de Ventas".toUpperCase());
					System.out.println("presione cualquier tecla y luego enter ".toUpperCase());
					teclado.next();
					break;
					
				case "s": salir2=false;
							continue;
				
				default: System.out.print("Opción no valida".toUpperCase());
				System.out.println(" ");
			}
		}
		teclado.close();
	}

}
