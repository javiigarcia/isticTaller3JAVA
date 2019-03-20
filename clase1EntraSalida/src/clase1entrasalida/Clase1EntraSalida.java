/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1entrasalida;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Clase1EntraSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hola mundo");
        int edad ;
        edad = 33 ;
        System.out.println("Su edad es " + edad);

        Scanner miscanner ;
        miscanner = new Scanner (System.in);

        System.out.println("Por favor ingrese su edad");
        edad = miscanner.nextInt();
         System.out.println("Su edad es " + edad);
        
        
        
        
        
        
    }
    
}
