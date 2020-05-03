package com.tp2.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DirectedGraph {

    List<Vertex> vertexList = new ArrayList<>();

    static private int currentTime;

    public DirectedGraph() {

    }

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
        return vertex.addEdge(new Edge(destiny, cost));
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
    public String toString() { //todo Usar el toString de vertex
        String graph = "";
        for (Vertex ve : vertexList) {
            graph = graph + ve;
            graph = graph + "i:" + ve.getDiscoverTime() + " f:" + ve.getFinishTime() + " ";
            graph += ve.getAdjacencyList();
            graph += "\n";
        }
        return graph;
    }

    public void DFS_Forest(Vertex vertex) {
        ListIterator<Vertex> vertexListIterator = vertexList.listIterator();
        while (vertexListIterator.hasNext()) {
            if (vertexListIterator.next().getDiscoverTime() != 1) {
                DFS(vertexListIterator.next());
            }
        }
    }

    public void DFS(Vertex vertex) {
        vertex.setDiscoverTime(++currentTime);
        List<Edge> adjacencyList = vertex.getAdjacencyList();
        ListIterator<Edge> adjacencyListIterator = adjacencyList.listIterator();
        while (adjacencyListIterator.hasNext()) {
            Vertex ady = adjacencyListIterator.next().getDestiny();
            if (!ady.discovered()) { //Not discovered yet
                DFS(ady);
            }
        }
        vertex.setFinishTime(++currentTime);
    }

//    public void BFS(Vertex vertex){
//        List<Vertex> vertexRow = new ArrayList<>(); //todo armar clase fila para hacerlo mas entendible
//        vertexRow.add(vertex);
//        Vertex next;
//        do {
//            next = vertexRow.get(0);
//            vertexRow.addAll(next.getAdjacentVertex()); //todo aclaracion, es necesario que el tipo qu edevueve el metodo sea tipo lista, no tipo lista<Vertex>
//            if (next.getNumberOfAdjacentVertex() == 0){
//                next.setFinishTime(++currentTime);
//            }
//            vertexRow.remove(0);
//        }while (!vertexRow.isEmpty());
//        return;
//    }

//    public void BFS(Vertex vertex){
//        currentTime = 0;
//        List<Vertex> vertexRow = new ArrayList<>(); //todo armar clase fila para hacerlo mas entendible
//        vertexRow.add(vertex);
//        ListIterator <Vertex> vertexRowIterator = vertexRow.listIterator();
//        List<Edge> adjacentList = new ArrayList<>();
//        do{
//            Vertex current = vertexRowIterator.next();
//            current.setDiscoverTime(++currentTime);
//            //adjacentList.addAll(current.getAdjacentVertex());
//            adjacentList = current.getAdjacencyList();
//            ListIterator<Edge> adjacentListIterator = adjacentList.listIterator();
//            Edge aux;
//            while (adjacentListIterator.hasNext()){
//                aux = adjacentListIterator.next();
//                vertexRow.add(aux.getDestiny());
//            }
//            current.setFinishTime(++currentTime);
//            //vertexRowIterator.remove();
//        }while(vertexRowIterator.hasNext());
//    }

    public void BFS(Vertex vertex) {
        currentTime = 0;
        List<Vertex> vertexRow = new ArrayList<>(); //todo armar clase fila para hacerlo mas entendible
        vertexRow.add(vertex);
        List<Edge> adjacentList = new ArrayList<>();
        do {
            vertexRow.get(0).setDiscoverTime(++currentTime);
            adjacentList = vertexRow.get(0).getAdjacencyList();
            for (Edge edge : adjacentList) {
                if (!edge.getDestiny().isVisited()) {
                    vertexRow.add(edge.getDestiny());
                }
            }
            //vertexRow.get(0).setFinishTime(++currentTime);
            vertexRow.remove(0);
        } while (!vertexRow.isEmpty());
    }

    public static void main(String[] args) {
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);
        DirectedGraph graph = new DirectedGraph();
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);
        graph.addVertex(v6);
        graph.addEdge(v1, v3, 10);
        graph.addEdge(v3, v2, 10);
        graph.addEdge(v3, v4, 10);
        graph.addEdge(v2, v5, 10);
        graph.addEdge(v1, v6, 10);
//        graph.addEdge(5,1,10);
//        graph.addEdge(5,2,10);
//        System.out.println(graph.toString());
//        graph.removeVertex(v1);
//        graph.removeEdge(v2, v4);
        graph.BFS(v1);
        System.out.println(graph.toString());
    }
}
