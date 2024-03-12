package mates; 
import java.util.Random; 

/**
 * La clase Matemáticas contiene métodos matemáticos, que incluyen la aproximación al número Pi.
 */
public class Matematicas {

	/**
	 * Genera una aproximación al número Pi mediante el método Montecarlo de forma recursiva, el parámetro pasos son los puntos generados. 
	 * @param pasos Es la cantidad de puntos que se generan para la estimación del número Pi.
	 * @return Aproximación del número Pi por el método de Montecarlo.
	 */
	public static double generarNumeroPiRecursivo(long pasos) {
		return generarNumeroPiRecursivo(pasos, 0, 0);
	}

	private static double generarNumeroPiRecursivo(long pasos, long dentroCirculo, long totalPuntos) {
		if (pasos == 0) {
			return 4.0 * dentroCirculo / totalPuntos; 
		}

		Random random = new Random();
		double x = random.nextDouble();
		double y = random.nextDouble();
		double distancia = Math.sqrt(x * x + y * y);

		if (distancia <= 1) {
			dentroCirculo++;
		}

		return generarNumeroPiRecursivo(pasos - 1, dentroCirculo, totalPuntos + 1);
	}
}
