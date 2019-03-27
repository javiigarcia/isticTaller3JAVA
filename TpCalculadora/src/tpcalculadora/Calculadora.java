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
public class Calculadora {
    public static void sumar(){
        System.out.println("Estoy sumando con retorno");
        int numeroUno;
        int numeroDos;
        int suma;
        
        
        Scanner lector ;
        lector = new Scanner (System.in) ;
        
        System.out.println("Ingrese primer numero:");       
        numeroUno = lector.nextInt();
        
        System.out.println("Ingrese segundo numero");
        numeroDos = lector.nextInt();
    
        
        suma = numeroUno + numeroDos ;
        System.out.println("La suma es: " + suma);
        
           
    }
    public static int sumarConRetorno () {
    System.out.println("Estoy sumando con retorno");
        int numeroUno;
        int numeroDos;
        int suma;
        
        
        Scanner lector ;
        lector = new Scanner (System.in) ;
        
        System.out.println("Ingrese primer numero:");       
        numeroUno = lector.nextInt();
        
        System.out.println("Ingrese segundo numero");
        numeroDos = lector.nextInt();
    
        
        suma = numeroUno + numeroDos ;
        //System.out.println("La suma es: " + suma); 
        return suma;
        
        
    }
    public static int sumarConParametros (int ParametroUno ,int ParametroDos ) {
       int suma ;
       suma = ParametroUno + ParametroDos;
       return suma;
               
    } 
    
    public static int restarConParametros (int ParametroUno ,int ParametroDos ) {
       int resta ;
       resta = ParametroUno - ParametroDos;
       return resta;
    
    }
    
    
}
