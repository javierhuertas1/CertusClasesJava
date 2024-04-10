/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafunciones;

/**
 *
 * @author mark42
 */
public class JavaFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("La suma del numero 5 y 2 es "+SumarNumero(5,2));
        System.out.println("La resta del numero 4 y 2 es "+RestaEnteros(4, 2));
        System.out.println("La division de el numero 10 entre 5 es "+DivisionNumero(10, 5));
        
        
        
    }
    
    public static int SumarNumero(int valor1 , int valor2){

        int respuesta;
        respuesta = valor1 + valor2;
        return respuesta;
        
    }
    
    
    
    
    public static int RestaEnteros (int valor1 , int valor2){
        int respuesta;
        
        respuesta = valor1 - valor2;
        return respuesta;
        
    }

    public static int DivisionNumero(int numero1 , int numer2){
        int respuestaDivision ;

        respuestaDivision = numero1 / numer2;

        return respuestaDivision;
    }
    
}
