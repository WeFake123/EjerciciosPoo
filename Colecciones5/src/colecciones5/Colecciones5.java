/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones5;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Colecciones5 {

    /**
            Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
        usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
        conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
        si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
        los servicios en la clase correspondiente)
        Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
        cómo se ordena un conjunto.
        Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
        buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
        usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
        al usuario.
     */
    public static void main(String[] args) {
       
        HashSet<String> paises = new HashSet();
        Scanner leer = new Scanner(System.in);
        
        int desicion = 1;
        
        while(desicion == 1 ){
            System.out.println("----------------------");
            System.out.println("1 - Agregar un pais");
            System.out.println("2 - Salir");
            System.out.println("----------------------");
            
            desicion = leer.nextInt();
            if(desicion == 1){
                System.out.println("Ingrese el nombre del pais");
                paises.add(leer.next());
             
                
            }
            
           
            
            
        }
        System.out.println("-----------------------");
         for (String pais : paises) {
                System.out.println(pais);
            }
        System.out.println("-----------------------");
        
        Iterator ite = paises.iterator();
               
        System.out.println("Ingrese pais a eliminar");
        String paisBorrar = leer.next();
        
        while(ite.hasNext()){
            
            if(paisBorrar.equals(ite.next())){
                System.out.println("Pais encontrado, Eliminando...");
                ite.remove();
                
            } else {
                System.out.println("no es");
            }
            
        }
        
        
        System.out.println("-----------------------");
         for (String pais : paises) {
                System.out.println(pais);
            }
        System.out.println("-----------------------");
        
        
        
        
        
    }
    
}
