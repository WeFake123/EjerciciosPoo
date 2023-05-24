/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;
import java.util.Set;

/**
  Constructor predeterminado o vacío
         Constructor con la capacidad máxima y la cantidad actual

         Métodos getters y setters.
         Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
        máxima.
        * 
        * 
         Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
        tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
        cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
        método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
        cuanto quedó la taza.
        * 
        * 
         Método vaciarCafetera(): pone la cantidad de café actual en cero.
        * 
         Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
        recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class cafeteraServicios {
    
    Cafetera cafe = new Cafetera(1000,0);
    
    Scanner leer = new Scanner(System.in);
    
    public Cafetera llenarCafetera(){
        cafe.setCapacidadActual(cafe.getCapacidadMaxima());
        return cafe;
    }
    
    //-------------------------------------------------
    public void servirTaza(){
        System.out.println("-------------");
        System.out.println("Ingrese tamano de cafe");
        System.out.println("1. grande (500ml)");
        System.out.println("2. mediano (250ml)");
        System.out.println("3. chico (100ml)");
        System.out.println("----------------------");
        int cantidad = leer.nextInt();
        int volumenTaza = 0;
        
        
        switch(cantidad){
            case 1:
                volumenTaza = 500;
                break;
            case 2:
                volumenTaza = 250;
                break;
            case 3:
                volumenTaza = 100;
                break;
            default:
                System.out.println("Valor Incorrecto");
               
        }
        
        
        if(volumenTaza < cafe.getCapacidadActual()){
            System.out.println("Taza llena");
            cafe.setCapacidadActual(cafe.getCapacidadActual() - volumenTaza);
        } else {
            System.out.println("Solo se llenaron: " + cafe.getCapacidadActual() + " ml");
              cafe.setCapacidadActual(0);
        }
        
    }
     //-------------------------------------------------
    
    public void vaciarCafetera(){
        System.out.println("Vaciando Cafetera");
        cafe.setCapacidadActual(0);
    }
    //------------------------------------------
    
    public void agregarCafe(){
        System.out.println("Ingrese cantidad de cafe a agregar(limite 1000ml)");
        int valorLLenar = leer.nextInt();
        
        while(valorLLenar > 1000){
            System.out.println("Valor incorrecto, volver a ingresar");
            valorLLenar = leer.nextInt();
        }
        
        cafe.setCapacidadActual(cafe.getCapacidadActual() + valorLLenar);
        System.out.println("Se agregaron " + valorLLenar + "ml");
        
    }
    
    public void mostrarCafe(){
        
        System.out.println("Se tiene un total de " + cafe.getCapacidadActual() + "ml");
    }
    
    public void menu(){
        
        int eleccion = 0;
        
        while(eleccion != 6){
        
            System.out.println("---Cafetera----");
            System.out.println("1. LLenar Cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. vaciar Cafetera");
            System.out.println("4. Agregar Cafe");
            System.out.println("5. mostrar Cafe");
            System.out.println("6. Salir");
            System.out.println("---------------");
            System.out.println("");

            eleccion = leer.nextInt();
            
            switch(eleccion){
                
                case 1:
                    llenarCafetera();
                    cafe.toString();
                    break;
                case 2:
                    servirTaza();
                    cafe.toString();
                    break;
                case 3:
                    vaciarCafetera();
                    cafe.toString();
                    break;
                case 4:
                    agregarCafe();
                    cafe.toString();
                    break;
                case 5:
                    mostrarCafe();
                    break;
                case 6:
                    System.out.println("Saliendo");
                    
                

                
            }
            
            
            
        
        
        }
        
        
        
    }
    
}
