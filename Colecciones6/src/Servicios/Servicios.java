/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Servicios {

    Scanner leer = new Scanner(System.in);

    public void menu(HashMap map) {

        int decision = 0;

        while (decision != 5) {
            System.out.println("-----------------------");
            System.out.println("1 - Agregar objetos");
            System.out.println("2 - Modificar precios");
            System.out.println("3 - Eliminar producto");
            System.out.println("4 - Mostrar productos");
            System.out.println("5 - Salir");
            System.out.println("-----------------------");
            
            decision = leer.nextInt();
            
            if(decision == 1){
                agregarObjetos(map);
            }
            if(decision == 2){
                modificarPrecios(map);
            }
            if(decision == 3){
                eliminarProducto(map);
            }
            if(decision == 4){
                mostrarProductos(map);
            }
            

        }
        
        
 
    }
   //-----------------------------------------------------------------------------
    public void agregarObjetos(HashMap map1){
            System.out.println("Ingrese el producto");
            String producto = leer.next();
            System.out.println("Ingrese el precio");
            Double precio = (Double) leer.nextDouble();
            
            map1.put(producto, precio);
        }
    //--------------------------------------------------------------------------
    public void modificarPrecios(HashMap map2){
        System.out.println("Ingrese el producto a editar");
        String producto = leer.next();
        if(map2.containsKey(producto)){
            map2.remove(producto);
            System.out.println("Ingrese el nuevo precio");
        Double precio = (Double) leer.nextDouble();
        map2.put(producto, precio);
        } else {
            System.out.println("No se encuentra el producto");
        }
    }
    //--------------------------------------------------------------------------
    public void eliminarProducto(HashMap map3){
        System.out.println("Ingrese el producto a eliminar");
        String producto = leer.next();
        map3.remove(producto);
    }
    //------------------------------------------------------------------------
    public void mostrarProductos(HashMap map4){
        System.out.println(map4.toString());
        
    }
    
    
}
