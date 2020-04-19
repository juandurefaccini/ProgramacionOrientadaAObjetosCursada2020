package com.tp2;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;//TODO esto se importa asi?

public class Point {
    double x;
    double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void shiftAxis(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void swap(Point p2) {
        Point aux = new Point(getX(), getY());
        setX(p2.getX());
        setY(p2.getY());
        p2.setX(aux.getX());
        p2.setY(aux.getY());
    }

    public double euclideanDistance(Point pi) {
        return sqrt(pow(pi.getX() - getX(), 2) + pow(pi.getY() - getY(), 2));
    }


    public static void main(String[] args) {
        Point p1 = new Point(1, 4);
        Point p2 = new Point(5, 4);
        System.out.println(p1.euclideanDistance(p2));
    }
}
