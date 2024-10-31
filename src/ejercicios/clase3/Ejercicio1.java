package ejercicios.clase3;
import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
        //el String

        String palabra = "hola";
        char letra = 'a';
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra " + letra + " aparece " + contador + " veces en la palabra " + palabra);

        // Dados 3 números y un orden (ascendente o decreciente) que ordene los
        //mismos y los retorne en un vector de 3

        int[] numeros = {3, 1, 2};
        String orden = "ascendente";
        int[] numerosOrdenados = new int[3];

        if (orden.equals("ascendente")) {
            Arrays.sort(numeros);
        } else if (orden.equals("descendente")) {
            Arrays.sort(numeros);
            int[] numerosAux = new int[3];
            for (int i = 0; i < numeros.length; i++) {
                numerosAux[i] = numeros[numeros.length - 1 - i];
            }
            numeros = numerosAux;
        }


    }
}
