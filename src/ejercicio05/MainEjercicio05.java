package ejercicio05;

public class MainEjercicio05 {

    public static void main(String[] args) {
        System.out.println("=== EJERCICIO RESUELTO No 5 - PRUEBA DE ESCRITORIO ===");
        System.out.println();

        PruebaEscritorio prueba = new PruebaEscritorio();
        prueba.ejecutar();
        prueba.imprimirTraza();

        System.out.println();
        System.out.println("SALIDA DEL ALGORITMO:");
        System.out.println("  " + prueba.obtenerSalida());
    }
}
