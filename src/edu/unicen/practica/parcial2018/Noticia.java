package edu.unicen.practica.parcial2018;

import edu.unicen.practica.parcial2018.condiciones.CondicionElemento;
import edu.unicen.practica.parcial2018.modificacion.ModificacionElemento;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Noticia extends ElementoDiarioElectronico{
    String titulo;
    String categoria;
    String contenido;
    String autor;
    Set<String> palabrasClave;

    protected ElementoDiarioElectronico copia() {
        Noticia copia = new Noticia(
                getTitulo(),
                getCategoria(),
                getAutor(),
                getContenido(),
                getPalabrasClave()
        );
        return copia;
    }

    public Noticia(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
        palabrasClave = new HashSet<>();
    }

    public Noticia(String titulo, String categoria, String autor, String contenido, Set<String> palabrasClave) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.contenido = contenido;
        this.autor = autor;
        this.palabrasClave = palabrasClave;
    }

    public Noticia(String titulo,String autor, String categoria, String contenido) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.contenido = contenido;
        this.autor = autor;
        this.palabrasClave = new HashSet<>();
    }

    @Override
    public Set<String> getPalabrasClave() {
        return Collections.unmodifiableSet(palabrasClave);
    }

    @Override
    public void actualizarNoticia(CondicionElemento c, ModificacionElemento m) {
        if(c.cumple(this))
            m.modificar(this);
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set2.addAll(Collections.unmodifiableSet(set));
        System.out.println(set2);
        set2.remove("a");
        System.out.println(set);
        System.out.println(set2);

    }

    public String getContenido() {
        return this.contenido;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void addPalabraClave(String palabraClave) {
        palabrasClave.add(palabraClave);
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public ElementoDiarioElectronico copiaRestringida(CondicionElemento c) {
        if(c.cumple(this)) {
            return copia();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", contenido='" + contenido + '\'' +
                ", autor='" + autor + '\'' +
                ", palabrasClave=" + palabrasClave +
                '}';
    }
}
