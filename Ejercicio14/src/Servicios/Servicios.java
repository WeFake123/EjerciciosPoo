/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Tienda;
import java.util.Scanner;

/**
 Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
public class Servicios {
    
    
    Tienda tienda = new Tienda();
    Scanner leer = new Scanner(System.in);
    
    public Tienda cargarCelular(){
        
        System.out.println("Ingrese la marca");
        tienda.setMarca(leer.next());
        System.out.println("Ingrese el precio");
        tienda.setPrecio(leer.nextInt());
        System.out.println("Ingrese el modelo");
        tienda.setModelo(leer.next());
        System.out.println("Ingrese memoria ram");
        tienda.setRam(leer.nextInt());
        System.out.println("Ingrese almacenamiento");
        tienda.setAlmacenamiento(leer.nextInt());

        return tienda;
    }
    
    
    public void ingresarCodigo(){
        
        int [] vector = new int [7];
        
        for (int i = 0; i < tienda.getCodigo().length; i++) {
            System.out.println("Ingrese el codigo");
            vector[i] = leer.nextInt();
        }
        
        tienda.setCodigo(vector);
        
        System.out.println("El codigo ingresado es: ");
         for (int i = 0; i < tienda.getCodigo().length; i++) {
             System.out.print(vector[i]);
        }
        
    }
        
        
    
    
}
