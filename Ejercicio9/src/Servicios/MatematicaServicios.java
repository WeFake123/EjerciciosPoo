/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Matematica;

/**
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
* 
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
* 
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class MatematicaServicios {
    
    Matematica valores = new Matematica();
    
    public Matematica agregarValores(){
        
        valores.setNumero1((int)(Math.random() * 10));
        valores.setNumero2((int)(Math.random() * 10));
        
        System.out.println("numero 1: " + valores.getNumero1() + " numero 2: " + valores.getNumero2());
        
        return valores;
        
    }
    
    public void devolverMayor(){
        
        if(valores.getNumero1()> valores.getNumero2()){
            System.out.println("El numero mayor es " + valores.getNumero1());
        } else {
            System.out.println("El numero mayor es " + valores.getNumero2());
        }
        
    }
    
    public void calcularPotencia(){
        System.out.println("Potencias");
        if(valores.getNumero1()> valores.getNumero2()){
            System.out.println(Math.pow(valores.getNumero1(), valores.getNumero2()));
        } else {
            System.out.println(Math.pow(valores.getNumero2(), valores.getNumero1()));
        }
        
    }
    
    public void calculaRaiz(){
        System.out.println("Raices");
         if(valores.getNumero1()> valores.getNumero2()){
            System.out.println(Math.sqrt(valores.getNumero2()));
        } else {
            System.out.println(Math.sqrt(valores.getNumero1()));
        }
        
    }
    
}
