package ejercicio12;

public class MainEjercicio12 {

    public static void main(String[] args) {
        Empleado empleado = new Empleado(48, 5000, 12.5);

        System.out.println("=== EJERCICIO PROPUESTO No 12 - SALARIO DEL TRABAJADOR ===");
        System.out.println();
        mostrar("Horas trabajadas en la semana", empleado.getHorasTrabajadas());
        mostrar("Valor de la hora", empleado.formatearPesos(empleado.getValorHora()));
        mostrar("Retencion en la fuente", empleado.getPorcentajeRetencion() + " %");

        System.out.println();
        mostrar("SALARIO BRUTO",
                empleado.formatearPesos(empleado.calcularSalarioBruto()));
        mostrar("RETENCION EN LA FUENTE",
                empleado.formatearPesos(empleado.calcularRetencionEnLaFuente()));
        mostrar("SALARIO NETO",
                empleado.formatearPesos(empleado.calcularSalarioNeto()));
    }

    private static void mostrar(String etiqueta, Object valor) {
        System.out.printf("%-30s: %s%n", etiqueta, valor);
    }
}
