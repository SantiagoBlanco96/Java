package ejercicios.clase1;

public class Ejercicio2 {

    // Determinar si una familia pertenece al segmento ingresos altos
    float ingresosFamilia = 100000;
    int cantidadVehios = 2;
    int cantidadInmuebles = 1;
    boolean poseeLujo = false;

    public static void main(String[] args) {
        Ejercicio2 clase = new Ejercicio2();
        if (clase.ingresosFamilia > 489083 || clase.cantidadVehios > 3 || clase.cantidadInmuebles > 1 || clase.poseeLujo) {
            System.out.println("La familia pertenece al segmento de ingresos altos");
        } else {
            System.out.println("La familia no pertenece al segmento de ingresos altos");
        }
    }

}
