/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Colecciones {

    /**
            Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
         programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
            después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
            salir, se mostrará todos los perros guardados en el ArrayList.
            * 
            * 
            * 
            * 
            * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
                    un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
        está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
     */
    public static void main(String[] args) {
        
        ArrayList<String> Razas = new ArrayList();
       
        Scanner leer = new Scanner(System.in);
        
        int ingreso =   1;
        
        while(ingreso== 1){
            
            System.out.println("Ingrese la nueva raza de perro");
            
            String perro = leer.next();
            
            Razas.add(perro);
            
            System.out.println("Deseas agregar otra raza? (1 = si/2 = no)");
            
             ingreso = leer.nextInt();
            
        }
        
        System.out.println("Las razas de perros son:");
         for (String Raza : Razas) {
            System.out.println(Raza);
        }
        
        Iterator iterator = Razas.iterator();
        
        System.out.println("Ingrese perro a eliminar");
        
        String perroEliminar = leer.next();
        
        
        while(iterator.hasNext()){
            
            if(perroEliminar.equals(iterator.next())){
                System.out.println("Perro encontrado, Eliminando...");
                iterator.remove();
                
            } else {
                System.out.println("no es");
            }
            
        }
        

        
        for (String Raza : Razas) {
            System.out.println(Raza);
        }
        
        
        
        
        
        
    }
    
}
