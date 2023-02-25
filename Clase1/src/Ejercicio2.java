import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		int ingTotal;
		int vehTotal;
		int vehfec;
		int inmueble;
		String embarcacion;
		String avion;
		String activos;
		boolean seguir = true;
		
		while(seguir) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingreso total mensual: ");
			ingTotal = teclado.nextInt();
			System.out.println("Cantidad de vehículos:");
			vehTotal = teclado.nextInt();
			System.out.println("antiguedad:");
			vehfec = teclado.nextInt();
			System.out.println("Inmuebles:");
			inmueble = teclado.nextInt();
			System.out.println("Posee embarcación S/N:");
			embarcacion = teclado.next();
			System.out.println("Posee aeronave de lujo S/N:");
			avion = teclado.next();
			System.out.println("Posee activos societarios S/N:");
			activos = teclado.next();
			if ((ingTotal >= 489083)|| (vehTotal>=3)|| (vehfec<5)||(inmueble>=3)||("s".equalsIgnoreCase(embarcacion))||("s".equalsIgnoreCase(avion))||("s".equalsIgnoreCase(activos)))
									{System.out.println("INGRESOS ALTOS");
			}else {System.out.println("INGRESOS BAJOS");}
		
			System.out.println("Desea Continuar S/N:");
			String resp = teclado.next();
			seguir = "s".equalsIgnoreCase(resp)?true:false;
			if(seguir) {continue;
			}else {break;}
		}
	}

}
