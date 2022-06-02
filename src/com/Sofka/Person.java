package com.Sofka;
/**
 * Representa la información  de una clase tipo objeto llamada Person.
 *
 * @autor Elkin Sierra Hernández
 * Se Importa la clase Date
 */

import java.text.ParseException;
import java.util.Date;


/**
 * Se crea la clase persona y sus variables publicas
 */
public class Person {
    /**
     * Variables declaradas según el objeto persona
     */
    public String name, name2, lastName, lastName2, age;
    public float height, weight;
    public int identificationCard;

    /**
     * Declaración de clase con metódo Set para nombres de personas
     * @param pName variable declarada con metodo set para acceder a la variable name de nombre de persona
     * @param pName2 variable declarada con metodo set para acceder a la variable name2 de segundo nombre de persona
     * @param plastName variable declarada con metodo set para acceder a la variable name de nombre de persona
     * @param plastName2 variable declarada con metodo set para acceder a la variable name2 de segundo nombre de persona
     * @param page variable declarada con metodo set para acceder a la variable de edad de persona
     */
    Date dateBirth = new Date();
    public Person(String pName, String pName2, String plastName, String plastName2, String page, float pheight, float pweight, int pidentificationCard, Date pdateBirth) {
        this.name = pName;
        this.name2 = pName2;
        this.lastName = plastName;
        this.lastName2 = plastName2;
        this.age = page;
        this.height = pheight;
        this.weight = pweight;
        this.identificationCard = pidentificationCard;
        this.dateBirth = pdateBirth;

    }
public void setName(String name){
        this.name = name;
}

    /**
     * Declaración de clase con metódo Set para la fecha de nacimiento de persona
     * @param pdateBirth variable declarada con metodo set para acceder a la variable defecha de nacimiento de persona
     */

    public void setDateBirth(Date pdateBirth) {
        this.dateBirth = pdateBirth;
    }

    /**
     *  Declaración de clase con metódo Set para la cédula de persona
     * @param pidentificationCard ariable declarada con metodo set para acceder a la variable cédula de persona
     */
    public void setIdentificationCard(int pidentificationCard) {
        this.identificationCard = pidentificationCard;
    }

    /**
     *  clase tipo get para retornar el valor nombre de la persona
     * @return retorna el nombre de la perona
     */
    public String getName() {
        return name;
    }

    /**
     *  clase tipo get para retornar el valor segundo nombre de la persona
     * @return retorna el segundo nombre de la perona
     */
    public String getName2() {
        return name2;
    }

    /**
     *  clase tipo get para retornar el valor primer apellido de la persona
     * @return retorna el primer apellido de la perona
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *  clase tipo get para retornar el valor del segundo apellido de la persona
     * @return retorna el segundo apellido de la perona
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     *  clase tipo get para retornar el valor la edad de la persona
     * @return retorna la edad de la perona
     */
    public String getAge() {
        return age;
    }

    /**
     *  clase tipo get para retornar el valor la fecha de nacimiento de la persona
     * @return retorna la fecha de nacimiento de la perona
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     *  clase tipo get para retornar el valor estatura de la persona
     * @return retorna la estatura de la perona
     */
    public float getHeight() {
        return height;
    }

    /**
     *  clase tipo get para retornar el valor peso de la persona
     * @return retorna el peso de la perona
     */
    public float getWeight() {
        return weight;
    }

    /**
     *  clase tipo get para retornar el valor la cédula de la persona
     * @return retorna la cédula de la perona
     */
    public int getIdentificationCard() {
        return identificationCard;
    }

    /**
     * Se crean método getrintName para imprimir de una vez todos los datos agregado al constructor, evitando hacerlo uno por uno.
     */
    public void getprintName(){

        System.out.print("Names: " + name);
        System.out.print(" " + name2);
        System.out.print(" " + lastName);
        System.out.println(" " + lastName2);
        System.out.println("Age: " + age);
        System.out.println("Height:  " + height);
        System.out.println("Weight:  " + weight);
        System.out.println("Id Card: " + identificationCard);
        System.out.print("Date Birth: " + dateBirth);

    }

}

