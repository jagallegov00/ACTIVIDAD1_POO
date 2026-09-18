package ejercicio12;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Empleado {

    private static final DecimalFormat FORMATO_PESOS = construirFormato();

    private double horasTrabajadas;
    private double valorHora;
    private double porcentajeRetencion;

    public Empleado(double horasTrabajadas, double valorHora, double porcentajeRetencion) {
        setHorasTrabajadas(horasTrabajadas);
        setValorHora(valorHora);
        setPorcentajeRetencion(porcentajeRetencion);
    }

    private static DecimalFormat construirFormato() {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator(',');
        simbolos.setGroupingSeparator('.');
        return new DecimalFormat("$#,##0.00", simbolos);
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException(
                    "Las horas trabajadas no pueden ser negativas.");
        }
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora < 0) {
            throw new IllegalArgumentException(
                    "El valor de la hora no puede ser negativo.");
        }
        this.valorHora = valorHora;
    }

    public double getPorcentajeRetencion() {
        return porcentajeRetencion;
    }

    public void setPorcentajeRetencion(double porcentajeRetencion) {
        if (porcentajeRetencion < 0 || porcentajeRetencion > 100) {
            throw new IllegalArgumentException(
                    "El porcentaje de retencion debe estar entre 0 y 100.");
        }
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }

    public double calcularRetencionEnLaFuente() {
        return calcularSalarioBruto() * porcentajeRetencion / 100;
    }

    public double calcularSalarioNeto() {
        return calcularSalarioBruto() - calcularRetencionEnLaFuente();
    }

    public String formatearPesos(double valor) {
        return FORMATO_PESOS.format(valor);
    }
}
