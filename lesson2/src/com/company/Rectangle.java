package com.company;

public class Rectangle extends Shape{
    private Point x;
    private Point y;
    private Point z;
    private Point k;

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

    public Point getK() {
        return k;
    }

    public void setK(Point k) {
        this.k = k;
    }

    public Rectangle(Point x, Point y, Point z, Point k) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.k = k;
    }

    public Rectangle() {
    }

    @Override
    double calculatePerimetr() {
        return this.x.getDistance(this.y) + this.y.getDistance(this.z) + this.z.getDistance(this.k) + this.x.getDistance(this.k);
    }

    @Override
    double calculateArea() {
        double semiPerimetr = this.calculatePerimetr() / 2;
        return Math.sqrt((semiPerimetr - this.x.getDistance(this.y)) * (semiPerimetr - this.y.getDistance(this.z)) * (semiPerimetr - this.z.getDistance(this.k)) * (semiPerimetr - this.k.getDistance(this.x)));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", k=" + k +
                '}';
    }
}
