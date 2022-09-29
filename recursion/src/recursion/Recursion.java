/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Recursion {
     
    //Factorial de un número.
    public static long factorial(long n){

        long result=1; //Contador

        if (n <= 1){ //Caso de salida o caso base.

            result = 1;
        
        } else {

            //caso recursivo
            result = n * factorial(n-1); 

        }

        return result;

    }
    
    
    //Serie fibonacci.
    public static long fibonacci(long n) {

        long result=1; //Contador

        if (n <= 1){ //Caso de salida
            
            result = 1;
            
        }else {
            
            //caso recursivo
            result = fibonacci(n-1) + fibonacci(n-2); 

        }

        return result;

    }



    
    public static void main(String[] args) {
        
        System.out.println("El factorial de 3 es: " + factorial(3) + ".");
        
        //System.out.println("Fibonacci de 4 es: " + fibonacci(4));
        
    }
    
}
