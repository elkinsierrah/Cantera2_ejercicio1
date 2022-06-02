package com.Sofka;

import com.Sofka.Person;
import java.text.ParseException;
import java.util.Date;


public class Main{

    public static void main(String[] args) throws ParseException {
        System.out.println("\n Functional testing of the person class\n");
        Person objName = new Person("Erick","Alfonso", "Florez", "Gimenes","25", 1.75F, 78,79258167, new Date ("12/10/1980"));
        objName.getprintName();
        System.out.println(" ");

        System.out.println("\n Functional testing of the fruit class\n");
        Fruit objFruit = new Fruit("Mango","Tropícal","Ovalada",2.7f);
        objFruit.getprintName();




    }

}