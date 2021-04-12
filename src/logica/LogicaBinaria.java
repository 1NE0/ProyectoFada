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
public class LogicaBinaria {
    private int a[];

    public LogicaBinaria() {
     this.a=new int[16];
    }
    
    public String arreglo(String cadena){
        int contador = 1;
        String resultado = "";
        
        for(int i = cadena.length(); i > 0;i--){
            if(cadena.charAt(i - 1) == '1'){
                    resultado += contador;   // {1 2 3}
                    resultado += " ";
            }   
            contador++;
        }
        
        return resultado;           // 4 = 0101         000000000000000000000000000001010 00000000000000000000000000000000 
    }
    
    public void agregarnum(int a){     // 00000000000000000000000000000000  00000000000000000000000000000000  00000000000000000000000000000000  00000000000000000000000000000000  00000000000000000000000000000000  00000000000000000000000000000000
        int posarreglo = a/32;   // 
        System.out.println("el posarreglo es : " + posarreglo);
        int pos= this.a[posarreglo];//[{0.0.0.0} {0.0.0.0} {0.0.0.0} {0.1.1.0} {0.0.0.0}]
        int numeroanterior=pos;  // 00000000000000000000000000000000
        int desplazamientos= a%32;
        this.a[posarreglo] = 1;///{{0.0.0.1}}
        this.a[posarreglo] = this.a[posarreglo] << desplazamientos - 1;  
        this.a[posarreglo]= this.a[posarreglo]  | numeroanterior;
        
        
//        for(int i = 0 ; i < this.a.length - 1 ; i++){
//            System.out.println(this.a[i] + "auch");
//        }
        System.out.println("---------");
        
        System.out.println("la cadena en texto es : " +  this.toString());
        
        System.out.println("---------");
        
    }

    public String union (int b[]){
        
        
        return "";
    }
    
    
    public int[] getA() {
        return a;
    }

    public String toString(){
        String cadena = "";
        for(int i = 0 ; i < this.a.length; i++){
            int uno = 1;
            for(int j = 0; j < 32 ; j++ ){
                int numeroActual = this.a[i];
                int resultado = numeroActual & uno;
                System.out.println("resultado es : " + resultado + "en la posicion :" + (j+1));
                uno = uno << 1;
            }
            System.out.println("/////////////////");
            
        }
        
        
        return cadena;
        
    }
    
    
    
 
    
    
}
