package edu.unicen.tp3.geometricShapes;

import edu.unicen.tp2.Point;

public class Circulo extends Elipse {
    public Circulo(Point centro, Point extremo) { //Extremo es un punto que pertenece a la circunferencia
        super(centro, extremo, new Point(centro.getX(), centro.getY() + extremo.getX() - centro.getX())); //Calculo el otro punto);
    }
}
