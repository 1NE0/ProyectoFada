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
public class ConjuntosLista {
    
    
       private ArrayList conjuntoA;
       private ArrayList conjuntoB;

    public ConjuntosLista(ArrayList conjuntoA, ArrayList conjuntoB) {
        this.conjuntoA = conjuntoA;
        this.conjuntoB = conjuntoB;
    }
       
       
    // métodos
    
    public void addA(short numero){
        System.out.println("AÑADIENDO EN A el numero : " + numero);
        conjuntoA.add(numero);
    }
    
    public void addB(short numero){
        System.out.println("AÑADIENDO EN B el numero : " + numero);
        conjuntoB.add(numero);
    }
       
    public String toStringA(){
        String resultado = "";
        for(Object numero : conjuntoA) {
            resultado += " " + numero + "";
        }
        
        return resultado;
    } 
    
    public String toStringB(){
        String resultado = "";
        for(Object numero : conjuntoB) {
            resultado += " " + numero + "";
        }
        return resultado;
    }    
    
    
    public String union(){
        ArrayList unido;
        if(conjuntoA.size() > conjuntoB.size()){
            
        }
        return resultadoString(unido);
        
    }
    
    public String resultadoString (ArrayList arreglo){
        String resultado = "";
        for(Object numero : arreglo) {
            resultado += " " + numero + "";
        }
        
        return resultado;
    }
    
    public String interseccion(){
        ArrayList unido = new ArrayList();
        System.out.println("conjunto A: " + toStringA());
        System.out.println("conjunto B: " + toStringB());
        if(conjuntoA.size() > conjuntoB.size()){
            for(Object numero : conjuntoB){
                if(conjuntoA.contains(numero)){
                    unido.add(numero);
                }
            }
        }
        
        return resultadoString(unido);
    }
}
