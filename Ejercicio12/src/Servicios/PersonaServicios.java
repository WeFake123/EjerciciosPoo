/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
  Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
public class PersonaServicios {
    
    Persona usuario = new Persona();
    Scanner leer = new Scanner(System.in);
    
    
    public Persona crearPersona(){
        
        System.out.println("Ingresar el nombre");
        usuario.setNombre(leer.next());
        System.out.println("Ingrese dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese anio de nacimiento");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio - 1900,mes - 1,dia);
        
        usuario.setNacimiento(fecha);
        
        
    
        return usuario;
    }
    
    public int calcularEdad(){
        
        Date fechaActual = new Date();
        
        int edad = 0;
        
        
        edad = fechaActual.getYear() - usuario.getNacimiento().getYear();
        
        if(usuario.getNacimiento().getMonth() > fechaActual.getMonth()){
            edad--;
        }
        
        System.out.println("El usuario tiene " + edad + " anios");
        return edad;
    }
    
    public boolean menorQue(int edad1){
        
        if(edad1 < calcularEdad()){
            System.out.println("true");
            return true;
        } else{
            System.out.println("False");
            return false;
        }

        
    }
    public void mostarPersona(){
        System.out.println(usuario);
    }
    
    
    
}

