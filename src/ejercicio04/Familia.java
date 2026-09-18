package ejercicio04;

public class Familia {

    private double edadJuan;

    public Familia(double edadJuan) {
        setEdadJuan(edadJuan);
    }

    public double getEdadJuan() {
        return edadJuan;
    }

    public void setEdadJuan(double edadJuan) {
        if (edadJuan <= 0) {
            throw new IllegalArgumentException("La edad de Juan debe ser mayor que cero.");
        }
        this.edadJuan = edadJuan;
    }

    public double calcularEdadAlberto() {
        return 2 * edadJuan / 3;
    }

    public double calcularEdadAna() {
        return 4 * edadJuan / 3;
    }

    public double calcularEdadMama() {
        return calcularEdadAlberto() + edadJuan + calcularEdadAna();
    }

    public Persona[] obtenerIntegrantes() {
        return new Persona[] {
            new Persona("ALBERTO", calcularEdadAlberto()),
            new Persona("JUAN", edadJuan),
            new Persona("ANA", calcularEdadAna()),
            new Persona("MAMA", calcularEdadMama())
        };
    }
}
