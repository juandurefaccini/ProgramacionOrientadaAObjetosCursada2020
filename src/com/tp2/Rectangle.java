package com.tp2;

/*Implementar la clase Rectángulo.
        Para esta clase es necesario definir el rectángulo utilizando los puntos como vértices. Se
        trabajará con Rectángulos cuyos lados estén paralelos a los ejes.
        Nota. Definir la estructura que debe poseer un rectángulo y en base a esto implementar
        los atributos de la clase.
        La funcionalidad que debe proveer un rectángulo es la siguiente
        -> Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e
        Y.
        -> Calcular el Área del rectángulo.
        -> Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
        iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
        del mismo es mayor que la del otro.
        -> Poder invertir el rectángulo. Si se toma un vértice, invertirlo es cambiar el
        sentido del rectángulo, si estaba hacia arriba, ahora está hacia abajo y si estaba
        hacia adelante está hacia atrás. El tamaño del rectángulo debe ser el mismo.
        -> Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
        propiedades para que sea un cuadrado.
        -> Determinar el largo del lado superior.
        -> Determinar si esta acostado o parado (si el alto es mayor que el ancho).*/

public class Rectangle {
    Point p1;
    Point p2;
    Point p3;
    Point p4;

    public Rectangle(Point p1, Point p3) { //Input of the two corners
        this.p1 = p1;
        this.p3 = p3;
        p2 = new Point();
        p4 = new Point();
        p2.shiftAxis(p1.getX(), p3.getY());
        p4.shiftAxis(p3.getX(), p1.getY());
    }

    public void shift(double x, double y) {
        this.p1.shiftAxis(x, y);
        this.p2.shiftAxis(x, y);
        this.p3.shiftAxis(x, y);
        this.p4.shiftAxis(x, y);
    }

    public double getArea() {
        return p1.euclideanDistance(p2) * p2.euclideanDistance(p3);
    }

    public int greaterThan(Rectangle r) {
        double Area = getArea();
        double Area2 = r.getArea();
        return Double.compare(Area, Area2);
    }

    public void reverse() {//todo revisar si es un intercambiar puntos o si es hacer negativas las coordenadas
        /*p1.swap(p3);
        p2.swap(p4);*/
        p1.setX(-p1.getX());
        p2.setX(-p2.getX());
        p3.setX(-p3.getX());
        p4.setX(-p4.getX());
    }

    public boolean isASquare() {
        return p1.euclideanDistance(p2) == p2.euclideanDistance(p3);
    }

    public double getHeight() {
        return p1.euclideanDistance(p2);
    }

    public double getWidth() {
        return p1.euclideanDistance(p4);
    }

    public boolean isLying() {
        return getWidth() > getHeight();
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(new Point(1, 1),
                new Point(5, 5));
        Rectangle rec2 = new Rectangle(new Point(1, 1),
                new Point(10, 10));
        System.out.println(rec.isASquare());
        System.out.println(rec.getHeight());
        System.out.println(rec.getWidth());
        System.out.println(rec2.getArea());

    }
}
