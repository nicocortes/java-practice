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

public class ejercicio12 {
  public static void main(String[] args) {
      int day, month, year, actualDay, actualMonth, actualYear, birthDay, birthMonth, birthYear;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Ingrese el año actual: ");
      actualYear = input.nextInt();
      
      System.out.print("Ingrese el mes actual: ");
      actualMonth = input.nextInt();
      
      System.out.print("Ingrese el dia actual: ");
      actualDay = input.nextInt();
      
      System.out.print("\nIngrese el año de nacimiento: ");
      birthYear = input.nextInt();
      
      System.out.print("Ingrese el mes de nacimiento: ");
      birthMonth = input.nextInt();
      
      System.out.print("Ingrese el dia de naciemiento: ");
      birthDay = input.nextInt();
      
      year = actualYear-birthYear;
      
      if(actualMonth-birthMonth < 0){
         month = 12+(actualMonth-birthMonth);
         year--;
      } else {
          month = actualMonth-birthMonth;
      }
      
      if(actualDay-birthDay < 0){
          day = 30+(actualDay-birthDay);
          month--;
      } else {
          day = actualDay-birthDay;
      }
      
      
      System.out.println("\n Usted tiene " + year + " años, " + month + " meses, " + day + " dias.");

  }

}
