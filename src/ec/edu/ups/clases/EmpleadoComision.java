/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 * Empleado por Comisión
 *
 * Clase hija que hereda de Empleado, en donde, se implementa el método
 * abstracto calcularSalarioFinal() con base a las ventas realizadas
 *
 * @author Darwin Leon, Est.
 */
public class EmpleadoComision extends Empleado {

    private double ventasMensuales;

    public EmpleadoComision() {
    }

    public EmpleadoComision(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    public EmpleadoComision(double ventasMensuales, int codigo, String cedula, String nombre, double salario, Date fechaContratacion) {
        super(codigo, cedula, nombre, salario, fechaContratacion);
        this.ventasMensuales = ventasMensuales;
    }

    public EmpleadoComision(int codigo, String cedula, String nombre, double salario, Date fechaContratacion) {
        super(codigo, cedula, nombre, salario, fechaContratacion);
    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    /**
     * si el empleado realizo ventas superiores a 500 $$ y 1000 $$ se le otorga
     * una comision de 10% sobre las ventas mensuales.
     *
     * si el empleado realizo ventas superiores a 1001 $$ y 5000 $$ se le otorga
     * una comision de 15% sobre las ventas mensuales
     *
     * si el empleado realizo ventas superiores a 5001 $$ se le otorga una
     * comision de 20% sobre las ventas mensuales
     *
     * @return salario final
     */
    @Override
    public double calcularSalarioFinal() {

        if (ventasMensuales >= 500 && ventasMensuales <= 1000) {
            return super.getSalario() + (ventasMensuales * 0.10);
        } else if (ventasMensuales > 1000 && ventasMensuales <= 5000) {
            return super.getSalario() + (ventasMensuales * 0.15);
        } else if (ventasMensuales > 5000) {
            return super.getSalario() + (ventasMensuales * 0.20);
        } else {
            return super.getSalario();
        }
    }

}
