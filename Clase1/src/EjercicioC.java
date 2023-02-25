
public class EjercicioC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int numeroInicio = 5;
int numeroFin = 14;
//al cambiar el valor de la variable par (true o false) se imprimen los números pares o impares
boolean par = false;
while (numeroInicio<=numeroFin){
	if (par==true) {
		if (numeroInicio%2==0) {
			System.out.println("Numero pares: "+numeroInicio);
		}
	}
	else {
		if (numeroInicio%2!=0) {
			System.out.println("Numero impares: "+numeroInicio);
		}
	}
	numeroInicio++;
}
}
}
