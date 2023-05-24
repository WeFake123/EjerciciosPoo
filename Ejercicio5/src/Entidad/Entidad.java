/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Entidad {
    
    private String dni;
    private Double saldoActual;
    private String numeroCuenta;
    private int interes;
    
    
    public Entidad() {
    }

    public Entidad(String dni, Double saldoActual, String numeroCuenta, int interes) {
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.numeroCuenta = numeroCuenta;
        this.interes = interes;
    }

    

    


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuanta) {
        this.numeroCuenta = numeroCuanta;
    }

    @Override
    public String toString() {
        return "Entidad{" + "dni=" + dni + ", saldoActual=" + saldoActual + ", numeroCuenta=" + numeroCuenta + ", interes=" + interes + '}';
    }
    
    
    
    
    
    
    
}
