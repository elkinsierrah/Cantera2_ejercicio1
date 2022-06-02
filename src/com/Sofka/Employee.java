package com.Sofka;
import java.math.BigDecimal;

/**
 * Representa la información  de una clase tipo objeto llamada Empleados.
 * @autor Elkin Sierra
 */
public class Employee {
    /**
     * Se crea la clase Empleados y sus variables publicas, privadas y protegidas
     */
    public String employeeName, positionCompany, antiquity, department, bossName;
    private BigDecimal salary;
    protected int numberFouls, numberSuspension;

    /**
     * Se crea la clase con metodo set para los empleados
     *
     * @param CemployeeName    variable declarada con metodo set para acceder a la variable nombre de los empleados
     * @param CpositionCompany variable declarada con metodo set para acceder a la variable cargo de los empleados
     * @param Cantiquity       variable declarada con metodo set para acceder a la variable antiguedad de los empleados
     * @param Cdepartment      variable declarada con metodo set para acceder a la variable departamento de trabajo de los empleado
     * @param CbossName        variable declarada con metodo set para acceder a la variable nombre del jefe de los empleado
     */
    public void setEmpleyee(String CemployeeName, String CpositionCompany, String Cantiquity, String Cdepartment, String CbossName) {
        this.employeeName = CemployeeName;
        this.positionCompany = CpositionCompany;
        this.antiquity = Cantiquity;
        this.department = Cdepartment;
        this.bossName = CbossName;
    }

    /**
     * Se crea la clase con metodo set para el salario o sueldo los empleados
     *
     * @param Esalary variable declarada con metodo set para acceder a la variable sueldo de los empleado
     */
    private void setSalaries(BigDecimal Esalary) {
        this.salary = Esalary;
    }

    /**
     * Se crea la clase con metodo set para el la faltas y suspenciones los empleados
     *
     * @param CnumberFouls      variable declarada con metodo set para acceder a la variable de faltas de los empleado
     * @param CnumberSuspension variable declarada con metodo set para acceder a la variable de suspenciones de los empleado
     */
    protected void setFouls(int CnumberFouls, int CnumberSuspension) {
        this.numberFouls = CnumberFouls;
        this.numberSuspension = CnumberSuspension;
    }

    /**
     * clase tipo get para retornar el valor del nombre de los empleados
     *
     * @return retorna el valor del nombre de los empleados
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * clase tipo get para retornar el valor del cargo de los empleados
     *
     * @return retorna el valor del cargo de los empleados
     */
    public String getPositionCompany() {
        return positionCompany;
    }

    /**
     * clase tipo get para retornar el valor de la antiguedad de los empleados
     *
     * @return retorna el valor de la antiguedad de los empleados
     */
    public String getAntiquitye() {
        return antiquity;
    }

    /**
     * clase tipo get para retornar el valor del departamento de trabajo de los empleados
     *
     * @return retorna el valor del departamento de trabajo de los empleados
     */
    public String getDepartment() {
        return department;
    }

    /**
     * clase tipo get para retornar el valor del nombre del jefe de los empleados
     *
     * @return retorna el valor del nombre del jefe de los empleados
     */
    public String getBossNamee() {
        return bossName;
    }

    /**
     * clase tipo get para retornar el valor del salario de los empleados
     *
     * @return retorna el valor del salario de los empleados
     */
    private BigDecimal getSalary() {
        return salary;
    }

    /**
     * clase tipo get para retornar el valor de las faltas de los empleados
     *
     * @return retorna el valor de las faltas de los empleados
     */
    protected int getNumberFouls() {
        return numberFouls;
    }

    /**
     * clase tipo get para retornar el valor de las suspenciones de los empleados
     *
     * @return retorna el valor de las suspenciones de los empleados
     */
    protected int getNumberSuspensio() {
        return numberSuspension;
    }

}
