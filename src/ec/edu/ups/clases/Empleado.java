/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author Darwin
 */
public abstract class Empleado {
    
    private int codigo;
    private String cedula;
    private String nombre;
    private double salario;
    private Date fechaContratacion;

    public Empleado() {
    }

    public Empleado(int codigo, String cedula, String nombre, double salario, Date fechaContratacion) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }
    
    //metodo abstracto solo se declara
    public abstract  double calcularSalarioFinal();
        
 
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", salario=" + salario + ", fechaContratacion=" + fechaContratacion + '}';
    }
    
    
    
}
