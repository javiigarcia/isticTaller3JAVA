/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpentradaysalida;

/**
 *
 * @author PC
 */
public class FuncionesEstaticas {    
    
     public static void saludar(){
         System.out.println("Bienvenido a Java");
     }
   
    public static void SaludarConNombre(String Nombre ){
        System.out.println("Bienvenido " +Nombre+ " a Java");
        
    } 
    public static void SaludarConNombreYApellido(String Nombre , String Apellido){
        System.out.println("Su nombre es " +Nombre+ " y " +Apellido+ " es su apellido");
        
    }
    public static void SaludarConNombreYEdad(String Nombre , int Edad){
        System.out.println("Usted se llama " +Nombre+ " y tiene " +Edad+ " años de edad");
           
    }
    
    public static void SumarSinRetorno(int num1 , int num2 ){
       int Result;
       Result = num1 + num2;
        System.out.println("La suma de " +num1+ " + "  +num2+ " = " +Result); 
    }
    
    public static void SumarConRetorno(int num1 , int num2 ){
        int Result;
       Result = num1 + num2;
       
        
    }
    
}
 



