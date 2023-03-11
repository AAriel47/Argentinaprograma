package trabajopractico1;
import java.util.Scanner;

public class HorasTrabajadas {
static String nombre;
static String apellido;
static int sueldo;
static int diastrabajados;
final static int suellimpieza = 1500;
final static int sueladministracion = 2500;
final static int suelvendedor = 2700;
final static int suelgerente = 3000;
static String seccion;
static String resp;
static String resp2;
static String resp3;
static int i;
static boolean corregir = false;

static String[] datos = new String[20];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
while(true) {
	if (corregir==true) {
		teclado.nextLine();
	}
	System.out.print("| Nombres del empleado:  ");
	nombre = teclado.nextLine().toUpperCase();
	System.out.print("| Apellido del empleado: ");
	apellido = teclado.nextLine().toUpperCase();
	System.out.println("| Sección del empleado:limpieza, administracion, vendedor, gerente  ");
	seccion = teclado.next().toUpperCase();
	System.out.println("| Días trabajados:     ");
	diastrabajados = teclado.nextInt();
	switch (seccion) {
	case "LIMPIEZA": sueldo = diastrabajados*suellimpieza;
		break;
	case "ADMINISTRACION": sueldo = diastrabajados*sueladministracion;
		break;
	case "VENDEDOR": sueldo = diastrabajados*suelvendedor;
		break;
	case "GERENTE": sueldo = diastrabajados*suelgerente;
		break;
	default: System.out.println("Sección inexistente, intentelo otra vez");
	corregir = true;
	continue;
	}
	System.out.println("Sueldo del empelado:     $ "+sueldo);
	System.out.print("Desea grabar s/n:");
	resp = teclado.next();
	
	if (i<=datos.length-1) {
		if ("s".equalsIgnoreCase(resp)) {
			datos[i]=nombre;
			i++;
			datos[i]=apellido;
			i++;
			datos[i]=seccion;
			i++;
			datos[i]=String.valueOf(diastrabajados);
			i++;
			datos[i]=String.valueOf(sueldo);
			i++;
			System.out.println("Si se grabo el registro");
		}else {
			System.out.println("No se grabo el registro");
			corregir = true;
			continue;
		}
	}else {
		System.out.println("Registro lleno".toUpperCase());
	}
	System.out.println("Desea continuar s/n:");
	resp2= teclado.next();
	if("s".equalsIgnoreCase(resp2)) {
		System.out.println("Desea imprimir un resumen s/n:");
		resp3 = teclado.next();
		if ("s".equalsIgnoreCase(resp3)) {
			resumen();
			teclado.next();
		}
		corregir = true;
		continue;
	}else {System.out.println("como ultima operacion se imprime el resumen".toUpperCase());
			resumen();
	}
	break;
}
teclado.close();
	}
	public static void resumen() {
		int e = 0;
		int lin = 0;
		while (e<=i-1){
			System.out.print(datos[e]+" - ");
			lin =datos[e].length()+lin;
			e++;
			System.out.print(datos[e]+" - ");
			lin =datos[e].length()+lin;
			e++;
			System.out.print(datos[e]+" - ");
			lin =datos[e].length()+lin;
			e++;
			System.out.print(datos[e]+" - ");
			lin =datos[e].length()+lin;
			e++;
			System.out.print(datos[e]+" - ");
			lin =datos[e].length()+lin;
			e++;
			System.out.println("");
			System.out.print("_".repeat(lin+15));

			System.out.println(" ");
			lin = 0;
			
		}
	System.out.println("Pulse cualquier letra y presione enter para continuar...");
	
	}
	
}
