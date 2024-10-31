package clases.clase3;

import java.util.Arrays;

public class ArraysyStrings {
    public static void main(String[] args) {
        // Declarar un array de enteros
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        // Declarar un array de strings
        String[] nombres = new String[3];
        nombres[0] = "Juan";
        nombres[1] = "Pedro";
        nombres[2] = "Maria";

        // Declarar un array de enteros con valores
        int[] numeros2 = {1, 2, 3, 4, 5};

        // Declarar un array de strings con valores
        String[] nombres2 = {"Juan", "Pedro", "Maria"};

        // Recorrer un array de enteros
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Recorrer un array de strings
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        // Recorrer un array de enteros con for each
        for (int numero : numeros2) {
            System.out.println(numero);
        }

        // Recorrer un array de strings con for each
        for (String nombre : nombres2) {
            System.out.println(nombre);
        }

        // Declarar un array de enteros de dos dimensiones
        int[][] matriz = new int[2][2];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;

        // Declarar un array de enteros de dos dimensiones con valores
        int[][] matriz2 = {{1, 2}, {3, 4}};

        // Recorrer un array de enteros de dos dimensiones
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
        System.out.println(Arrays.toString(numeros));// esto imprime el array completo

        System.out.println(numeros.length); // esto imprime la longitud del array


        // Strings

        String nombre = "Juan";
        String apellido = "Perez";

        System.out.println(apellido.charAt(0)); // esto imprime la primera letra del apellido

        int longitud = apellido.length(); // esto guarda la longitud del apellido en la variable longitud

        System.out.println(apellido.substring(0, 2)); // esto imprime las primeras dos letras del apellido

        apellido = apellido.toUpperCase(); // esto convierte el apellido a mayusculas

        boolean test = apellido.contains("P"); // esto devuelve true si el apellido contiene la letra P

        String[] partes = apellido.split("e"); // esto divide el apellido en un array de strings en cada ocurrencia de la letra e

        // comparar strings

        if (nombre.equals(apellido)) {
            System.out.println("El nombre es igual al apellido");
        }
    }
}
