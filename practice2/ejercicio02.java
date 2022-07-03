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

public class ejercicio02 {
        public static void main(String[] args){
            int n, product = 1, count;
            Scanner input = new Scanner(System.in);
            
            do{
                System.out.print("Ingrese un número natural: ");
                n = input.nextInt();
            }while(n <= 0);
            
            count = n;
            
            while(count > 0){
                product = product*count;
                System.out.println(product);
                count--;
            }
            
            System.out.println("\nEl resultado de !" + n + " es " + product);
        }
}
