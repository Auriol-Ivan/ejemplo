/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

//import java.util.Comparator;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author csaez
 */
public class Persona {
    
    private String nombre;
    private Integer edad;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public static Comparator<Persona> conparaNombre = new Comparator<Persona>(){
        @Override
        public int compare(Persona p1, Persona p2) {
          return p1.getNombre().compareTo(p2.nombre);
        }
     
        
        
    };
    
     public static Comparator<Persona> conparaEdad = new Comparator<Persona>(){
        @Override
        public int compare(Persona p1, Persona p2) {
          return p1.edad.compareTo(p2.edad);
        }
     
        
        
    };
    
   @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return edad == persona.edad && nombre.equals(persona.nombre);
    }

    @Override
    public int hashCode() {
   
   
       return Objects.hash(nombre, edad);
    }
    
   
}
