package com.tp2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DirectedGraph {
    List<Vertex> vertexList = new ArrayList<>();

    public DirectedGraph() {

    }

//    public void addVertex(int vertex) {
//        vertexList.add(new Vertex(vertex));
//    }
//
//    public Vertex getVertex(int vertex) {
//        int location = 0;
//        this.contains(vertex, location);
//        return vertexList.get(location);
//    }
//
//    public boolean addEdge(int origin, int destiny, int cost) {
//        int location = 0;
//        if (this.contains(origin, location) && this.contains(destiny)) {
//            vertexList.get(location).addEdge(this.getVertex(destiny), cost);
//            return true; //pudo ser agregado; + ve.getAdjacencyList().toString()
//        }
//        return false; //no pudo ser agregado;
//    }
//
//    public boolean contains(int origin) {
//        ListIterator<Vertex> vertexListIterator = vertexList.listIterator();
//        while (vertexListIterator.hasNext()) {
//            if (vertexListIterator.next().getValue() == origin) { //Pertenece
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean contains(int origin, int pos) {
//        ListIterator<Vertex> vertexListIterator = vertexList.listIterator();
//        while (vertexListIterator.hasNext()) {
//            if (vertexListIterator.next().getValue() == origin) { //Pertenece
//                pos = vertexListIterator.nextIndex();
//                return true;
//            }
//        }
//        return false;
//    } //Imple
    //Implementacion con int

    public boolean contains(Vertex vertex) {
        return vertexList.contains(vertex);
    }

    public boolean addVertex(Vertex vertex) {
        if (!this.contains(vertex)) {
            vertexList.add(vertex);
            return true;
        } else {
            return false; //no pudo ser agregado porque ya pertenece al grafo
        }
    }

    public boolean removeVertex(Vertex vertex) { //todo eliminar todas las aristas que apuntan a ese vertice
        if (vertexList.contains(vertex)) {
            vertexList.remove(vertex);
            return true;
        }
        return false;
    }

    public boolean addEdge(Vertex vertex, Vertex destiny, int cost) { //todo chequear que no existe el arco
        vertex.addEdge(new Edge(destiny, cost));
        return true;
    }

    public boolean removeEdge(Vertex vertex, Vertex destiny) {
        vertex.removeEdge(destiny);
        return true;
    }

    public boolean existEdge(Vertex origin, Vertex destiny) {
        return origin.isConnectedTo(destiny);
    }

    public List<Vertex> getVertexList() {
        List<Vertex> vertexListCopy = new ArrayList<>();
        ListIterator<Vertex> vertexListIterator = vertexList.listIterator();
        while (vertexListIterator.hasNext()) {
            vertexListCopy.add(vertexListIterator.next());
        }
        return vertexListCopy;
    }

    @Override
    public String toString() {
        String graph = "";
        for (Vertex ve : vertexList) {
            graph = graph + ve;
            graph += ve.getAdjacencyList();
            graph += "\n";
        }
        return graph;
    }

    public static void main(String[] args) {
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        DirectedGraph graph = new DirectedGraph();
        graph.addVertex(v1);
        graph.addVertex(v4);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v2);
        graph.addEdge(v1, v3, 10);
        graph.addEdge(v2, v1, 10);
        graph.addEdge(v2, v3, 10);
        graph.addEdge(v2, v4, 10);
        graph.addEdge(v4, v1, 10);
//        graph.addEdge(5,1,10);
//        graph.addEdge(5,2,10);
        System.out.println(graph.toString());
        graph.removeVertex(v1);
        graph.removeEdge(v2, v4);
        System.out.println(graph.toString());
//        System.out.println("No hay drama bro");
    }
}
