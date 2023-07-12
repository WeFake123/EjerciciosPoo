/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Baraja {
    
    private ArrayList<Carta> baraja;
    

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }


    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    
    
    
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
    
public void barajear(){
    Collections.shuffle(this.baraja);
}
    
/////////////////////////////////////////////////////////////////////////////
public void siguienteCarta(){
    
    Iterator ite = this.baraja.iterator();
    
    if(ite.hasNext()){
        System.out.println(ite.next());

        ite.remove();
        
    } else {
        System.out.println("No hay mas");
    }
    
}
/////////////////////////////////////////////////////////////////////////////
public void cartasDisponibles(){
    System.out.println("Aun quedan " + this.baraja.size() + " cartas");
}
    
public void darCartas(int cantidad){
    ArrayList mazo = new ArrayList();
    Iterator ite = this.baraja.iterator();
    
    
    if(cantidad > this.baraja.size()){
        System.out.println("Las cartas no alcanzan");
    } else {
         for (int i = 0; i < cantidad; i++) {
        mazo.add(ite.next());
  
        ite.remove();   
    }
    
    for (Object object : mazo) {
        System.out.println(object);
    }
    }
    

    
}

/////////////////////////////////////////////////////////////////////////////






    
}
