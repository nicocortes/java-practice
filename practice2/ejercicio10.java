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

public class ejercicio10 {
     public static void main(String[] args){
        double n, result;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        n = input.nextInt();
        
        result = valorAbsoluto(n);
        result = raizCuadrada(result);
        
        System.out.println("El resultado es " + result);
     }
     
     public static Double valorAbsoluto(double num){
         double abs = Math.abs(num);
         
         return abs;
     }
     
     public static Double raizCuadrada(double num){
         double sqrt = Math.sqrt(num);
         
         return sqrt;
     }
}
