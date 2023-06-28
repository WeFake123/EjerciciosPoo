/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones4;

import Entidad.Peliculas;
import Servicios.Servicios;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Colecciones4 {

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
    public static void main(String[] args) {
        
        Servicios servicios = new Servicios();
        ArrayList<Peliculas> pelis = new ArrayList();
        
        
        
        Scanner leer = new Scanner(System.in);
        
        int decision = 1;
        
        while(decision == 1){
            System.out.println("----------------------");
            System.out.println("1 - Agregar peliculas");
            System.out.println("2 - Salir");
             System.out.println("----------------------");
            
             decision = leer.nextInt();
            
             if(decision == 1){
                 servicios.crearPelicula(pelis);
             }
             
        }
        System.out.println("----Listado de peliculas-----");
        for (Peliculas peli : pelis) {
            System.out.println(peli);
        }
        System.out.println("----------------------------------");
        
        Iterator iterator = pelis.iterator();
        
        
        servicios.mayores1hrsMain(pelis);
        
        
        System.out.println("------------------------------------------------------------");
        
        //Ordenar pelliculas de acuerdo a su duracion
        Collections.sort(pelis, Comparadores.ordenarPorDuracionAscendente);
        
         System.out.println("----Listado de peliculas-----");
        for (Peliculas peli : pelis) {
            System.out.println(peli);
        }
        System.out.println("------------------------------------------------------------");
        
        Collections.sort(pelis, Comparadores.ordenarPorDuracionDescendente);
        
         System.out.println("----Listado de peliculas-----");
        for (Peliculas peli : pelis) {
            System.out.println(peli);
        }
        System.out.println("------------------------------------------------------------");
        Collections.sort(pelis, Comparadores.ordenarAutor);
        
         System.out.println("----Listado de peliculas-----");
        for (Peliculas peli : pelis) {
            System.out.println(peli);
        }
        System.out.println("------------------------------------------------------------");
        Collections.sort(pelis, Comparadores.ordenarTitulo);
        
         System.out.println("----Listado de peliculas-----");
        for (Peliculas peli : pelis) {
            System.out.println(peli);
        }
        
    }
    
}
