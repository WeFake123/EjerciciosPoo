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
public class Persona {
    
    private int edad;
    private Double altura;
    private Double peso;
    private String nombre;
    private String sexo;

    public Persona() {
    }

    public Persona(int edad, Double altura, Double peso, String nombre, String sexo) {
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", nombre=" + nombre + ", sexo=" + sexo + '}';
    }
    
    
    
}
