/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Peliculas;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
public class Servicios {
    
    Scanner leer = new Scanner(System.in);
    
    
    public void crearPelicula(ArrayList aux){
        Peliculas peli = new Peliculas();
        
        System.out.println("Ingrese el nombre de la pelicula");
        peli.setTitulo(leer.next());
        System.out.println("Ingrese el autor de la pelicula");
        peli.setAutor(leer.next());
        System.out.println("Ingrese la duracion en minutos");
        peli.setDuracion(leer.nextInt());
        
        aux.add(peli);
        
    }
    
        public void mayores1hrs(Peliculas aux){
            
            if(aux.getDuracion() > 60){
                System.out.println("La pelicula " + aux.getTitulo() + " dura mas de una hora");
            }
            
        }
        
        public void mayores1hrsMain(ArrayList aux1){
            
            for (Object aux : aux1) {
                this.mayores1hrs((Peliculas) aux);
                
            }          
            
        }
        
        
    
}
        
        
        
        
    
    
    
    
    

