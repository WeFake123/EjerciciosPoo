/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import Entidad.Cadena;
import Servicios.CadenaServicios;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        CadenaServicios frase = new CadenaServicios();
        Cadena entidad = frase.pedirFrase();
        
        frase.revertirFrase();
        System.out.println("");
        frase.vecesRepetido();
        System.out.println("");
        frase.compararLongitud();   
        System.out.println("    ");
        frase.unirFrases();
        System.out.println("");

        frase.reemplazar();
        
        System.out.println("");
        frase.contiene();
        
    }
    
}
