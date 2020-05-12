package edu.unicen.tp3.geometricShapes;

import edu.unicen.tp2.Point;

public class Elipse extends FiguraBasica {
    Point centro;
    Point a;
    Point b;

    public Elipse() {
    }

    public Elipse(Point centro, Point a, Point b) {
        this.centro = centro;
        this.a = a;
        this.b = b;
    }

    public Point getCentro() {
        return centro;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }
}
