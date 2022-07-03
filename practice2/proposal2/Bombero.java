/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice2.proposal2;

/**
 *
 * @author ncort
 */
public class Bombero {
    String nombre;
    String apellido;
    int edad;
    boolean casado;
    boolean especialista;
    
    public Bombero(String nombreIn, String apellidoIn, int edadIn, boolean casadoIn, boolean especialistaIn){
        nombre = nombreIn;
        apellido = apellidoIn;
        edad = edadIn;
        casado = casadoIn;
        especialista = especialistaIn;
    }
    
    public void setNombre(String nombreIn){
        nombre = nombreIn;
    }
    
    public void setApellido(String nombreIn){
        nombre = nombreIn;
    }
    
    public void setEdad(String nombreIn){
        nombre = nombreIn;
    }
    
    public void setCasado(String nombreIn){
        nombre = nombreIn;
    }
    
    public void setEspecilista(String nombreIn){
        nombre = nombreIn;
    }
    
    
    public static void main(String[] args){
        Bombero bombero1 = new Bombero("Raul", "Gomez", 40, true, true);
        
        bombero1.setNombre("Oscar");
        System.out.println(bombero1.nombre);
    }
}
