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

public class ejercicio03 {
    public static void main(String[] args) {
        int n1, n2;
        double media;
        
        Scanner numberInput = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        n1 = numberInput.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        n2 = numberInput.nextInt();
        
        media = Math.sqrt(n1*n2);
        System.out.println("La media geométrica de los números ingresados es " + media);
    }
}
