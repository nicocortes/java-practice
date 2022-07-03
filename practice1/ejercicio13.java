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

public class ejercicio13 {
    public static void main(String[] args) {
        int n1, n2, n3;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        n1 = input.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        n2 = input.nextInt();
        
        System.out.print("Ingrese el tercer numero: ");
        n3 = input.nextInt();
        
        if(n1 < n2 && n2 < n3){
           System.out.print("Los números estan ordenados de forma ascendente");
           if(n2 == n1+1 && n3 == n2+1){
               System.out.println(" y son consecutivos.");
           }
        }
        
        if(n3 < n2 && n2 < n1){
            System.out.print("Los números estan ordenados de forma descendente");
             if(n2 == n3+1 && n1 == n2+1){
               System.out.println(" y son consecutivos.");
           }
        }
    }

}
