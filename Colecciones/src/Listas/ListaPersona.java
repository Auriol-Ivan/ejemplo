/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author csaez
 */
public class ListaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Juan",32);
        Persona p2 = new Persona("Ana",25);
        Persona p3 = new Persona("Rodolfo",29);
        Persona p4 = new Persona("Rodolfo",29);
        Persona p5 = new Persona("Rodolfo",29);
        
       ArrayList<Persona> personas = new ArrayList();
        
        
        
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        System.out.println("LISTA SIN ORDENAR");
        for(Persona p:personas){
            System.out.println(p);
        }
     
        System.out.println("LISTA  ORDENADA POR NOMBRE");
        Collections.sort(personas,Persona.conparaNombre);
        
        for(Persona p:personas){
            System.out.println(p);
        }
          System.out.println("LISTA  ORDENADA POR EDAD");
        Collections.sort(personas,Persona.conparaEdad);
        
        for(Persona p:personas){
            System.out.println(p);
        }
    }  
}
