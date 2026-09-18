package ejercicio14;

import java.util.Scanner;

public class MainEjercicio14 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("=== EJERCICIO PROPUESTO No 14 - CUADRADO Y CUBO ===");
        System.out.print("Digite un numero: ");
        double valor = lector.nextDouble();

        Numero numero = new Numero(valor);

        System.out.println();
        System.out.printf("EL NUMERO DIGITADO ES : %.2f%n", numero.getValor());
        System.out.printf("SU CUADRADO ES        : %.2f%n", numero.calcularCuadrado());
        System.out.printf("SU CUBO ES            : %.2f%n", numero.calcularCubo());

        lector.close();
    }
}
