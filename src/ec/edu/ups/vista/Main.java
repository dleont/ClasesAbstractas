/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.clases.EmpleadoAsalariado;
import ec.edu.ups.clases.EmpleadoComision;
import ec.edu.ups.clases.EmpleadoHoras;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * calse Main donde inicia la ejecucion del programa. Instanciando clases y
 * Asignando valores mediante metodo set.
 *
 * @author Darwin Leon, Est.
 */
public class Main {

    public static void main(String[] args) {

        int opcion = 1;
        int op;

        while (opcion == 1) {
            System.out.println("Ingrese el tipo de Empleado");
            System.out.println("1.Asalariado 2.Por Comision 3.Por Horas");

            Scanner leer = new Scanner(System.in);
            op = leer.nextInt();

            switch (op) {
                case 1:
                    GregorianCalendar fechaContratacionPepito = new GregorianCalendar(2010, 0, 1);
                    EmpleadoAsalariado emplePepito = new EmpleadoAsalariado(1, "0102584512", "Jose Pesantez", 500, fechaContratacionPepito.getTime());
                    double salarioFinalPepito = emplePepito.calcularSalarioFinal();
                    System.out.println("Salario final Pepito: " + salarioFinalPepito);

                    /**
                     * EmpleadoAsalariado empleAsalariado = new
                     * EmpleadoAsalariado();
                     *
                     * empleAsalariado.setCodigo(123);
                     * empleAsalariado.setCedula("0106993835");
                     * empleAsalariado.setNombre("Esteban Paida");
                     * empleAsalariado.setFechaContratacion(9/2018/03);
                     */
                    /**
                     * String fechaCont = leer.nextLine(); SimpleDateFormat df =
                     * new SimpleDateFormat("dd/MM/yyyy"); Date testDate = null;
                     * String date = fechaCont;
                     *
                     * try { testDate = df.parse(date);
                     * //System.out.println("Ahora hemos creado un objeto date
                     * con la fecha indicada, " + testDate); } catch (Exception
                     * e) { //System.out.println("formato valido"); }
                     *
                     * if (!df.format(testDate).equals(date)) {
                     * System.out.println("fecha invalida!!"); } else {
                     * System.out.println("fecha invalida"); }
                     *
                     * Date fechaActual = new Date();
                     * //System.out.println("fecha actual " + fechaActual);
                     *
                     * SimpleDateFormat formato = new
                     * SimpleDateFormat("dd/MM/yyyy"); String fechaFormateada =
                     * formato.format(fechaActual); System.out.println("Fecha
                     * actual /n" + fechaFormateada);
                     */
                    break;
                case 2:
                    GregorianCalendar fechaContratacionJuanito = new GregorianCalendar(2015, 0, 1);
                    EmpleadoHoras empleJuanito = new EmpleadoHoras(2, "0105889669", "Juan Yunga", 400, fechaContratacionJuanito.getTime());
                    empleJuanito.setCostoHoraExtra(10);
                    empleJuanito.setNumeHorasExtra(15);
                    double salarioFinalJuanito = empleJuanito.calcularSalarioFinal();
                    System.out.println("Salario final Juanito: " + salarioFinalJuanito);
                    break;
                case 3:

                    GregorianCalendar fechaContratacionMaria = new GregorianCalendar(2017, 0, 1);
                    EmpleadoComision empleMaria = new EmpleadoComision(3, "0104558512", "Maria Gutierrez", 480, fechaContratacionMaria.getTime());
                    empleMaria.setVentasMensuales(1200);
                    double salarioFinalMaria = empleMaria.calcularSalarioFinal();
                    System.out.println("Salario final Maria: " + salarioFinalMaria);
                    break;

            }
            System.out.println(" ");
            System.out.println("Desea continuar 1.SI / 2.NO");
            opcion = leer.nextInt();
        }
    }

}
