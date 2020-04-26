package com.tp2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Vertex {
    int value;
    List<Edge> edgeList = new ArrayList<>();

    public Vertex(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public List<Edge> getAdjacencyList() { //todo consultar: es necesario definir el tipo de lista en el retorno
        List<Edge> aux = new ArrayList<>();
        for (Edge edge : edgeList) {
            aux.add(edge);
        }
        return aux;
    }

    public void addEdge(Vertex destiny, int cost) {//todo condicion para no agregar dos arcos a un mismo vertice
        edgeList.add(new Edge(destiny, cost));
    }

    public void removeEdge(Vertex destiny) {
        edgeList.removeIf(b -> b.getDestiny().getValue() == destiny.getValue()); //filter
    }

    public boolean isConnectedTo(Vertex destiny) {
        ListIterator<Edge> edgeListIterator = edgeList.listIterator();
        while (edgeListIterator.hasNext()) {
            if (edgeListIterator.next().getDestiny().getValue() == (destiny.getValue())) {
                //todo if(edgeListIterator.next().getDestiny()==(destiny))
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return " " + value + " ";
    }

    public static void main(String[] args) {
        Vertex uno = new Vertex(1);
        Vertex dos = new Vertex(2);
        Vertex tres = new Vertex(3);
        Vertex cinco = new Vertex(5);
        uno.addEdge(new Vertex(2), 10);
        uno.addEdge(new Vertex(5), 10);
        uno.addEdge(new Vertex(3), 10);
        System.out.println(uno.getAdjacencyList());
        uno.removeEdge(new Vertex(5));
        uno.removeEdge(new Vertex(2));
        System.out.println(uno.getAdjacencyList());
        System.out.println(uno.isConnectedTo(new Vertex(3)));
    }
}
