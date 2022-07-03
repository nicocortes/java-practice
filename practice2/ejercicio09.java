/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice2;

/**
 *
 * @author ncort
 */
import java.util.*;

public class ejercicio09 {
   public static void main(String[] args){
      int n, numRandom;
      Scanner reed = new Scanner(System.in);
      Random rd = new Random();
      numRandom = rd.nextInt(101)+1;
      System.out.println(numRandom);
      System.out.println("Se generó un número entero entre 1 y 100, intente adivinarlo");
      n = reed.nextInt();
      
      while(n != numRandom ){
          if(n < numRandom){
             System.out.print("El número ingresado es menor. Intente de nuevo: ");
               n = reed.nextInt();
          } else {
              System.out.print("El número ingresado es mayor. Intente de nuevo: ");
              n = reed.nextInt();
          }
      } 
      
       System.out.println("Felicidades ha adivinado!! El número era " + numRandom);         
   }   
}
