/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Peliculas;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Comparadores {
    
    public static Comparator<Peliculas> ordenarPorDuracionAscendente = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            
            return t.getDuracion().compareTo(t1.getDuracion());
            
        }
     };
    
    public static Comparator<Peliculas> ordenarPorDuracionDescendente = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            
            return t1.getDuracion().compareTo(t.getDuracion());
            
        }
     };
    
     public static Comparator<Peliculas> ordenarTitulo = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            
            return t.getTitulo().compareTo(t1.getTitulo());
            
        }
     };
     
     public static Comparator<Peliculas> ordenarAutor = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            
            return t.getAutor().compareTo(t1.getAutor());
            
        }
     };
    
    
    
    
    
            }
        
    
            
    
    

