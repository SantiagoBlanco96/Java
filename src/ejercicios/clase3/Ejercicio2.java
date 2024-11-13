package ejercicios.clase3;

import java.util.Scanner;

public class Ejercicio2 {

    private static final String ABC = "abcdefghijklmnñopqrstuvwxyz ";

    public static String codificar(String frase){
        char letra;
        int index;
        StringBuilder resultado = new StringBuilder();
        int desplazamiento = 2;

        for (int i=0; i<frase.length(); i++){
            letra = frase.charAt(i);
            index = ABC.indexOf(letra)+ desplazamiento;
            if(ABC.length()<=index){
                index = index - ABC.length();
            }
            resultado.append(ABC.charAt(index));
        }

        frase = resultado.toString();

        return frase;
    }
    public static String decodificar(String frase){
        char letra;
        int index;
        StringBuilder resultado = new StringBuilder();
        int desplazamiento = 2;

        for (int i=0; i<frase.length(); i++){
            letra = frase.charAt(i);
            index = ABC.indexOf(letra) - desplazamiento;
            if(index<0){
                index = index + ABC.length();
            }
            resultado.append(ABC.charAt(index));
        }

        frase = resultado.toString();

        return frase;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        char accion;

        System.out.println("Programa de codificacion y decodificacion");
        System.out.println("Si quiere codificar ingrece \"C\", si quiere decodificar ingrese \"D\"");
        accion = sc.next().charAt(0);
        accion = Character.toLowerCase(accion);

        while (accion != 'c' && accion!='d'){
            System.out.println("No ha ingresado una opcion correcta, vuelva a ingresar");
            accion = Character.toLowerCase(sc.next().charAt(0));
        }

        sc.nextLine();
        System.out.println("Ingrese la frase que desea codificar o decodificar");
        frase = sc.nextLine().toLowerCase();

        if (accion=='c'){
            System.out.println(codificar(frase));
        } else {
            System.out.println(decodificar(frase));
        }
    }
}
