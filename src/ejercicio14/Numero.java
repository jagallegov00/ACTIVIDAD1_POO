package ejercicio14;

public class Numero {

    private double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularCuadrado() {
        return Math.pow(valor, 2);
    }

    public double calcularCubo() {
        return Math.pow(valor, 3);
    }

    @Override
    public String toString() {
        return String.format("Numero: %.2f | Cuadrado: %.2f | Cubo: %.2f",
                valor, calcularCuadrado(), calcularCubo());
    }
}
