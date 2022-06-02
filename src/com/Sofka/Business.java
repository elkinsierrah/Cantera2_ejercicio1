package com.Sofka;

import java.math.BigDecimal;
import java.util.ArrayList; // import the ArrayList class

/**
 * Representa la información  de una clase tipo objeto llamada Negocios.
 * @autor Elkin Sierra
 */
public class Business {
    /**
     * Se crea la clase business y sus variables publicas, privadas y protegidas
     */
    public String companyName, address, phone, employeeName;
    private String principalName, vicePrincipalName;
    protected BigDecimal companyHeritage;

    /**
     * Se crea la clase con metodo set para la Empresa
     * @param ccompanyName variable declarada con metodo set para acceder a la variable nombre de la Empresa
     * @param caddress variable declarada con metodo set para acceder dirección de la Empresa
     * @param cphone variable declarada con metodo set para acceder a la teléfono de la Empresa
     */
    public void setCompany(String ccompanyName, String caddress, String cphone) {
        this.companyName = ccompanyName;
        this.address = caddress;
        this.phone = cphone;
    }

    /**
     * Se crea la clase EmployeeName para la optener una lista de los empleados de la Empresa
     */
    public void EmployeeName() {
        ArrayList<String> employeeName = new ArrayList<String>();
        employeeName.add("Carlos Garcia");
        employeeName.add("Pedro Aldana");
        employeeName.add("Carolina Arzola");
        employeeName.add("Ricardo Tapia");
        employeeName.add("Luisa Gutierrez");
        employeeName.add("Lorna Paez");
        employeeName.add("Karina Mendez");
    }


    /**
     * Se crea la clase con metodo set para la presidencia la Empresa
     * @param BprincipalName variable declarada con metodo set para acceder al nombre del preseindente de la Empresa
     * @param BvicePrincipalName variable declarada con metodo set para acceder al nombre del vicepreseindente  de la Empresa
     */
    private void setPrincipal(String BprincipalName, String BvicePrincipalName) {
        this.principalName = BprincipalName;
        this.vicePrincipalName = BvicePrincipalName;
    }

    /**
     * Se crea la clase con metodo set para los directivos la Empresa
     * @param cCompanyHeritage variable declarada con metodo set para acceder al nombre de los directivos  de la Empresa
     */
    protected void setCompanyHeritage(BigDecimal cCompanyHeritage) {
        this.companyHeritage = cCompanyHeritage;
    }
    /**
     *  clase tipo get para retornar el valor nombre de la Empresa
     * @return retorna el valor nombre de la  Empresa
     */
    public String getCompanyName() {
        return companyName;
    }
    /**
     *  clase tipo get para retornar el valor dirección de la Empresa
     * @return retorna el valor dirección de la  Empresa
     */
    public String getAddress() {
        return address;
    }
    /**
     *  clase tipo get para retornar el valor teléfono de la Empresa
     * @return retorna el valor teléfono de la  Empresa
     */
    public String getPhone() {
        return phone;
    }
    /**
     *  clase tipo get para retornar el valor la lista de los empledos de la Empresa
     * @return retorna el valor de la lista de los empledos de la Empresa
     */
    public String getEmployeeName() {
        return employeeName;
    }
    /**
     *  clase tipo get para retornar el valor la lista del presidente de la Empresa
     * @return retorna el valor de la lista del presidentede la Empresa
     */
    private String getPrincipalName() {
        return principalName;
    }

    /**
     *  clase tipo get para retornar el valor la lista d los directivos de la Empresa
     * @return retorna el valor de la lista de los directivos la Empresa
     */
    protected BigDecimal getCompanyHeritage() {
        return companyHeritage;
    }
}
