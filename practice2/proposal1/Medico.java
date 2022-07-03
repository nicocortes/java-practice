/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice2.proposal1;

/**
 *
 * @author ncort
 */
public class Medico {
    String nombre;
    String apellido;
    int edad;
    boolean casado;
    String nroDni;
    String especialidad;
    
     Medico(){
        nombre = "Luis";
        apellido = "Bazán";
        edad = 60;
        casado = true;
        nroDni = "15988668";
        especialidad = "Oftalmólogo"; 
        
       
    }
      public void setName(String name){
            String nombreAnterior = nombre;
            nombre = name;
            System.out.println("Se ha cambiado el nombre " + nombreAnterior + " por " + nombre);
        }
      
        public void setSurname(String surname){
            String apellidoAnterior = apellido;
            apellido = surname;
            System.out.println("Se ha cambiado el apellido " + apellidoAnterior + " por " + apellido);
        }
        
          public void setEspecialidad(String speciality){
            String especialidadAnterior = especialidad;
            especialidad = speciality;
            System.out.println("Se ha cambiado el apellido " + especialidadAnterior + " por " + especialidad);
        }
     
     
     public static void main(String[] args){
         Medico medico1 = new Medico();
         
         medico1.setName("Oscar");
         medico1.setSurname("Carbajo");
         medico1.setEspecialidad("Neurólogo");

         
     }
}
