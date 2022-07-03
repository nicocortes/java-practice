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

public class Persona {
    
    private String nombre;
    private int edad;
    private int dni;
    private String sexo;
    private float peso;
    private float altura;
    
    Persona() {
        nombre = "";
        edad = 0;
        sexo = "H";
        peso = 0;
        altura = 0;
        
        this.comprobarSexo();
        this.generaDNI();
    }
    
    Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre.toUpperCase();
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        
        this.comprobarSexo();
        this.generaDNI();    
    }
    
    Persona(String nombre, int edad, String sexo, float peso, float altura) {
        this.nombre = nombre.toUpperCase();
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        
        this.comprobarSexo();
        this.generaDNI();
    }
    
    public int calcularIMC(){
        final int IDEAL = 0;
        final int SOBREPESO = 1;
        final int DELGADO = -1;
        
        int result = 0;
        
        float pesoIdeal = this.peso/(float) Math.pow(this.altura, 2) ;
                

        if(this.peso < pesoIdeal){
            result = DELGADO;
            System.out.println("delgado");
        } 
        
        if(this.peso == pesoIdeal) {
            result = IDEAL;
            System.out.println("ideal");
        } 
        
        if(this.peso > pesoIdeal){
            result = SOBREPESO;    
            System.out.println("sobrepeso");
        }
 
        return result;
    }
    
    public boolean esMayorDeEdad() {
        
        if(this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
    
    private void comprobarSexo() {
        if(!this.sexo.equals("H") || !this.sexo.equals("F")) {
            this.sexo = "H";
        } 
    }
    
    public void toStringPerson() {
        System.out.println("Nombre: " + this.nombre + "\n"
                          + "Edad: " + this.edad + "\n"
                          + "DNI: " + this.dni + "\n"
                          + "Sexo: " + this.sexo + "\n"
                          + "Peso: " + this.altura + "\n"
                          + "Altura: " + this.altura);
    }
    
    private void generaDNI() {
       Random rd = new Random();
       int dniRandom = rd.nextInt(99999999-10000000);
       this.dni = dniRandom;
    }
    
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }

}
