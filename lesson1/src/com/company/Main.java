package com.company;

public class Main {

    public static void main(String[] args) {
    /////////////////////////////////////task1///////////////////////////////////////////////
    System.out.println("Первое задание");
	Cat bobik = new Cat();
	bobik.setAge(10);
	bobik.setColor("green");
	bobik.setWeight(5);
	bobik.setBreed("Birman");
	bobik.purr();
	System.out.println(bobik);
	Cat murka = new Cat("black",9,"Oriental",2);
	murka.purr();
	System.out.println(murka);
	System.out.println("Конец первого задания" + "\n");
	/////////////////////////////////////task2//////////////////////////////////////////////
    System.out.println("Второе задание");
    Triangle triangle = new Triangle(10,15,17);
    System.out.println(triangle);
    System.out.println("Площадь: " + triangle.area());
    System.out.println("Конец второго задания" + "\n");
    /////////////////////////////////////task3//////////////////////////////////////////////
    System.out.println("Третье задание");
    Vector3d firstVector3d =  new Vector3d(5,7,8);
    Vector3d secondVector3d = new Vector3d(10,15,69);
    System.out.println("Вектор 1: " + firstVector3d);
    System.out.println("Вектор 2: " + secondVector3d);
    System.out.println("Сложение: " + new Vector3d().add(firstVector3d,secondVector3d));
    System.out.println("Скалярное произведение: " + Vector3d.scalarProduct(firstVector3d,secondVector3d));
    System.out.println("Веутрное произведение:" +new Vector3d().vectorProduct(firstVector3d,secondVector3d));
    System.out.println("Конец третьего задания");
    }
}
