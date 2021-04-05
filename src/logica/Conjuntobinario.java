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
    
    public String convertidor(String cadena){
        int contador = 1;
        String resultado = "";
        
        for(int i = cadena.length(); i > 0;i--){
            if(cadena.substring(i - 1).equals("1")){
                System.out.println("entro al if");
                resultado += contador;
                resultado += " ";
            }
            contador++;
        }
        
        return resultado;
    }
    
    public void agregarnum(int a){
        int posarreglo = a/32;
        int pos= this.a[(this.a.length - posarreglo)-1];//[{0.0.0.0} {0.0.0.0} {0.0.0.0} {0.1.1.0} {0.0.0.0}]
        int numeroanterior=pos;
        int desplazamientos= ((a%32)-1);
        this.a[(this.a.length -posarreglo)-1] = 1;///{{0.0.0.1}}
        this.a[(this.a.length -posarreglo)-1] = this.a[(this.a.length -posarreglo)-1] << desplazamientos;  
        this.a[(this.a.length -posarreglo)-1]= this.a[(this.a.length -posarreglo)-1]  | numeroanterior;
        
        String resultado = "";
        for(int o : this.a){
                resultado += Integer.toBinaryString(o);
        }
        
        System.out.println("resultado en binario : " + resultado);
        
       
        System.out.println("posicion : "+convertidor(resultado));
        
    }

    
    public int[] getA() {
        return a;
    }

    public int[] getB() {
        return b;
    }
    
    
    
 
    
    
}
