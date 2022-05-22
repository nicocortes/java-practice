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

public class ejercicio09 {
    public static void main(String[] args) {
        int x1, x2, y1, y2, per, sup, sideOne = 0, sideTwo = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Se le pedirá ingresar las coordenadas de 2 puntos P1(x1, y1) y P2(x2, y2), para formar un rectángulo.");
        System.out.print("Ingrese x1: ");
        x1 = input.nextInt();
        
        System.out.print("Ingrese y1: ");
        y1 = input.nextInt();
        
        System.out.print("Ingrese x2: ");
        x2 = input.nextInt();
        
        System.out.print("Ingrese y2: ");
        y2 = input.nextInt();
        
        if (x1<x2){
            sideOne = x2-x1;
        } else {
            sideOne = x1-x2;
        }
        
        if (y1<y2){
            sideTwo = (y2-y1);
        } else {
            sideTwo = (y1-y2);
        }
        
        per = sideOne + sideTwo;
        sup = sideOne*sideTwo;
        
        System.out.println("\n -> Perímetro: " + per);
        System.out.println(" -> Superficie: " + sup);

    }

}
