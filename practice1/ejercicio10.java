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

public class ejercicio10 {
    public static void main(String[] args) {
        float x, y, x1, y1, a1, x2, y2, a2, detX, detY, det;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Se le pedirá ingresar dos ecuaciones de la forma x + y = a");
        System.out.print("Ingrese x1: ");
        x1 = input.nextFloat();
        
        System.out.print("Ingrese y1: ");
        y1 = input.nextFloat();
        
        System.out.print("Ingrese a1: ");
        a1 = input.nextFloat();
        
        System.out.print("Ingrese x2: ");
        x2 = input.nextFloat();
        
        System.out.print("Ingrese y2: ");
        y2 = input.nextFloat();
        
        System.out.print("Ingrese a2: ");
        a2 = input.nextFloat();
        
        det = x1*y2-y1*x2;
        detX = a1*y2-y1*a2;
        detY = x1*a2-a1*x2;
        x = detX/det;
        y = detY/det;
        
        System.out.println("\nEl resultado del sistema es: ");
        System.out.println("-> x = " + x);
        System.out.println("-> y = " + y);

    }

}
