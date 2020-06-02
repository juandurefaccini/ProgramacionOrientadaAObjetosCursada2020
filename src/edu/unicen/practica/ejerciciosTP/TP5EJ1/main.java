package edu.unicen.practica.ejerciciosTP.TP5EJ1;

import edu.unicen.practica.ejerciciosTP.TP5EJ1.Condicion.CondicionEFS;
import edu.unicen.practica.ejerciciosTP.TP5EJ1.Condicion.CondicionNombre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        // BUscar archivos cuyo nombre sea juan.

        Directorio raiz = new Directorio("C:");

        Directorio Escritorio = new Directorio("C:Escritorio/");
        Comprimido comp = new Comprimido("COMPRIMIDO", 1.5, "zip");
        comp.addArchivo(new Archivo("juan", "txt", 10));
        comp.addArchivo(new Archivo("juan", "txt", 103));
        comp.addArchivo(new Archivo("juan", "txt", 102));
        comp.addArchivo(new Archivo("juan", "txt", 10));
        comp.addArchivo(new Archivo("juan", "txt", 101));


        Escritorio.addArchivo(new Archivo("josemi", "txt", 1));
        Escritorio.addArchivo(new Link("link", " ", Escritorio));
        Escritorio.addArchivo(comp);

        raiz.addArchivo(new Archivo("juan", "txt", 10));
        raiz.addArchivo(new Archivo("juan", "txt", 1000));
        raiz.addArchivo(new Archivo("juan", "txt", 15));
        raiz.addArchivo(new Archivo("juan", "txt", 12));
        raiz.addArchivo(new Archivo("juan", "txt", 16));
        raiz.addArchivo(new Archivo("ensayo", "gimp", 52));
        raiz.addArchivo(new Archivo("bro", "png", 100));
        raiz.addArchivo(Escritorio);

        System.out.println(raiz.toString());
        System.out.println();

        CondicionEFS c = new CondicionNombre("juan");
        Set<EFS> r = raiz.cumpleCondicion(c);
        System.out.println(r);
        Collections.sort(new ArrayList<>(r),new ComparableSize());
        System.out.println(r);

    }
}
