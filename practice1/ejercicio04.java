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

public class ejercicio04 {
     public static void main(String[] args) {
         float measureM, measureD, measureC;
         
         Scanner numberInput = new Scanner(System.in);
         
         System.out.print("Ingrese una medida en metros: ");
         measureM = numberInput.nextFloat();
         
         measureD = measureM*10;
         measureC = measureM*100;
         
         
         System.out.println("\n-> Medida en metros: " + measureM + "m");
         System.out.println("-> Medida en decímetros: " + measureD + "dm");
         System.out.println("-> Medida en centímetros: " + measureC + "cm");
     }
}