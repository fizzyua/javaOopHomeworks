package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BlackList bl = new BlackList("String","ArrayList");
        Steck steck = new Steck(bl);

        try {
            steck.addElement(15);
            steck.addElement(1.48);
            steck.addElement("hello world");
        }
        catch (IllegalArgumentException e){
            System.out.println("wrong class");
        }
        System.out.println(steck);



    }

}
