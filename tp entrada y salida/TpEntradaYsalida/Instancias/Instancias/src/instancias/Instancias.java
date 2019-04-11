/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

/**
 *
 * @author PC
 */
public class Instancias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Legajo ; 
        String Nombre;
        Alumno UnAlumno ;
        UnAlumno = new Alumno ();
        UnAlumno.Legajo = 777;
        UnAlumno.Mostrar();
        Alumno otroAlumno = new Alumno ();
        otroAlumno.Legajo = 555;
        otroAlumno.Mostrar();
        
        Calculadora uncal = new Calculadora ();
        uncal.NumeroUno = 10;
        uncal.NumeroDos = 15 ;
        uncal.Sumar();
        System.out.println("El resultado es " + uncal.Resultado);
        
                
        
        
        
        
        
        
        
    }
    
}
