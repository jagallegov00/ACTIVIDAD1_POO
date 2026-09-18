package ejercicio17;

public class Circulo {

    public static final double PI = Math.PI;

    private double radio;

    public Circulo(double radio) {
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que cero.");
        }
        this.radio = radio;
    }

    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    public double calcularLongitudCircunferencia() {
        return 2 * PI * radio;
    }

    @Override
    public String toString() {
        return String.format("Circulo de radio %.2f | Area: %.4f | Longitud: %.4f",
                radio, calcularArea(), calcularLongitudCircunferencia());
    }
}
