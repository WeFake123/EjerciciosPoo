/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.libro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class libroServicio {
    
    
    public libro crearLibro(){
        
        libro l1 = new libro();
        
        Scanner leer = new Scanner(System.in); 
        
        
        System.out.println("ingrese nombre del libro");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese autor del libro");
        l1.setAutor(leer.next());
        System.out.println("Ingrese numero de paginas");
        l1.setPaginas(leer.nextInt());
        System.out.println("Ingrese ISBM");
        l1.setIsbm(leer.next());
        return l1;
        
        
    }
    
}
