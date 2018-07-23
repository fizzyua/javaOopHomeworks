package com.company;

public class Cat {
    private  String color;
    private  int weight;
    private String breed;
    private int age;

    public Cat(String color, int weight, String breed, int age) {
        this.color = color;
        this.weight = weight;
        this.breed = breed;
        this.age = age;
    }


    public Cat() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public  void purr(){
        System.out.println("Mur-Mur-Mur");
    }


}
