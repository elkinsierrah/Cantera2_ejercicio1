package com.Sofka;

import java.util.ArrayList;

/**
 * Representa la información  de una clase tipo objeto llamada MOTO.
 * @autor Elkin Sierra
 */
public class Motorcycle {
    /**
     * Se crea la clase Motorcycle sus variables publicas, privadas.
     */
    public String mark, type, displacement, speedMax, colorMoto;
    private long price;

    /**
     *  Se crea la clase con metodo set para las motos
     * @param dMark variable declarada con metodo set para acceder a la variable marca de la moto
     * @param dType variable declarada con metodo set para acceder a la variable tipo de la moto
     * @param dSpeedMax variable declarada con metodo set para acceder a la variable velocidad máxima de la moto

     */
    public void decripcion(String dMark ,String dType, String dSpeedMax ,String dSpeedMin){
        this.mark = dMark;
        this.type = dType;
        this.speedMax = dSpeedMax;

    }
    /**
     * Se crea la clase tipo array con nombre color, para acceder al color de cada moto
     */
    public void Color() {
        ArrayList<String> colorMoto = new ArrayList<String>();
        colorMoto.add("Blue");
        colorMoto.add("Yellow");
        colorMoto.add("Brown");
        colorMoto.add("Red");
        colorMoto.add("Black");
        colorMoto.add("White");

    }

    /**
     *  Se crea la clase con metodo set para precio de las motos
     * @param dPrice variable declarada con metodo set para acceder a la variable precio de la moto
     */
    private void setPrice(long dPrice){
        this.price = dPrice;
    }

    /**
     *  clase tipo get para retornar el valor la marca de la moto
     * @return retorna el valor de la marca de la moto
     */
    public String getMark() {
        return mark;
    }
    /**
     *  clase tipo get para retornar el valor del tipo de la moto
     * @return retorna el valor de la tipo de la moto
     */
    public String getType() {
        return type;
    }
    /**
     *  clase tipo get para retornar el valor de la velocidad máxima de la moto
     * @return retorna el valor de la velocidad máxima
     */
    public String getSpeedMax() {
        return speedMax;
    }
    /**
     *  clase tipo get para retornar el valor del color de la moto
     * @return retorna el valor del color de la moto
     */
    public String getColorMoto() {
        return colorMoto;
    }
    /**
     *  clase tipo get para retornar el valor del precio de la moto
     * @return retorna el valor del precio de la moto
     */
    private long getPrice() {
        return price;
    }



}
