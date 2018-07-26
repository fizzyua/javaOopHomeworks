package com.company;

public class Triangle extends Shape{
    private Point x;
    private Point y;
    private Point z;

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

    public Point getZ() {
        return z;
    }

    public void setZ(Point z) {
        this.z = z;
    }

    public Triangle(Point x, Point y, Point z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Triangle() {
    }

    @Override
    double calculatePerimetr() {
        return this.x.getDistance(this.y) + this.y.getDistance(this.z) + this.z.getDistance(this.x);
    }

    @Override
    double calculateArea() {
        double perimetr = calculatePerimetr();
        return Math.sqrt(perimetr * (perimetr - this.x.getDistance(y)) * (perimetr - this.y.getDistance(z)) * (perimetr - this.z.getDistance(x)));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
