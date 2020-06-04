package edu.unicen.practica.parcial2018;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SeccionTrendingTopics extends Seccion{
    @Override
    public String getCategoria() {
        return "Trending topics";
    }

    @Override
    public Set<String> getPalabrasClave() {
        List<String> l = new ArrayList<String>(super.getPalabrasClave());
        l.sort(String::compareTo);
        return new HashSet<>(l.subList(0,5));
    }

    public static void main(String[] args) {
        SeccionTrendingTopics seccionTrendingTopics = new SeccionTrendingTopics();
        seccionTrendingTopics.getPalabrasClave();
    }
}
