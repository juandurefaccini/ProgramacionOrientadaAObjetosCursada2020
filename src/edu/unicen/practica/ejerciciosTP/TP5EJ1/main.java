package edu.unicen.practica.ejerciciosTP.TP5EJ1;

public class main {
    public static void main(String[] args) {
        // BUscar archivos cuyo nombre sea juan.

        Directorio raiz = new Directorio("C:");

        Directorio Escritorio = new Directorio("C:Escritorio/");
        Comprimido comp = new Comprimido("COMPRIMIDO", 1.5, "zip");
        comp.addArchivo(new Archivo("juan", "txt", 10));
        comp.addArchivo(new Archivo("juan", "txt", 10));
        comp.addArchivo(new Archivo("juan", "txt", 10));
        comp.addArchivo(new Archivo("juan", "txt", 10));
        comp.addArchivo(new Archivo("juan", "txt", 10));


        Escritorio.addArchivo(new Archivo("josemi", "txt", 1));
        Escritorio.addArchivo(new Link("link", " ", Escritorio));
        Escritorio.addArchivo(comp);

        raiz.addArchivo(new Archivo("juan", "txt", 10));
        raiz.addArchivo(new Archivo("ensayo", "gimp", 50));
        raiz.addArchivo(new Archivo("bro", "png", 100));
        raiz.addArchivo(Escritorio);

        System.out.println(raiz.toString());

        System.out.println("CantElementos: " + raiz.getCantElementos());

        System.out.println("Size: " + raiz.getSize());

    }
}
