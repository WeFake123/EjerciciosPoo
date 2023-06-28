/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones6;

import Servicios.Servicios;
import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class Colecciones6 {

    /**
     Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,Double> productos = new HashMap();
        Servicios ejercicio = new Servicios();
        
        ejercicio.menu(productos);
        
        
    }
    
}
