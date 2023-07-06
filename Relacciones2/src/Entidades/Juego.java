/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;

/**
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
     */

public class Juego {
    
    private List<Jugador> jugadores;
    private RevolverAgua revolver;


    
    public void llenarJuegos(ArrayList<Jugador> jugadores, RevolverAgua revolver){
         this.jugadores = jugadores;
         this.revolver = revolver;
 
    }
    
    
    
    /*
    • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    */
    
    public void ronda(){
        
        
        
        
        System.out.println("Se llena el revolver");
        revolver.llenarRevolver();
        
        
        boolean alguienMojado = true;
        
        while(alguienMojado){
            System.out.println("El juego comienza");
            System.out.println("Posicion actual = "  + revolver.getPosActual());
            System.out.println("Posicion agua = " + revolver.getPosAgua());
            
            
            
            for (int i = 0; i < 6; i++) {
                Iterator <Jugador> jugador = jugadores.iterator();
                System.out.println("ronda " + i);
                while(jugador.hasNext()){
                
                Jugador juega = jugador.next();
                
                System.out.println("Turno de " + juega.getNombre());
               
                juega.disparo(revolver);
                if(juega.isMojado()){
                    System.out.println("-----------------------------------------------");
                    System.out.println("Perdio " + juega.getNombre());
                    System.out.println("-----------------------------------------------");
                    alguienMojado = false;
                    i = 6;
         
                    break;
                } 
               
            }
                
            }
            
            
             
                alguienMojado = false;
            
        }
        
        
        
        
    }
    
    
    
}
