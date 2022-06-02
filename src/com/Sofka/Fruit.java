package com.Sofka;
/**
 * Representa la información  de una clase tipo objeto llamada frutas.
 *
 * @autor Elkin Sierra Hernández
 */

import java.text.ParseException;
import java.util.ArrayList; // import the ArrayList class

/**
 * Se crea la clase Frutas y sus variables publicas
 */
public class Fruit {
    /**
     * Variables declaradas según el objeto frutas
     */
    public String fruitName, fruitType, fruitShape, colorFruit;
    private float averageWeight;


    /**
     * Se crea la clase con metodo set para la clase frutas
     *
     * @param FruitNames variable declarada con metodo set para acceder a la variable nombre de las frutas
     * @param FruitTypes variable declarada con metodo set para acceder a la variable tipo de las frutas
     * @param FruitShape variable declarada con metodo set para acceder a la variable forma de las frutas
     */

    public Fruit(String FruitNames, String FruitTypes, String FruitShape, float averageWeight) {
        this.fruitName = FruitNames;
        this.fruitType = FruitTypes;
        this.fruitShape = FruitShape;
        this.averageWeight = averageWeight;

    }


    private void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    private float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Se crea la clase tipo array con nombre color, para acceder al color de las frutas
     */
    public void arrayFruitList() {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Green");
        color.add("Yellow");
        color.add("Brown");
        color.add("Red");
        color.add("Orange");
        color.add("Pink");
        color.add("purple");
        colorFruit = color.get(0);


    }

    /**
     * Se crea la clase con metodo set para la clase peso promedio de frutas
     * @param FaverageWeight variable declarada con metodo set para acceder al peso promedio de las frutas
     */


    /**
     * clase tipo get para retornar el valor nombre de la fruta
     *
     * @return retorna el valor nombre de la fruta
     */
    public String getFruitName() {
        return fruitName;
    }

    /**
     * clase tipo get para retornar el valor tipo de la fruta
     *
     * @return retorna el valor tipo de la fruta
     */
    public String getFruitType() {
        return fruitType;
    }

    /**
     * clase tipo get para retornar el valor forma de la fruta
     *
     * @return retorna el valor forma de la fruta
     */
    public String getFruitShape() {
        return fruitShape;
    }


    /**
     *
     */
    public void getprintName() {
        arrayFruitList();
        System.out.println("Fruit Name:  " + fruitName);
        System.out.println("Fruit Type:  " + fruitType);
        System.out.println("Fruit Shape: " + fruitShape);
        System.out.println("Fruit Average Weigh: " + averageWeight);
        System.out.println("Color Fruit : " + colorFruit);


    }


}




