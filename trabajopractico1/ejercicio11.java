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

public class ejercicio11 {
   public static void main(String[] args) {
       int n1, n2, n3, c1, c2 ,h;
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Se le pedirá ingresar 3 números positivos.");
       
       do{
           System.out.print("Ïngrese el primero: ");
           n1 = input.nextInt();
       }while(n1<0);
       
       do{
           System.out.print("Ïngrese el segundo: ");
           n2 = input.nextInt();
       }while(n2<0);
       
       do{
           System.out.print("Ïngrese el tercero: ");
           n3 = input.nextInt();
       }while(n3<0);
       
       if (n1 > n2 ){
           if(n1 > n3){
               h = n1;
               c1 = n2;
               c2 = n3;
           } else {
               h = n3;
               c1 = n2;
               c2 = n1;
           }
       } else{
           if(n2 > n3){
               h = n2;
               c1 = n1;
               c2 = n3;               
           } else {
               h = n3;
               c1 = n2;
               c2 = n1;
           }
       }
       
       if(Math.pow(c1, 2) + Math.pow(c2, 2) == Math.pow(h, 2)){
           System.out.println("\nLos valores ingresados SI corresponden a los lados de un triángulo rectángulo!!!");
       } else {
           System.out.println("\nLos valores ingresados NO corresponden a los lados de un triángulo rectángulo");

       }
   }
}
