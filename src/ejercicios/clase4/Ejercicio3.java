package ejercicios.clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio3 {
    private static final String ABC = "abcdefghijklmnñopqrstuvwxyz ";

    public static String codificar(String frase, int ix){
        char letra;
        int index;
        StringBuilder resultado = new StringBuilder();

        for (int i=0; i<frase.length(); i++){
            letra = frase.charAt(i);
            index = ABC.indexOf(letra)+ ix;
            if(ABC.length()<=index){
                index = index - ABC.length();
            }
            resultado.append(ABC.charAt(index));
        }

        frase = resultado.toString();

        return frase;
    }
    public static String decodificar(String frase, int ix){
        char letra;
        int index;
        StringBuilder resultado = new StringBuilder();

        for (int i=0; i<frase.length(); i++){
            letra = frase.charAt(i);
            index = ABC.indexOf(letra) - ix;
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
        int indice = 11;

        System.out.println("Programa de codificacion y decodificacion");
        System.out.println("Si quiere codificar ingrece \"C\", si quiere decodificar ingrese \"D\"");
        accion = sc.next().charAt(0);
        accion = Character.toLowerCase(accion);

        while (accion != 'c' && accion!='d'){
            System.out.println("No ha ingresado una opcion correcta, vuelva a ingresar");
            accion = Character.toLowerCase(sc.next().charAt(0));
        }
        while (indice <= 0 || indice >= 10) {
            System.out.println("Ingrese un indice de codificación entre 0 y 10");
            indice = sc.nextInt();
        }

        try{
            for (String linea : Files.readAllLines(Paths.get("src//ejercicios//clase4//texto.txt"))){
                if (accion=='c'){
                    System.out.println(codificar(linea, indice));
                    Files.writeString(Paths.get("src//ejercicios//clase4//textoCodificado.txt"),codificar(linea, indice));
                } else {
                    System.out.println(decodificar(linea, indice));
                    Files.writeString(Paths.get("src//ejercicios//clase4//textoCodificado.txt"),decodificar(linea, indice));
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
