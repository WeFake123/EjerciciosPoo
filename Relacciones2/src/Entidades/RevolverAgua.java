/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
public class RevolverAgua {
    
    private int posActual;
    private int posAgua;

    public RevolverAgua() {
    }

    public RevolverAgua(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }

    /*
    • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
    
    
    public void llenarRevolver(){
        
        this.posActual = (int) (Math.random() * 6) + 1;
        
        this.posAgua = (int) (Math.random() * 6) + 1;
        System.out.println("Revolver Cargado");
        
    }

    public boolean mojar(){
        return this.posActual == this.posAgua;
  
    } 
    
    public void siguienteChorro(){
        
        if(this.posActual == 6){
            this.posActual = 1;
        } else{
            this.posActual++;
        }
        
    }
    
}

