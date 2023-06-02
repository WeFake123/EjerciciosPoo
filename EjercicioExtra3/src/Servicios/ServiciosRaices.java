/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Raices;
import java.util.Scanner;

/**
 Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
* 
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
* 
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
* 
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
* 
* 
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
* 
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
* 
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
public class ServiciosRaices {
    
    Scanner leer = new Scanner(System.in);
    
    Raices raiz = new Raices();
    
    
    public Raices crarRaiz(){
        
        System.out.println("Ingere el valor de a");
        raiz.setA(leer.nextDouble());
         System.out.println("Ingere el valor de b");
        raiz.setB(leer.nextDouble());
         System.out.println("Ingere el valor de c");
        raiz.setC(leer.nextDouble());
        return raiz;
        
    }
    
    

    /*
         Método getDiscriminante(): devuelve el valor del discriminante (double). El
        discriminante tiene la siguiente formula: (b^2)-4*a*c
    */
    
    public double getDiscriminante(){
        
        double discriminante;
        
        discriminante = ((raiz.getB() * raiz.getB()) - 4 * raiz.getA() * raiz.getC());
        System.out.println(discriminante);
        return discriminante;
    }
    
    /*
     Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    que esto ocurra, el discriminante debe ser mayor o igual que 0.   
    */
    
    public boolean tieneRaices(){
        
        if(getDiscriminante() > 0){
            return true;
        } else {
            return false;
        }
    }
    
    /*
     Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
    */
    public boolean tieneRaiz(){
        if(getDiscriminante() == 0){
            return true;
        } else {
            return false;
        }
    }
    
    /*
     Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
    */
    
    //(-b±√((b^2)-(4*a*c)))/(2*a)
    
    public void obtenerRaices(){
        
        if(tieneRaices()){
            
            double solucion1;
            solucion1 = ((-raiz.getB() + Math.sqrt((raiz.getB() * raiz.getB()) - 4 * raiz.getA() * raiz.getC())) / (2 * raiz.getA()) );
            
            double solucion2;
            solucion2 = ((-raiz.getB() - Math.sqrt((raiz.getB() * raiz.getB()) - 4 * raiz.getA() * raiz.getC())) / (2 * raiz.getA()) );
            
            System.out.println("Primera solucion: " + solucion1 + " segunda solucion: " + solucion2);
            
        }
      
    }
    
    /*
     Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
    Es en el caso en que se tenga una única solución posible.
    */
    public void obtenerRaiz(){
        
        if(tieneRaiz()){
            double solucion1;
            solucion1 = ((-raiz.getB() + Math.sqrt((raiz.getB() * raiz.getB()) - 4 * raiz.getA() * raiz.getC())) / (2 * raiz.getA()) );
            
            
            
            System.out.println("Una sola solucion " + solucion1 );
    
        }
        
    }
    /*
     Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
    */
    
    public String calcular(){
        if(tieneRaices()){
            obtenerRaices();
            return null;
        } else if(tieneRaiz()){
            obtenerRaiz();
            return null;
        } else{
            System.out.println("No tiene raiz");
            return null;
        }
        
        
    }
    
}
