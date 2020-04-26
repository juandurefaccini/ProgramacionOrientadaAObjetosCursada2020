package com.tp2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DirectedGraph {
    List<Vertex> vertexList = new ArrayList<>();

    public DirectedGraph() {

    }

    public void addVertex(int vertex) {
        vertexList.add(new Vertex(vertex));
    }

    public Vertex getVertex(int vertex) {
        int location = 0;
        this.contains(vertex, location);
        return vertexList.get(location);
    }

    public boolean addEdge(int origin, int destiny, int cost) {
        int location = 0;
        if (this.contains(origin, location) && this.contains(destiny)) {
            vertexList.get(location).addEdge(this.getVertex(destiny), cost);
        }
        return false;
    }

    public boolean contains(int origin) {
        ListIterator<Vertex> vertexListIterator = vertexList.listIterator();
        while (vertexListIterator.hasNext()) {
            if (vertexListIterator.next().getValue() == origin) { //Pertenece
                return true;
            }
        }
        return false;
    }

    public boolean contains(int origin, int pos) {
        ListIterator<Vertex> vertexListIterator = vertexList.listIterator();
        while (vertexListIterator.hasNext()) {
            if (vertexListIterator.next().getValue() == origin) { //Pertenece
                pos = vertexListIterator.nextIndex();
                return true;
            }
        }
        return false;
    }
//
//    @Override
//    public String toString() {
//        for (Vertex ve :vertexList){
//            System.out.println(ve.getValue());
//        }
//    }

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
//        System.out.println(graph.toString());
        System.out.println("No hay drama bro");
    }
}
