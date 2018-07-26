package com.company;

public class Circle extends Shape{
    private Point x;
    private Point y;

    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public Point getY() {
        return y;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public Circle(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

    public Circle() {
    }

    @Override
    double calculatePerimetr() {
        return Math.PI * 2 * this.x.getDistance(this.y);
    }

    @Override
    double calculateArea() {
        return Math.PI * this.x.getDistance(this.y) * this.x.getDistance(this.y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
