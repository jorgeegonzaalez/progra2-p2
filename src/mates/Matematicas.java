package mates;

import java.util.Random;

/**
 * Clase que proporciona métodos matemáticos, incluyendo la generación de aproximaciones al número Pi.
 */
public class Matematicas {

    /**
     * Constructor por defecto de la clase Matematicas.
     * No se requiere inicialización especial en este caso.
     */
    public Matematicas() {
        // No se requiere inicialización especial en este caso.
    }

    /**
     * Genera una aproximación al número Pi mediante el método de Montecarlo de forma recursiva.
     * El parámetro `pasos` indica el número de puntos generados.
     *
     * @param pasos Número de puntos generados para la aproximación.
     * @return Aproximación al número Pi.
     */
    public static double generarNumeroPiRecursivo(long pasos) {
        return generarNumeroPiRecursivoAux(pasos, 0, 0, new Random());
    }

    /**
     * Método auxiliar recursivo para generar una aproximación de Pi mediante el método de Montecarlo.
     *
     * @param pasos             Número total de puntos generados.
     * @param puntosDentroCirculo Cantidad de puntos dentro del círculo.
     * @param pasosActuales     Número actual de pasos realizados.
     * @param random            Objeto Random para generar valores aleatorios.
     * @return Aproximación actualizada al número Pi.
     */
    private static double generarNumeroPiRecursivoAux(long pasos, long puntosDentroCirculo,
                                                      long pasosActuales, Random random) {
        // Caso base: Se han generado todos los puntos o se alcanzó el límite de pasos.
        if (pasosActuales == pasos) {
            return 4.0 * puntosDentroCirculo / pasos;
        }

        // Generar un punto aleatorio.
        double x = random.nextDouble();
        double y = random.nextDouble();

        // Calcular la distancia al centro del círculo.
        double distanciaAlCentro = x * x + y * y;

        // Verificar si el punto está dentro del círculo.
        if (distanciaAlCentro <= 1) {
            puntosDentroCirculo++;
        }

        // Llamada recursiva con el siguiente paso.
        return generarNumeroPiRecursivoAux(pasos, puntosDentroCirculo, pasosActuales + 1, random);
    }
}

