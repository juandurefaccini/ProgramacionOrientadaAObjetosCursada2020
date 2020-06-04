package edu.unicen.practica.parcial2018;

import edu.unicen.practica.parcial2018.condiciones.CondicionElemento;
import edu.unicen.practica.parcial2018.condiciones.CondicionElementoTitulo;
import edu.unicen.practica.parcial2018.modificacion.ModificacionElemento;
import edu.unicen.practica.parcial2018.modificacion.ModificacionNoticiaCategoria;
import edu.unicen.practica.parcial2018.modificacion.ModificacionNoticiaPalabraClave;

import java.util.*;

public class Seccion extends ElementoDiarioElectronico{
    Set<ElementoDiarioElectronico> contenido;

    @Override
    public ElementoDiarioElectronico copiaRestringida(CondicionElemento c) {
        Set<ElementoDiarioElectronico> elementosQueCumplen = new HashSet<>();
        for (ElementoDiarioElectronico elem : contenido){
            ElementoDiarioElectronico copia = elem.copiaRestringida(c);
            if(copia!=null)
                elementosQueCumplen.add(copia);
        }
        Seccion copia = this.copia();
        copia.addElem(elementosQueCumplen);
        return copia;
    }

    private void addElem(Set<ElementoDiarioElectronico> elementosDiarioElectronico) {
        contenido.addAll(elementosDiarioElectronico);
    }
    protected Seccion copia() {
        return new Seccion();
    }

    public Seccion(){
        contenido = new HashSet<>();
    }

    @Override
    public String getCategoria() {
        return categoriaMasRepetida(contenido);
    }

    @Override
    public void actualizarNoticia(CondicionElemento c, ModificacionElemento m) {
        for (ElementoDiarioElectronico elem : contenido)
            elem.actualizarNoticia(c,m);
    }

    private String categoriaMasRepetida(Set<ElementoDiarioElectronico> contenido) {
        if(!contenido.isEmpty()){
            Map<String,Integer> ocurrencias = getOcurrencias(contenido);
            Integer max = 1;
            String maxString = " ";
            for (Map.Entry<String, Integer> entry : ocurrencias.entrySet()){
                if (entry.getValue() > max){
                    max = entry.getValue();
                    maxString = entry.getKey();
                }
            }
            return maxString;
        }
        return " ";
    }

    private Map<String, Integer> getOcurrencias(Set<ElementoDiarioElectronico> contenido) {
        Map<String,Integer> ocurrencias = new HashMap<String,Integer>();
        for(ElementoDiarioElectronico elem : contenido){
            if (!ocurrencias.containsKey(elem.getCategoria())){
                ocurrencias.put(elem.getCategoria(),1);
            }
            else{
                ocurrencias.put(elem.getCategoria(),ocurrencias.get(elem.getCategoria())+1); //incrementa en 1
            }
        }
        return ocurrencias;
    }

    @Override
    public Set<String> getPalabrasClave() {
        Set<String> palabrasClave = new HashSet<>();
        for ( ElementoDiarioElectronico elem : contenido ){
            palabrasClave.addAll(elem.getPalabrasClave());
        }
        return Collections.unmodifiableSet(palabrasClave);
    }

    public void addElem(ElementoDiarioElectronico elementoDiarioElectronico) {
        contenido.add(elementoDiarioElectronico);
    }

    @Override
    public String toString() {
        return "Seccion{" +
                "contenido=" + contenido +
                '}';
    }

    public static void main(String[] args) {
        SeccionTrendingTopics seccion = new SeccionTrendingTopics();
        Noticia noticia = new Noticia("a","a");
        Noticia noticia1 = new Noticia("g","g");
        Noticia noticia2 = new Noticia("g","g");
        Noticia noticia3 = new Noticia("a","a");
        Noticia noticia4 = new Noticia("e","e");
        Noticia noticia5 = new Noticia("f","f");
        Noticia noticia6 = new Noticia("g","g");
        Noticia noticia7 = new Noticia("a","a");

       seccion.addElem(noticia);
       seccion.addElem(noticia1);
       seccion.addElem(noticia2);
       seccion.addElem(noticia3);
       seccion.addElem(noticia4);
       seccion.addElem(noticia5);
       seccion.addElem(noticia6);
       seccion.addElem(noticia7);

       noticia.palabrasClave.add("a");
       noticia6.palabrasClave.add("b");
       noticia.palabrasClave.add("f");
       noticia2.palabrasClave.add("o");
       noticia1.palabrasClave.add("u");
       noticia4.palabrasClave.add("y");
       noticia4.palabrasClave.add("z");
       noticia4.palabrasClave.add("zzz");
       noticia4.palabrasClave.add("zzzzzz");
       noticia4.palabrasClave.add("zzzzzzz");
       noticia4.palabrasClave.add("zzzzzzzzzz");
       noticia4.palabrasClave.add("zzzzzz");
       noticia4.palabrasClave.add("eeefee");
       noticia4.palabrasClave.add("eeegee");
       noticia4.palabrasClave.add("eeehee");
       noticia5.palabrasClave.add("i");
       noticia.palabrasClave.add("b");
       noticia.palabrasClave.add("e");

       System.out.println(seccion.getCategoria());
       System.out.println(seccion.getPalabrasClave());

//        System.out.println("a");
//        System.out.println(seccion.copiaRestringida(new CondicionElementoTitulo("g")));
//        System.out.println("a");
//
//        System.out.println(noticia);
//        System.out.println();
//       noticia.actualizarNoticia(new CondicionElementoTitulo("a"),new ModificacionNoticiaCategoria("jacintoperaltaramos",new ModificacionNoticiaPalabraClave("kaka")));
//       System.out.println(noticia);
    }
}
