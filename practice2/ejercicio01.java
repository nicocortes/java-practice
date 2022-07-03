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

public class ejercicio01 {
    public static void main(String[] args){
        String n1, n2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Se le pedirá ingresar dos números en sistema binario de 4 digitos o más.");
        do{
            System.out.print("Ingrese el primer número: ");
            n1 = input.next();
        }while(Integer.parseInt(n1) < 1000);
        
         do{
            System.out.print("Ingrese el segundo número: ");
            n2 = input.next();
        }while(Integer.parseInt(n2) < 1000);
         
         System.out.println("\nLa suma de los números ingresados es " + addBinaries(n1, n2));
         
    }
    
    public static String addBinaries(String n1, String n2){
        int a1, a2, r1;
        String result;
        
        a1 = Integer.parseInt(n1, 2);
        a2 = Integer.parseInt(n2, 2);
        
        r1 = a1 + a2;
        
        result = Integer.toString(r1, 2);

        return result;
    }
  
}
