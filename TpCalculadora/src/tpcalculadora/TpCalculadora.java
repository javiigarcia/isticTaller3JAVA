/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcalculadora;
 
import java.util.Scanner;

/** 
 *
 * @author PC
 */
public class TpCalculadora {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int PrimerValor ;
        int SegundoValor ;
        int Respuesta ;
        
        Scanner lector ;
        lector = new Scanner (System.in) ;
       
         System.out.println("Ingrese primer numero:");       
        PrimerValor = lector.nextInt();
        
        System.out.println("Ingrese segundo numero");
        SegundoValor = lector.nextInt();
        
        Respuesta   = Calculadora.sumarConParametros(PrimerValor, SegundoValor);
        System.out.println("La respuesta es: " + Respuesta );

        
        
        Respuesta   = Calculadora.restarConParametros(PrimerValor, SegundoValor);
        System.out.println("La respuesta es: " + Respuesta );   
        
        
        
        
        
        
        
        
       /* Calculadora.sumar();
        int Resultado = Calculadora.sumarConRetorno();
        System.out.println("La suma es " + Resultado);
        
        Resultado = Calculadora.sumarConParametros(33,33);
        System.out.println("El resultado es:" + Resultado);*/
       
        
                
        
        /*
        System.out.println("Hola");
        Scanner lector ;
        lector = new Scanner (System.in) ;
        int edad ;
        edad = lector.nextInt();
        System.out.println("La edad es:" + edad);
       */
        
        
        
                
    }
    
}
