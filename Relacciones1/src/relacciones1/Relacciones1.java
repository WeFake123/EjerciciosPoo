/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacciones1;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author Usuario
 */
public class Relacciones1 {

    /**
    Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
     */
    public static void main(String[] args) {
        
        Perro perro1 = new Perro("arturo","caniche",2,"chico");
        Perro perro2 = new Perro("Juan","Dogo",4,"Grande");
        
        Persona persona1 = new Persona("Pedro","Guzman",26,2223,perro1);
        Persona persona2 = new Persona("Chapo","Guzman",35,22232323,perro2);
        
        
        System.out.println(persona1.getPerro());
    }
    
}
