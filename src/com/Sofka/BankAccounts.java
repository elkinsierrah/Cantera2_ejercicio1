package com.Sofka;

/**
 * Representa la información  de una clase tipo objeto llamada cuenta bancaria.
 * @autor Elkin Sierra
 */
public class BankAccounts{
    /**
     * Se crea la clase Frutas y sus variables publicas, privadas y protegidas
     */
    public String name, lastName, address, phone;
    private int accountNumber;
    protected boolean activated;

    /**
     * Se crea la clase con metodo set para la clase cuentas
     * @param aname variable declarada con metodo set para acceder a la variable nombre de propietario de la cuenta bancaria
     * @param alastName variable declarada con metodo set para acceder a la variable apellido de propietario de la cuenta bancaria
     * @param aaddress variable declarada con metodo set para acceder a la variable direccion de propietario de la cuenta bancaria
     * @param aphone variable declarada con metodo set para acceder a la variable teléfono de propietario de la cuenta bancaria
     */
    public void setAccount(String aname, String alastName, String aaddress, String aphone) {
        this.name = aname;
        this.lastName = alastName;
        this.address = aaddress;
        this.phone = aphone;
    }

    /**
     * Se crea la clase con metodo set para la clase privada numero de cuenta
     * @param baccountNumber variable declarada con metodo set para acceder a la variable número de cuenta bancaria
     */
    private void setAccountNumber(int baccountNumber) {
        this.accountNumber = baccountNumber;
    }

    /**
     * clase tipo get para retornar el valor del nombre de propietario de la cuenta bancaria
     * @return retorna el valor nombre del propietario de la cuenta bancaria
     */
    public String  getName() {
        return name;
    }
    /**
     * clase tipo get para retornar el valor del apellido de propietario de la cuenta bancaria
     * @return retorna el valor apellido del propietario de la cuenta bancaria
     */
    public String  getLastName() {
        return lastName;
    }
    /**
     * clase tipo get para retornar el valor de la dirección de propietario de la cuenta bancaria
     * @return retorna el valor de la dirección del propietario de la cuenta bancaria
     */
    public String  getAddresse() {
        return address;
    }
    /**
     * clase tipo get para retornar el valor del teléfono de propietario de la cuenta bancaria
     * @return retorna el valor teléfono del propietario de la cuenta bancaria
     */
    public String  getPhone() {
        return phone;
    }
    /**
     * clase tipo get para retornar el valor del número de cuenta de propietario de la cuenta bancaria
     * @return retorna el valor del número de cuenta del propietario de la cuenta bancaria
     */
    private int getAccountNumber(){
        return accountNumber;
    }
    /**
     * clase tipo get para retornar el valor de la activación o no  de la cuenta bancaria
     * @return retorna el valor de la activación o no de la cuenta bancaria
     */
    protected boolean getActivated(){
        return activated;
    }
}
