/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import Entidad.Matematica;
import Servicios.MatematicaServicios;

/**
 *
 * @author Usuario
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        MatematicaServicios valores = new MatematicaServicios();
        
        Matematica values = valores.agregarValores();
        
        valores.devolverMayor();
        valores.calcularPotencia();
        valores.calculaRaiz();
        
        
        
    }
    
}
