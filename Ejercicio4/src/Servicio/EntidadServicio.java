/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Rectangulo.Entidad;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EntidadServicio {
    
    
    Scanner leer = new Scanner(System.in);
    
    Entidad rectangulo = new Entidad();
    
    
    
    public Entidad CrearRectangulo(){
        
        System.out.println("Ingrese la altura del rectangulo");
        rectangulo.setAltura(leer.nextInt());
        System.out.println("Ingrese la base del rectangulo");
        rectangulo.setBase(leer.nextInt());
        
        
        return rectangulo;
    }
    
    public void Superficie(){
        
        System.out.println("La superficie es de: " + (rectangulo.getAltura() * rectangulo.getBase()));
            
        
    }
    
    public void Perimetro(){
        
        System.out.println("El perimetro es de: " + ((rectangulo.getAltura() + rectangulo.getBase()) * 2));
            
        
    }
    
    public void dibujar(){

           for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j < rectangulo.getBase(); j++) {
                if (i == 0 || i == rectangulo.getAltura() - 1 || j == 0 || j == rectangulo.getBase() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        
        
    }
    
    
}
}
