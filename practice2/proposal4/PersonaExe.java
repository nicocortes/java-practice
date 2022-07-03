/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice2.proposal4;

/**
 *
 * @author ncort
 */
import java.util.*;

public class PersonaExe {
    
    public static void pesoMsj(String nombre, int pesoPersona) {
        System.out.println("pesoPersona" + pesoPersona);
        switch(pesoPersona){
            case -1:
                System.out.println("-> " + nombre + "está por debajo del peso ideal.");
            case 0:
                System.out.println("-> " + nombre + " tiene peso ideal.");
            case 1:
                System.out.println("-> " + nombre + " tiene sobrepeso.");
        }
    }
    
    public static void edadMsj(String nombre, boolean edadPersona) {
        if(edadPersona) {
            System.out.println("-> " + nombre + " es mayor de edad");
        } else {
            System.out.println("-> " + nombre + " es menor de edad");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
 
            System.out.println("Ingrese el nombre para la persona: ");
            String nombre = input.next();
            
            System.out.println("Ingrese la edad para la persona: ");
            int edad = input.nextInt();
            
            System.out.println("Ingrese el sexo para la persona: ");
            String sexo = input.next();

            System.out.println("Ingrese el peso para la persona: ");
             float peso = input.nextFloat();

            System.out.println("Ingrese la altura para la persona: ");
            float altura = input.nextFloat();
            
            Persona personaUno = new Persona(nombre, edad, sexo, peso, altura);
            Persona personaDos = new Persona(nombre, edad, sexo);
            Persona personaTres = new Persona();
            
            personaTres.setNombre("Victoria");
            personaTres.setEdad(30);
            personaTres.setSexo("F");
            personaTres.setPeso(55);
            personaTres.setAltura(155);
            
            System.out.println("\n------------------------------\n");
            
            pesoMsj(personaUno.getNombre(), personaUno.calcularIMC());
            pesoMsj(personaDos.getNombre(), personaDos.calcularIMC());
            pesoMsj(personaTres.getNombre(), personaTres.calcularIMC());
     
            System.out.println("\n------------------------------\n");
            
            edadMsj(personaUno.getNombre(), personaUno.esMayorDeEdad());
            edadMsj(personaDos.getNombre(), personaDos.esMayorDeEdad());
            edadMsj(personaTres.getNombre(), personaTres.esMayorDeEdad());
            
            System.out.println("\n------------------------------\n");

            personaUno.toStringPerson();
            System.out.println("\n++++++++++\n");
            
            personaDos.toStringPerson();
            System.out.println("\n++++++++++\n");

            personaTres.toStringPerson();
            System.out.println("\n++++++++++\n");
    }
}
