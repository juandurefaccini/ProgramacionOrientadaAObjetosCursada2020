package edu.unicen.tp4.ej6_Abstraccion;

import java.util.*;

public class SistemaAsignacion {
    String nombre;
    Set<Evaluador> evaluadores = new HashSet<>();
    Set<Trabajo> trabajos = new HashSet<>();
    Set<String> temasEspecificos = new HashSet<>(); //Uso coleccion porque no necesito acceder a un indice
    //especifico ademas de permitirme hacer mas rapida la interseccion

    public void addEvaluador(Evaluador evaluador){
        evaluadores.add(evaluador);
    }

    public void addTrabajo(Trabajo trabajo){
        trabajos.add(trabajo);
    }

    public void addTemasEspecificos(String tema){
        temasEspecificos.add(tema);
    }

    public SistemaAsignacion(String nombre) {
        this.nombre = nombre;
    }

    public boolean esExperto(Evaluador evaluador) {return !Collections.disjoint(temasEspecificos, evaluador.getCollectionTemas());}

    public Collection<?> posiblesEvaluadores(Trabajo trabajo){
        Collection<Evaluador> posiblesEvaluadores = new ArrayList<>();
        for (Evaluador evaluador : evaluadores){
            if (trabajo.puedeSerEvaluado(evaluador)){
                posiblesEvaluadores.add(evaluador);
            }
        }
        return Collections.unmodifiableCollection(posiblesEvaluadores);
    }

    public Collection<?> posiblesTextos(Evaluador evaluador){
        Collection<Trabajo> posiblesTextos = new ArrayList<>();
        for (Trabajo trabajo : trabajos){
            if (trabajo.puedeSerEvaluado(evaluador)){
                posiblesTextos.add(trabajo);
            }
        }
        return Collections.unmodifiableCollection(posiblesTextos);
    }

    public static void main(String[] args) {
        SistemaAsignacion sistemaAsignacion = new SistemaAsignacion("Conicet");

        Evaluador ev = new Evaluador("Juan");
        Evaluador ev2 = new Evaluador("Franco");
        Evaluador ev3 = new Evaluador("Licha");

        Trabajo t = new Trabajo("EP1");
        Trabajo t2 = new Trabajo("EP2");
        Trabajo t3 = new Trabajo("EP3");
        Trabajo t4 = new Trabajo("EP4");

        sistemaAsignacion.addTemasEspecificos("A");

        t.addTema("A");
        t.addTema("B");
        t.addTema("C");

        t2.addTema("A");
        t2.addTema("B");
        t2.addTema("C");

        t3.addTema("A");
        t3.addTema("B");
//        t3.addTema("C");

        t4.addTema("A");
        t4.addTema("B");
        t4.addTema("C");
        t4.addTema("D");

        ev.addTema("A");
        ev.addTema("B");
        ev.addTema("C");

        ev2.addTema("A");
        ev2.addTema("B");
        ev2.addTema("C");

        sistemaAsignacion.addEvaluador(ev);
        sistemaAsignacion.addEvaluador(ev2);

        sistemaAsignacion.addTrabajo(t);
        sistemaAsignacion.addTrabajo(t2);
        sistemaAsignacion.addTrabajo(t3);

        System.out.println(sistemaAsignacion.posiblesEvaluadores(t));
        System.out.println(sistemaAsignacion.posiblesTextos(ev));

        System.out.println(sistemaAsignacion.esExperto(ev));

    }
}
