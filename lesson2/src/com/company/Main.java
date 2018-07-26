package com.company;

import javafx.scene.shape.Circle;

public class Main {

    public static void main(String[] args) {
        Triangle t = new Triangle( new Point(3,4),new Point(6,7),new Point(8,9));
        System.out.println(t.toString());
        System.out.println("Перимитр треугольника: " + t.calculatePerimetr());
        System.out.println("Площадь треугольника: " + t.calculateArea());
        com.company.Circle c = new com.company.Circle(new Point(3,4),new Point(4,5));
        System.out.println(c.toString());
        System.out.println("Перимитр круга: " + c.calculatePerimetr());
        System.out.println("Площадь круга: " + c.calculateArea());
        Rectangle r = new Rectangle(new Point(7,8),new Point(9,10),new Point(13,19),new Point(5,7));
        System.out.println(r.toString());
        System.out.println("Перимитр четерехугольника: " + r.calculatePerimetr());
        System.out.println("Площадь четерехугольника: " + r.calculateArea());

    }
}
