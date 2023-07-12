/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Carta {
    
    private String palo;
    private Integer valor;

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Carta(String palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public Carta() {
    }
    
  
   
    public String toString() {
        return "Carta{" + "palo=" + palo + ", valor=" + valor + "}\n";
    }
    
    public ArrayList crearBaraja(){
        
        ArrayList<Carta> baraja = new ArrayList();
        
        for (int i = 1; i < 13; i++) {
            if(i == 8 || i == 9){}else{
                baraja.add(new Carta("Espada",i));
            }                
        }
        for (int i = 1; i < 13; i++) {
            if(i == 8 || i == 9){}else{
                baraja.add(new Carta("Oro",i));
            }                
        }
        for (int i = 1; i < 13; i++) {
            if(i == 8 || i == 9){}else{
                baraja.add(new Carta("Basto",i));
            }                
        }
        for (int i = 1; i < 13; i++) {
            if(i == 8 || i == 9){}else{
                baraja.add(new Carta("Copa",i));
            }                
        }
        
        return baraja;
   }
    
    
}
