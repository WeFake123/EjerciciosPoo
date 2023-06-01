/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cadena;
import java.util.Scanner;

/**
 a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
* 
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
* 
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
* 
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
* 
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
* 
* 
* 
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
public class CadenaServicios {
    
    Scanner leer = new Scanner(System.in);
    
    Cadena frase = new Cadena();
    
    
    public Cadena pedirFrase(){
        
        System.out.println("Ingrese la frase");
        
        frase.setFrase(leer.nextLine());
        frase.setLongitud(frase.getFrase().length());
      
        return frase;
    }
    
    public void revertirFrase(){
        
        for (int i = frase.getLongitud() - 1; i >= 0; i--) {
            System.out.print(frase.getFrase().substring(i,i+1));
            
        }
        
    }
    
    public void vecesRepetido(){
        String caracterRepetido = "";
        int contador = 0;
        System.out.println("Que caracter desea contar?");
        caracterRepetido = leer.next();
        
        
        for (int i = 0; i < frase.getLongitud(); i++) {
            if(frase.getFrase().substring(i,i+1).equals(caracterRepetido)){
                contador++;
            }
            
        }
        
        System.out.println("El caracter " + caracterRepetido + " se repite " + contador + " veces");
        
    }
    
    public void compararLongitud(){
        
        System.out.println("Ingrese la nueva frase a comparar");
        
        String nuevaFrase = leer.next();
        
        if(frase.getLongitud() == nuevaFrase.length()){
            System.out.println("Tienen la misma longitud");
        } else {
            System.out.println("No tienen la misma longitud");
        }
     
    }
    
    public void unirFrases(){
        
        System.out.println("Ingrese la frase a concatenar");
        String nuevaFrase = leer.next();
        
        System.out.println(frase.getFrase() + " " + nuevaFrase);
        
        
    }
    
    public void reemplazar(){
        
        System.out.println("Que caracter desea reemplazar?");
        String caracter = leer.next();
        System.out.println("Por que caracter lo desea remplazar?");
        String reemplazo = leer.next();
        
        String nuevaFrase = "";
        
        for (int i = 0; i < frase.getLongitud(); i++) {
          
            if(frase.getFrase().substring(i,i+1).equals(caracter)){
         
                nuevaFrase = nuevaFrase + reemplazo;
            } else{
                nuevaFrase = nuevaFrase + (frase.getFrase().substring(i,i+1));
            }
            
        }
        System.out.println(nuevaFrase);
        
        
        
    }
    
    public void contiene(){
        System.out.println("Ingrese el caracter a buscar");
        String caracter = leer.next();
        boolean valor = false;
        
        for (int i = 0; i < frase.getLongitud(); i++) {
            if(frase.getFrase().substring(i,i+1).equals(caracter)){
                valor = true;
            }
            
        }
        
        if(valor){
            System.out.println("Lo contiene");
        } else {
            System.out.println("No lo contiene");
        }
        
        
    }
    
}
