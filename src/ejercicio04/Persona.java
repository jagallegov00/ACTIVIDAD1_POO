package ejercicio04;

public class Persona {

    private final String nombre;
    private double edad;

    public Persona(String nombre, double edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("%-8s = %6.2f anios", nombre, edad);
    }
}
