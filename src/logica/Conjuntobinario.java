/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Amferu
 */
public class Conjuntobinario {
    private int a[];
    private int b[];

    public Conjuntobinario() {
     this.a=new int[16];
     this.b= new int [16];  
    }
    
    
    
    public void agregarnum(int a){
        int posarreglo = a/32;
        int pos= this.a[(this.a.length - posarreglo)-1];//[{0.0.0.0} {0.0.0.0} {0.0.0.0} {0.1.1.0} {0.0.0.0}]
        int numeroanterior=pos;
        int desplazamientos= ((a%32)-1);
        this.a[(this.a.length -posarreglo)-1] = 1;///{{0.0.0.1}}
        this.a[(this.a.length -posarreglo)-1] = this.a[(this.a.length -posarreglo)-1] << desplazamientos;  
        this.a[(this.a.length -posarreglo)-1]= this.a[(this.a.length -posarreglo)-1]  | numeroanterior;
        
    }

    public int[] getA() {
        return a;
    }

    public int[] getB() {
        return b;
    }
    
    
    
 
    
    
}
