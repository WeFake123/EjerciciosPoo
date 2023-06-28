/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author daiay
 */
public class Entidad {
      //Atributos
    int n;
    int nroIntentos;
    int letrasEncontradas;
    String palabraStr;
    String palabra[] = new String[n];

    public Entidad() {
    }

    public Entidad(int n, int nroIntentos, int letrasEncontradas) {
        this.n = n;
        this.nroIntentos = nroIntentos;
        this.letrasEncontradas = letrasEncontradas;
    }

    public String getPalabraStr() {
        return palabraStr;
    }

    public void setPalabraStr(String palabraStr) {
        this.palabraStr = palabraStr;
    }
    
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getNroIntentos() {
        return nroIntentos;
    }

    public void setNroIntentos(int nroIntentos) {
        this.nroIntentos = nroIntentos;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public String[] getPalabra() {
        return palabra;
    }
    
    public void getPalabras() {
        for (int i = 0; i < this.n; i++) {
            System.out.println(this.palabra[i]);
        }
       
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "Entidad{" + "n=" + n + ", nroIntentos=" + nroIntentos + ", letrasEncontradas=" + letrasEncontradas + ", palabra=" + palabra + '}';
    }

   
    
    
}


