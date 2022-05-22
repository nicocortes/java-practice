/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico1;

/**
 *
 * @author ncort
 */
import java.util.*;

public class ejercicio06 {
    public static void main(String[] args) {
        float minSide, maxSide, perim, sup;
       
         Scanner input = new Scanner(System.in);       
        
        System.out.print("Ingrese el lado menor del rectángulo: ");
        minSide = input.nextFloat();
        
        System.out.print("Ingrese el lado menor del rectángulo: ");
        maxSide = input.nextFloat();
        
        perim = minSide + maxSide;
        sup = minSide*maxSide;
        
        System.out.println("Rectángulo de lados " + minSide + " y " + maxSide);
        System.out.println("\n-> Perímetro: " + perim);
        System.out.println("-> Superficie: " + sup);      
                
    }

}
