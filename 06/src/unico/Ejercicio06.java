package unico;

public class Ejercicio06 {

	public static void main(String[] args) {

// Implementar un método que nos diga si un número es primo.

	final String PRIMO = "Es un número primo.";
	final String NOPRIMO = "No es un número primo.";
	int num;
	boolean resultado;
	String mensaje;
	
	num = Util.leerInt("Introduzca un número: ");
	resultado = esPrimo(num);
	
	mensaje = resultado ? PRIMO : NOPRIMO;
	Util.escribir(mensaje);
		
	}
	
	public static boolean esPrimo (int n) {

		boolean esPrimo = true;
		
		for (int i = 2; n <n; i++) {
			if (n%i == 0) {
				esPrimo = false;
			}
		}	
		return esPrimo;
	}
	
}
