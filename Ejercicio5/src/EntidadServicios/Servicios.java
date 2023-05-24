/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadServicios;

import Entidad.Entidad;
import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

/**
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
* ---------------------------------------
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
* 
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
* 
* 
* 
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
* 
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
* 
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
* 
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
* 
 */
public class Servicios {
    
    Entidad cuenta = new Entidad();
    
    Scanner leer = new Scanner(System.in);
    
    public Entidad crearCuenta(){
        
        System.out.println("Ingrese dni");
        cuenta.setDni(leer.next());
        System.out.println("Ingrese numero de cuenta");
        cuenta.setNumeroCuenta(leer.next());
        cuenta.setSaldoActual(0.0);
        
        
        return cuenta;
    }
    
    public void ingresar(){
        
        System.out.println("Ingrese la cantidad de dinero");
        
        if(cuenta.getSaldoActual() == 0){
          cuenta.setSaldoActual(leer.nextDouble());  
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() + leer.nextDouble());
        }
        
        
    }
    
    public void retirar(){
        
        System.out.println("Ingrese el valor a retirar");
        int valor = leer.nextInt();
        
        if(valor > cuenta.getSaldoActual()){
            System.out.println("Saldo insuficiente");
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - valor);
        }
        
    }
    
    public void extraccionRapida(){
        System.out.println("Ingrese el valor a retirar, solo se permite el 20% del valor total");
        int valor = leer.nextInt();
        
        if(valor > (cuenta.getSaldoActual() * .2)){
            System.out.println("Error, mayor al 20%");
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - valor);
        }
        
        
    }
    
    public void consultarSaldo(){
        
        System.out.println("El saldo actual es de: " + cuenta.getSaldoActual());
        
    }
    
    public void consultarDatos(){
        System.out.println(cuenta);
    }
    
    
    public void menu(){
        
        int ingreso = 0;
        
        while(ingreso != 6){
            System.out.println("--------------------------------");
            System.out.println("Que desea hacer?");
            System.out.println("1. Ingresar");
            System.out.println("2. retirar");
            System.out.println("3. extraccion rapida");
            System.out.println("4. consultar saldo");
            System.out.println("5. consultar datos");
            System.out.println("6. salir");
            System.out.println("--------------------------------");
            System.out.println("");
        
            ingreso = leer.nextInt();
            
            switch(ingreso){
                case 1:
                       ingresar();
                       consultarSaldo();
                       break;
                case 2:
                        retirar();
                        consultarSaldo();
                        break;
                case 3:
                        extraccionRapida();
                        break;
                case 4:
                        consultarSaldo();
                        break;
                case 5:
                        consultarDatos();
                        break;
                case 6:
                    System.out.println("Saliendo");
                
                
                
            }
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
