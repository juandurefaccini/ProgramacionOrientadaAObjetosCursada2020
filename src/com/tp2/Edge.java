package com.tp2;

import java.security.PublicKey;

public class Edge {
    int cost;
    Vertex destiny;

    public Edge(Vertex destiny, int cost) {
        this.cost = cost;
        this.destiny = destiny;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Vertex getDestiny() {
        return destiny;
    }

    public void setDestiny(Vertex destiny) {
        this.destiny = destiny;
    }

    @Override
    public String toString() {
        return " -->" + destiny +
                "(" + cost + ")";
    }
}
