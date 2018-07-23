package com.company;

public class Vector3d {
    private double a;
    private double b;
    private double c;

    public Vector3d(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Vector3d() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    public Vector3d add(Vector3d a, Vector3d b){
        return new Vector3d(a.getA() + b.getA(),a.getA() + b.getA(),a.getC() + b.getC());
    }
    public static double scalarProduct(Vector3d a, Vector3d b){
        return a.getA() * b.getA() + a.getB() * b.getB() + a.getC() * b.getC();
    }
    public Vector3d vectorProduct(Vector3d a, Vector3d b){
        return new Vector3d(a.getB() * b.getC() - a.getC() * b.getB(),a.getC() * b.getA() - a.getA() * b.getC(),a.getA() * b.getB() - a.getB() * b.getA());
    }
}
