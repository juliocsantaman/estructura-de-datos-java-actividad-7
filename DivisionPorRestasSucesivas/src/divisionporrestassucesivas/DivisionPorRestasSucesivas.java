/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisionporrestassucesivas;

import java.util.Scanner;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class DivisionPorRestasSucesivas {

    public int divPorRestasSucesivas(int dividendo, int divisor) {
        
        if(dividendo-divisor < 0) {
 
            return 0; //Caso de salida o base.
              
        } else {
            
            return 1 + divPorRestasSucesivas(dividendo-divisor, divisor); //Caso de recursividad.
        }
    }

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        DivisionPorRestasSucesivas obj = new DivisionPorRestasSucesivas();
        int num1=0, num2=0;
        boolean verificar=false;
        
        System.out.println("***** PROGRAMA PARA DIVIDIR DOS NÚMEROS POR RESTAS SUCESIVAS *****");
        
        do {            
            try {
                System.out.print("Escribe el número 1 (dividendo): ");
                num1=entrada.nextInt();
                
                System.out.print("Escribe el número 2 (divisor): ");
                num2=entrada.nextInt();
                
                if(num1 <= 0 || num2 <= 0) {
                    verificar=false;
                    System.out.println("Error: no se debe poner números menores o igual que cero.");
                } else {
                    System.out.println("El resultado es: " + obj.divPorRestasSucesivas(num1, num2) + ".");
                    verificar=true;
                }

            } catch (Exception e) {
                System.out.println("Error: nos has escrito un valor válido. Vuelve a intentarlo.");
                entrada.nextLine();
            }
        } while (!verificar);
        
    }
    
}
