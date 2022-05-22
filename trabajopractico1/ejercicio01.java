/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico1;

import java.util.*;
public class ejercicio01 {
    public static void main(String[] args) {
        int n1, n2, n3, suma;
        
        Scanner numberInput = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
         n1 = numberInput.nextInt();
        
         System.out.print("Ingrese el segundo numero: ");
         n2 = numberInput.nextInt();
        
         System.out.print("Ingrese el tercer numero: ");
         n3 = numberInput.nextInt();
        
            suma = n1 + n2 + n3;
        
        System.out.println("La suma de los numeros ingresados es " + suma);
    }
    
}
