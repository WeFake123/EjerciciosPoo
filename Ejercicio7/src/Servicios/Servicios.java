/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
        sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
        atributo, puede hacerlo. Los métodos que se implementarán son:
         Un constructor por defecto.
         Un constructor con todos los atributos como parámetro.
         Métodos getters y setters de cada atributo.
         Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
        al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
        Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
        O. Si no es correcto se deberá mostrar un mensaje
        * 
         Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
        kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
        significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
        Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
        persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
        de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
        función devuelve un 1.
        * 
        * 
        * 
         Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
        devuelve un booleano.
        * 
        A continuación, en la clase main hacer lo siguiente:
        Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
        los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
        tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
        persona es mayor de edad.
        Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
        distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

        cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
        también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 * @author Usuario
 */
public class Servicios {
    
    Scanner leer = new Scanner(System.in);
    Persona humano = new Persona();
    
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre");
        humano.setNombre(leer.next());
        
        System.out.println("Ingrese la altura");
        humano.setAltura(leer.nextDouble());
        
        System.out.println("Ingrese la edad");
        humano.setEdad(leer.nextInt());
        
        System.out.println("Ingrese el peso");
        humano.setPeso(leer.nextDouble());
        
        /*
        String sexo = leer.next();
        
        while(!"h".equals(sexo) || !"m".equals(sexo) || !"o".equals(sexo)){
            System.out.println("Ingrese el sexo");
            sexo = leer.next();
        }
        humano.setSexo(sexo);
        */
        System.out.println("Ingrese el sexo");
        humano.setSexo(leer.next());
        
        
        return humano;
    }
    
    public double calcularIMC(){
        
        double IMC = (humano.getPeso()/((humano.getAltura() * humano.getAltura())));
        
        if(IMC < 20){
            System.out.println("-1");
            return IMC;
        } else if (IMC >= 20 && IMC <= 25){
            System.out.println("0");
            return IMC;
        } else{
            System.out.println("1");
            return IMC;
        }    
        
    }
    
    public boolean esMayorDeEdad(){
        
        if(humano.getEdad() >= 18){
            System.out.println("Mayor de edad");
            return true;
        } else {
            System.out.println("Menor de edad");
            return false;
        }
        
        
    }
    
    
}
