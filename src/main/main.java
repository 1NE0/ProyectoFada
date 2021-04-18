/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import interfaz.principalUI;
import java.util.ArrayList;
import logica.LogicaBinaria;
import logica.LogicaDeVerdad;
import logica.LogicaLista;

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
//         LogicaBinaria a =new LogicaBinaria();
//       for(int i=0; i<500;i++){
//           a.agregarnum(i);
//       }
//                 
//                 
//                 
//         
//         
//        LogicaBinaria b =new LogicaBinaria();
//      for(int i=0; i<500;i++){
//           b.agregarnum(i);
//       }
//                 
//        
//              
//        
//        long inicio = System.currentTimeMillis();      
//        b.union(a.getA());
//   
//        
//          
//         
//        long fin = System.currentTimeMillis();
//         
//        double tiempo = (double) ((fin - inicio));
//         
//        System.out.println(tiempo +" milisegundos");
       
       principalUI principal = new principalUI();
       principal.setVisible(true);
      
       //ArrayList listaA = new ArrayList();
       //listaA.add(1);
       //listaA.add(2);
       //listaA.add(3);
       //listaA.add(4);
       //listaA.add(5);
       
//        ArrayList listab = new ArrayList();
//       listab.add(6);
//       listab.add(2);
//       listab.add(3);
//       listab.add(4);
//       listab.add(7);
//       listab.add(8);
//       
//       
//       
//       LogicaLista a = new LogicaLista(listaA);
//        LogicaLista b = new LogicaLista(listab);
//        
//        a.union(b.getConjuntoA());
//        a.interseccion(b.getConjuntoA());
        
    }
    
  
    
}
