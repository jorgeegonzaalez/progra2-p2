package aplicacion; 

import mates.Matematicas;

/**
 * Esta clase contiene el programa principal.
 */
public class Principal {

	/**
	 * Método que se ejecuta al iniciar el programa, que recibe el número de pasos de la línea de comandos.
	 *
	 * @param args Se espera un único argumento, el número de pasos.
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Uso: java Principal <numero_de_pasos>");
			System.exit(1);
		}

		long pasos = Long.parseLong(args[0]);

		System.out.println("El número Pi es " + Matematicas.generarNumeroPiRecursivo(pasos));
	}
}
