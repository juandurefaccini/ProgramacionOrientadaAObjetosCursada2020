package edu.unicen.tp3.geometricShapes;

import edu.unicen.tp2.Point;

public class Triangulo extends Poligono {
    Point a;
    Point b;
    Point c;

    public Triangulo(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
