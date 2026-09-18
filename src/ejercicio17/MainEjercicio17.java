package ejercicio17;

import java.util.Scanner;

public class MainEjercicio17 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("=== EJERCICIO PROPUESTO No 17 - AREA Y CIRCUNFERENCIA ===");
        System.out.print("Digite el radio del circulo: ");
        double radio = lector.nextDouble();

        Circulo circulo = new Circulo(radio);

        System.out.println();
        System.out.printf("RADIO                   : %.2f%n", circulo.getRadio());
        System.out.printf("AREA DEL CIRCULO        : %.4f%n", circulo.calcularArea());
        System.out.printf("LONGITUD CIRCUNFERENCIA : %.4f%n",
                circulo.calcularLongitudCircunferencia());

        lector.close();
    }
}
