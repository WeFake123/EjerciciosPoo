/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.DNI;
import java.util.Scanner;

/**
  Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 Métodos getters y setters para el número de DNI y la letra.
* 
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
public class DNIServicios {
    
    Scanner leer = new Scanner(System.in);
    DNI dni = new DNI();
    
    
    /*
    Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
    */
    
    public DNI crearNif(){
        
        System.out.println("Ingrese el dni");
        dni.setDni(leer.nextInt());
        
        int resultado = dni.getDni() % 23;
        
        dni.setNif(resultado);
        
        return dni;
    }
    
    /*
       Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
        en mayúscula; por ejemplo: 00395469-F).
    */
    
    public void mostrar(){
        
        String letras[] = new String[23];
        
        int resultado = dni.getDni() % 23;
        
        String letra = null;
        
        letras[0] = "T"; letras[1] = "R"; letras[2] = "W"; letras[3] = "A"; letras[4] = "G";
        letras[5] = "M"; letras[6] = "Y"; letras[7] = "F"; letras[8] = "P"; letras[9] = "D";
        letras[10] = "X"; letras[10] = "B";letras[12] = "N";letras[13] = "J";letras[14] = "Z";
        letras[15] = "S";letras[16] = "Q";letras[17] = "V";letras[18] = "H";letras[19] = "L";
        letras[20] = "C";letras[21] = "K";letras[22] = "E";
                
        
        for (int i = 0; i < 22; i++) {
           
            if(resultado == i){
                letra = letras[i]; 
                
            }
            
        }
        System.out.println(dni.getDni() + "-" + letra);
        
        
    }
    
}
