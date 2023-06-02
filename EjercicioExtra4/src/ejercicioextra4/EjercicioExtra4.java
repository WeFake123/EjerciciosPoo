/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra4;

import Entidad.DNI;
import Servicios.DNIServicios;

/**
 *
 * @author Usuario
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        DNIServicios servicios = new DNIServicios();
        DNI dni = servicios.crearNif();
        
        servicios.mostrar();
        
        
    }
    
    
    
}
