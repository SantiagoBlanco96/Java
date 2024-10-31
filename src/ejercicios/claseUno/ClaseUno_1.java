package ejercicios.claseUno;

public class ClaseUno_1 {
    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;
        boolean esPar = false;

        // Imprimir los numeros entre dos enteros
        int i = numeroInicio;
        while (i <= numeroFin) {
            System.out.println(i);
            i++;
        }

        // Solo mostrar los pares
        i=numeroInicio;
        while (i <= numeroFin) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // Mostrar pares o impares dependiendo de una variable
        i=numeroInicio;
        while (i <= numeroFin) {
            if (esPar) {
                if (numeroInicio % 2 == 0) {
                    System.out.println(i);
                }
            } else {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
            i++;
        }
    }
}
