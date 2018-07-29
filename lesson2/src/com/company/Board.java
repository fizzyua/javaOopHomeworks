package com.company;

import java.util.Arrays;

public class Board {
    private Shape[] shapes = new Shape[4];

    public void addNewShape(int position, Shape shape) {
        if (position >= 0 && position < 4) {
            shapes[position] = shape;
            System.out.println( "Shape successfully added");
        } else System.out.println("Please check the position");
    }
    public void deleteShape(int position){
        if (position >=0 && position < 4 && shapes[position] != null) {
            shapes[position] = null;
            System.out.println("Shape successfully deleted");
        }
        else System.out.println("Please check the position");
    }

    @Override
    public String toString() {
        String out = new String();
        double area = 0;
        for (int i = 0; i < 4; i++){
            if(shapes[i] != null){
                out += i +") " + shapes[i].toString() + "\n";
                area += shapes[i].calculateArea();
            }
        }
        return out + "total area: " + area;
    }
}
