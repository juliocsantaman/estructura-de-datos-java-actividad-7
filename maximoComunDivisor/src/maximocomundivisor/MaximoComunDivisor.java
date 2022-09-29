/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximocomundivisor;

import java.util.Scanner;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class MaximoComunDivisor {
    
    //Caso de salida o base.
    public int mcd(int a, int b) {
        if(a%b == 0) {
            return b;
        } else {
            //Caso de recursividad.
            return mcd(b, a%b);
        }
    }


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        MaximoComunDivisor obj = new MaximoComunDivisor();
        
        int num1=0, num2=0, mcd=0;
        boolean verificar=false;
      
        System.out.println("****** PROGRAMA PARA OBTENER EL MÁXIMO COMÚN DIVISOR DE DOS NÚMEROS *****");
        
        do {                                          
            try {
                System.out.print("Escriba el número 1: ");
                num1=entrada.nextInt();

                System.out.print("Escriba el número 2: ");
                num2=entrada.nextInt();
                
                if(num1<=0 || num2<=0) {
                    verificar=false;
                    System.out.println("Error: no se debe poner números menores o igual que cero.");
                } else {
                    mcd = obj.mcd(num1, num2);
                    System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + mcd);
                    verificar=true;
                }

            } catch (Exception e) {
                System.out.println("Error: no has escrito un valor válido.");
                entrada.nextLine();
            }
        } while (verificar==false);

    }
    
}
