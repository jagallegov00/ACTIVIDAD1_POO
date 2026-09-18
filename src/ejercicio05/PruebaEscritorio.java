package ejercicio05;

import java.util.ArrayList;
import java.util.List;

public class PruebaEscritorio {

    private Double suma;
    private Double x;
    private Double y;
    private final List<PasoTraza> traza = new ArrayList<>();

    public void ejecutar() {
        traza.clear();
        suma = null;
        x = null;
        y = null;

        suma = 0.0;
        registrarPaso("SUMA = 0");

        x = 20.0;
        registrarPaso("X = 20");

        suma = suma + x;
        registrarPaso("SUMA = SUMA + X");

        y = 40.0;
        registrarPaso("Y = 40");

        x = x + Math.pow(y, 2);
        registrarPaso("X = X + Y ** 2");

        suma = suma + x / y;
        registrarPaso("SUMA = SUMA + X / Y");
    }

    private void registrarPaso(String instruccion) {
        traza.add(new PasoTraza(instruccion, suma, x, y));
    }

    public List<PasoTraza> getTraza() {
        return traza;
    }

    public Double getSuma() {
        return suma;
    }

    public String obtenerSalida() {
        return "EL VALOR DE LA SUMA ES: " + suma;
    }

    public void imprimirTraza() {
        System.out.printf("%-22s | %-8s | %-8s | %-6s%n", "INSTRUCCION", "SUMA", "X", "Y");
        System.out.println("-----------------------+----------+----------+-------");
        for (PasoTraza paso : traza) {
            System.out.println(paso);
        }
    }
}
