package edu.unicen.tp3.geometricShapes;

import edu.unicen.tp2.Point;

public class Cuadrado extends Cuadrilatero {
    public Cuadrado(Point a, Point b) {
        super(a, b, new Point(a.getX(), b.getY()), new Point(b.getX(), a.getY()));
    }
}
