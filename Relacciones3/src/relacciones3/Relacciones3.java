/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacciones3;

import Entidad.Baraja;
import Entidad.Carta;



import java.util.Scanner;


/**
     /*
    • barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una
    */
 
public class Relacciones3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Carta cartas = new Carta();
        Baraja baraja = new Baraja(cartas.crearBaraja());
       
        
        int valor = 0;
        
        System.out.println("Bienvenido a el juego de las cartas");
        
        
        while(valor != 7){
             System.out.println("-------------------------------------");
        System.out.println("1 -Barajerar");
        System.out.println("2 - siguiente Carta");
        System.out.println("3 - cartasDisponibles");
        System.out.println("4 - darCartas");
        System.out.println("5 - cartasMonton");
        System.out.println("6 - mostrarBaraja");
        System.out.println("7 - Salir");
        System.out.println("-------------------------------------");
        valor = leer.nextInt();
        
        switch(valor){
            case 1:
                baraja.barajear();
                break;
            case 2 :
                baraja.siguienteCarta();
                break;
            case 3:
                baraja.cartasDisponibles();
                break;
            case 4:
                System.out.println("Ingrese cantidad de cartas a dar");
                baraja.darCartas(leer.nextInt());
                break;
            case 5:
                System.out.println("En construccion1");
                break;
            case 6:
                System.out.println(baraja);
                break;
            case 7:
                System.out.println("Saliendo...");
        }
        
        
        
        
            
        }
       
        
        
        
        
        
    
        
       
        
    }
    
}
