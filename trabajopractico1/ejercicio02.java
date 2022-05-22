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
public class ejercicio02 {
        public static void main(String[] args) {
                int n1, n2, prom;

                Scanner numberInput = new Scanner(System.in);
                
                System.out.print("Ingrese el primer numero: ");
                 n1 = numberInput.nextInt();
                   
                System.out.print("Ingrese el segundo numero: ");
                  n2 = numberInput.nextInt();
                  
                prom = (n1 + n2)/2;
                
                System.out.println("El promedio de los números ingresados es " + prom);


        }
}
