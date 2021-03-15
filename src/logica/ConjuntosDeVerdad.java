/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author howl
 */
public class ConjuntosDeVerdad {
    
    
    private boolean conjuntoA[];
    private boolean conjuntoB[];

    public ConjuntosDeVerdad() {
        conjuntoA = new boolean[21];
        conjuntoB = new boolean[21];
    }
    
    
    
    public boolean[] getConjuntoA() {
        return conjuntoA;
    }

    public boolean[] getConjuntoB() {
        return conjuntoB;
    }
    
    public void addA(short numero){
        conjuntoA[numero] = true;
    }
    
    public void addB(short numero){
        conjuntoB[numero] = true;
    }
    
    public String conjuntotoString(boolean conjunto[]){
        
        String resultado = "";
        for(int i=0;i<conjunto.length;i++){
            if(conjunto[i]){
                // SE ENCUENTRA ALGUN NUMERO AQUI
                resultado += " " + i + "";
            }else{
            }
        }
        
        return resultado;
    }
    
    public String conjuntoAtoString(){
        
        String resultado = "";
        for(int i=0;i<conjuntoA.length;i++){
            if(conjuntoA[i]){
                // SE ENCUENTRA ALGUN NUMERO AQUI
                resultado += " " + i + "";
            }else{
            }
        }
        
        return resultado;
    }
    public String conjuntoBtoString(){
        
        String resultado = "";
        for(int i=0;i<conjuntoB.length;i++){
            if(conjuntoB[i]){
                // SE ENCUENTRA ALGUN NUMERO AQUI
                resultado += " " + i + "";
            }else{
            }
        }
        
        return resultado;
    }
    
    public String union(){
        boolean conjuntoResultado[] = new boolean[21];
        
        for(int i=0;i<conjuntoA.length;i ++){
            if(conjuntoA[i]){
                if(!conjuntoResultado[i]){
                System.out.println("entreee al A");
                conjuntoResultado[i] = true;
                }
            }
            
        }
        for(int i=0;i<conjuntoB.length;i ++){
            if(conjuntoB[i]){
                if(!conjuntoResultado[i]){
                System.out.println("entreee al B");
                conjuntoResultado[i] = true;
                }
            }
        }
        
        return conjuntotoString(conjuntoResultado);
    }
    
    public String interseccion(){
        return "";
    }
}
