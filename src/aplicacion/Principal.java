package aplicacion;

import mates.Matematicas;

public class Principal {
    public static void main(String[] args) {
        int pasos = Integer.parseInt(args[0]);

        System.out.println("El número PI (Iterativo) es " + Matematicas.generarNumeroPiIterativo(pasos));

       System.out.println("El número PI (Recursivo) es " + Matematicas.generarNumeroPiRecursivo(pasos));
    }
}
