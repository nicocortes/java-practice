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

public class ejercicio05 {
     public static void main(String[] args) {
         float tempF, tempC;
         
         Scanner numberInput = new Scanner(System.in);
         
         System.out.print("Ingresa la temperatura en Fahrenheit: ");
         tempF = numberInput.nextFloat();
         
         tempC = ((tempF-32)*5)/9;
         
         System.out.println("\n-> Temp. en Fahrenheit: " + tempF + "F");
         System.out.println("-> Temp. en Celcius: " + tempC + "C");

     }
}
