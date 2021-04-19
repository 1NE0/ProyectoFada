/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author howl
 */
public class LogicaLista {

    private ArrayList conjuntoA;
    //private ArrayList conjuntoB;

    public LogicaLista(ArrayList conjuntoA) {
        this.conjuntoA = conjuntoA;
        //this.conjuntoB = conjuntoB;
    }

    // métodos
    public void addA(short numero) {
        System.out.println("AÑADIENDO EN A el numero : " + numero);
        if (!conjuntoA.contains(numero)) {
            conjuntoA.add(numero);
        }

    }

    //public void addB(short numero){
    //  System.out.println("AÑADIENDO EN B el numero : " + numero);
    //conjuntoB.add(numero);
    //}
    public String toStringA() {
        String resultado = "";
        for (Object numero : conjuntoA) {
            resultado += " " + numero + "";
            System.out.println(resultado);

        }

        return resultado;
    }

    public String ver() {
        String resultado = "";
        for (int i = 0; i < conjuntoA.size(); i++) {
            resultado = resultado + " " + conjuntoA.get(i) + "";
            System.out.println(resultado);
        }
        return resultado;
    }

    //public String toStringB(){
    //  String resultado = "";
    //for(Object numero : conjuntoB) {
    //  resultado += " " + numero + "";
    //}
    //return resultado;
    //}    
    public String union(ArrayList arreglob) {
        ArrayList uniones = new ArrayList();
        System.out.println("conjunto A: " + toStringA());
        //System.out.println("conjunto B: " + toStringB());
        for (Object numero : arreglob) {
            if (conjuntoA.contains(numero) && !(uniones.contains(numero))) {
                uniones.add(numero);
                System.out.println("se agrego:" + numero);
            }
            if (!(conjuntoA.contains(numero)) && !(uniones.contains(numero))) {
                uniones.add(numero);
                System.out.println("se agrego:" + numero);
            } else {

                //System.out.println("no se agrego"+ numero);
            }
        }
        for (Object numero : conjuntoA) {
            if (!(uniones.contains(numero))) {
                uniones.add(numero);
                System.out.println("se agrego" + numero);
            }

        }
        for (Object numero : uniones) {
            System.out.println("esta:" + numero);

        }
        return resultadoString(uniones);

    }

    public ArrayList getConjuntoA() {
        return conjuntoA;
    }

    public String resultadoString(ArrayList arreglo) {
        String resultado = "";
        for (Object numero : arreglo) {
            resultado += " " + numero + "";
        }

        return resultado;
    }

    public String interseccion(ArrayList arreglob) {
        ArrayList unido = new ArrayList();
        System.out.println("conjunto A: " + toStringA());
        //System.out.println("conjunto B: " + toStringB());
        if (conjuntoA.size() > arreglob.size()) {
            for (Object numero : arreglob) {
                if (conjuntoA.contains(numero)) {
                    unido.add(numero);
                    System.out.println("se agrego:" + numero);
                }
            }
        } else {
            for (Object numero : conjuntoA) {
                if (arreglob.contains(numero)) {
                    unido.add(numero);
                    System.out.println("se agrego:" + numero);
                }
            }
        }

        return resultadoString(unido);
    }

    public String complemento() {
        String resultado = "";
        for (int j = 0; j < 512; j++) {
            if (!this.conjuntoA.contains((short)j)) {
                resultado += " " + j;
            }
        }

        return resultado;
    }

}
