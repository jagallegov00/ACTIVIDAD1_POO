package ejercicio05;

public class PasoTraza {

    private final String instruccion;
    private final Double suma;
    private final Double x;
    private final Double y;

    public PasoTraza(String instruccion, Double suma, Double x, Double y) {
        this.instruccion = instruccion;
        this.suma = suma;
        this.x = x;
        this.y = y;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public Double getSuma() {
        return suma;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    private String formatear(Double valor) {
        return (valor == null) ? "-" : String.valueOf(valor);
    }

    @Override
    public String toString() {
        return String.format("%-22s | %-8s | %-8s | %-6s",
                instruccion, formatear(suma), formatear(x), formatear(y));
    }
}
