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

public class ejercicio08 {
    public static void main(String[] args) {
        double price, iva, iibb, muni;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        price = input.nextFloat();
        
        iva = price*.21;
        iibb = price*.025;
        muni = price*.015;
        
        System.out.println("\nImpuestos a pagar:");
        System.out.println("-> IVA: $" + iva);
        System.out.println("-> Ingresos Brutos: $" + iibb);
        System.out.println("-> Municipalidad: $" + muni);

    }

}
