/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import interfaz.principalUI;
import java.util.ArrayList;
import logica.Conjuntobinario;
import logica.ConjuntosDeVerdad;
import logica.ConjuntosLista;

/**
 *
 * @author howl
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Conjuntobinario conjun= new Conjuntobinario();
      conjun.agregarnum(4);
      conjun.agregarnum(35);
       conjun.agregarnum(2);
      
        int[] aa= conjun.getA();
       for(int i=0; i<aa.length; i++){
           System.out.println(aa[i]);
}  
    }
    
  
    
}
