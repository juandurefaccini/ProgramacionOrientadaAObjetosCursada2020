package edu.unicen.tp2.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Vertex {
    int value;
    List<Edge> edgeList = new ArrayList<>();
    boolean visited;
    int discoverTime = -1;
    int finishTime = -1;

    public int getFinishTime() {
        return finishTime;
    }

    public int getDiscoverTime() {
        return discoverTime;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isVisited() {
        return visited;
    }

    public boolean discovered() {
        return discoverTime != -1;
    }

    public void setDiscoverTime(int discoverTime) {
        this.discoverTime = discoverTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }

    public Vertex(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public List getAdjacencyList() { //todo consultar: es necesario definir el tipo de lista en el retorno
        List<Edge> aux = new ArrayList<>();
        for (Edge edge : edgeList) {
            aux.add(edge);
        }
        return aux;
    }

    public List getAdjacentVertex() {
        List<Vertex> aux = new ArrayList<>();
        for (Edge edge : edgeList) {
            aux.add(edge.getDestiny());
        }
        return aux;
    }

    public int getNumberOfAdjacentVertex() {
        return edgeList.size();
    }

    public boolean addEdge(Edge edge) {
        if (!this.isConnectedTo(edge.getDestiny())) {
            edgeList.add(edge);
            return true;
        } else {
            return false;
        }
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
        System.out.println(uno.getAdjacencyList());
        uno.removeEdge(new Vertex(5));
        uno.removeEdge(new Vertex(2));
        System.out.println(uno.getAdjacencyList());
        System.out.println(uno.isConnectedTo(new Vertex(3)));
    }

}
