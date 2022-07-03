/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice2.proposal3;

/**
 *
 * @author ncort
 */

public class Profesor {
    String nombre;
    String apellidos;
    int edad;
    boolean casado;
    boolean especialista;
    
    Profesor(){
      nombre = "";
      apellidos = "";
      edad = 0;
      casado = false;
      especialista = false;
    }
    
    Profesor(String nombreIn, String apellidosIn, int edadIn, boolean casadoIn, boolean especialistaIn){
      nombre = nombreIn;
      apellidos = apellidosIn;
      edad = edadIn;
      casado = casadoIn;
      especialista = especialistaIn;
    }
    
    public void setNombre(String nombreIn){
        nombre = nombreIn;
    }
    
    public void setApellido(String apellidoIn){
        apellidos = apellidoIn;
    }
    
    public void setEdad(int edadIn){
        edad = edadIn;
    }
    
    public void setCasado(boolean casadoIn){
        casado = casadoIn;
    }
    
    public void setEspecialista(boolean especialistaIn){
        especialista = especialistaIn;
    }
    
    public static void main(String[] args){
        Profesor profesor1 = new Profesor();
        Profesor profesor2 = new Profesor("Juan", "Gomez", 54, false, true);
        
        System.out.println(profesor2.nombre);
    }
}
