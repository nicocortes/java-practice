/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice1;

/**
 *
 * @author ncort
 */
import java.util.*;

public class ejercicio14 {
        public static void main(String[] args) {
            int n1, n2, n3, max, mid, min;
            
            Scanner input = new Scanner(System.in);
            
            System.out.print("Ingrese el primer número: ");
            n1 = input.nextInt();
            System.out.print("Ingrese el segundo número: ");
            n2 = input.nextInt();
            System.out.print("Ingrese el tercer número: ");
            n3 = input.nextInt();
            
            if(n1 == n2){
               System.out.println("Los números ingresados son iguales");
            } else {
                if(n1 > n2){
                mid = n1;
                min = n2;
                 } else {
                    mid = n2;
                    min = n1;
                 }   
            
                if(mid > n3){
                    max = mid;
                    if(min > n3){
                     mid = min;
                     min = n3;
                    } else {
                        mid = n3;
                    }
                } else {
                    max = n3;              
                }
                
              System.out.println("Los números en forma ascendente: " + min + " " + mid + " " + max);
            }
                        
          }
        
    
}
