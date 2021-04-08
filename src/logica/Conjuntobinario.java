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

    public Conjuntobinario() {
     this.a=new int[16];
    }
    
    public String convertidor(String cadena){
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
        int posarreglo = a/(32 + 1);   // sumarle el 1 de transaccion
        int pos= this.a[(this.a.length - 1 ) - posarreglo];//[{0.0.0.0} {0.0.0.0} {0.0.0.0} {0.1.1.0} {0.0.0.0}]
        int numeroanterior=pos;  // 00000000000000000000000000000000
        int desplazamientos= ((a%32)-1);
        this.a[(this.a.length -posarreglo)-1] = 1;///{{0.0.0.1}}
        this.a[(this.a.length -posarreglo)-1] = this.a[(this.a.length -posarreglo)-1] << desplazamientos;  
        this.a[(this.a.length -posarreglo)-1]= this.a[(this.a.length -posarreglo)-1]  | numeroanterior;
        
        String resultado = "";
        for(int o : this.a){
            String resultadoParcial = "";
            resultadoParcial += (Integer.toBinaryString(o))+ "";
            int resultadoParcialTamanio = resultadoParcial.length();
            String cerosPoner = "";
            for(int contador = 0 ; contador < (32 - resultadoParcialTamanio) ; contador++){
                cerosPoner += "0";
            }
            resultado += cerosPoner + resultadoParcial;
        }
        
    }

    public String union (int b[]){
        
        
        return "";
    }
    
    
    public int[] getA() {
        return a;
    }

    
    public String Atostring(){
        String resultado = "";
        for(int o : this.a){
            String resultadoParcial = "";
            resultadoParcial += (Integer.toBinaryString(o))+ "";
            int resultadoParcialTamanio = resultadoParcial.length();
            String cerosPoner = "";
            for(int contador = 0 ; contador < (32 - resultadoParcialTamanio) ; contador++){
                cerosPoner += "0";
            }
            
            
            resultado += cerosPoner + resultadoParcial;
        }
        
        return convertidor(resultado);
    }
    
    
 
    
    
}
