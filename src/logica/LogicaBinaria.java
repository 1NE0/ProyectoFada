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
        int posarreglo = a/32;
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
        for(int i = 0 ; i < this.a.length; i++){  // RECORRER EL ARREGLO
            int uno = 1;    // CREAMOS EL NUMERO 1, QUE ES EL QUE SE CORRERA 32 VECES
            for(int j = 0; j < 32 ; j++ ){  // EL FOR PARA CORRER EL FOR HACIA <--- IZQUIERDA, 31 VECES
                int numeroActual = this.a[i];   // 32 BITS A MIRAR
                int resultado = numeroActual & uno;  // COMPARAMOS EL UNO CON ESTE NUMERO
                int convertidor = (j+1) + (32*i);    // HACEMOS EL CONVERTIDOR DE LAS POSICIONES
                
                if(resultado == uno){       // SI EL RESULTADO DEVUELVE EL MISMO 1, QUIERE DECIR QUE "CONVERTIDOR" SE ENCUENTRA EN EL ARREGLO
                    cadena += " " + convertidor;  // AGREGAR CONVERTIDOR A LA CADENA DE RESULTADO
                }
                uno = uno << 1;   // PASAMOS A LA SIGUIENTE POSICION
            }
            
        }
        
        
        return cadena;
        
    }
    
    
    
 
    
    
}
