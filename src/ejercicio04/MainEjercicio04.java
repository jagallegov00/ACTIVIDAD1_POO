package ejercicio04;

import java.util.Scanner;

public class MainEjercicio04 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("=== EJERCICIO RESUELTO No 4 - EDADES DE LA FAMILIA ===");
        System.out.print("Digite la edad de Juan: ");
        double edadJuan = lector.nextDouble();

        Familia familia = new Familia(edadJuan);

        System.out.println();
        System.out.println("LAS EDADES SON:");
        for (Persona integrante : familia.obtenerIntegrantes()) {
            System.out.println("  " + integrante);
        }

        lector.close();
    }
}
