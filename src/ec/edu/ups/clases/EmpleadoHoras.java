/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 * Clase Empleado por Horas
 *
 * Clase hija que hereda de Empleado, en donde, se implementa el método
 * abstracto calcularSalarioFinal() con base a las horas extras y costo de hora
 * extra trabajada.
 *
 * @author Darwin Leon, Est.
 */
public class EmpleadoHoras extends Empleado {

    private int numeHorasExtra;
    private double costoHoraExtra;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(int codigo, String cedula, String nombre, double salario, Date fechaContratacion) {
        super(codigo, cedula, nombre, salario, fechaContratacion);
    }
           
    public EmpleadoHoras(int numeHorasExtra, double costoHoraExtra) {
        this.numeHorasExtra = numeHorasExtra;
        this.costoHoraExtra = costoHoraExtra;
    }

    public EmpleadoHoras(int numeHorasExtra, double costoHoraExtra, int codigo, String cedula, String nombre, double salario, Date fechaContratacion) {
        super(codigo, cedula, nombre, salario, fechaContratacion);
        this.numeHorasExtra = numeHorasExtra;
        this.costoHoraExtra = costoHoraExtra;
    }
    
    @Override
    public double calcularSalarioFinal() {

        return super.getSalario()+(numeHorasExtra * costoHoraExtra);
    }

    public int getNumeHorasExtra() {
        return numeHorasExtra;
    }

    public void setNumeHorasExtra(int numeHorasExtra) {
        this.numeHorasExtra = numeHorasExtra;
    }

    public double getCostoHoraExtra() {
        return costoHoraExtra;
    }

    public void setCostoHoraExtra(double costoHoraExtra) {
        this.costoHoraExtra = costoHoraExtra;
    }

}
