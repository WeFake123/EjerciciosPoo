/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import Curso.Curso;
import Servicios.Servicios;

/**
 *
 * @author Usuario
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Servicios curso = new Servicios();
        Curso curso1 = curso.crearCurso();
        
        curso1.getAlumnosNombres();
        curso.calcularGananciaSemanal();
        
        
        
        
    }
    
}
