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

public class ejercicio07 {
    public static void main(String[] args) {
        float radio, diam;
        double per, area;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el radio del círculo: ");
        radio = input.nextFloat();
        
        diam = radio*2;
        per = 2*Math.PI*radio;
        area = Math.PI*Math.pow(radio, 2);
        
        System.out.println("\n -> Diámetro: " + diam);
        System.out.println(" -> Perímetro: " + per);
        System.out.println(" -> Área: " + area);

    }
    
}
