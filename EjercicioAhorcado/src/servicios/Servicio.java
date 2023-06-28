
package servicios;

import Entidad.Entidad;
import java.util.Scanner;


public class Servicio {
    /* Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0. */
    
    Scanner leer = new Scanner(System.in);
    Entidad juego = new Entidad();
    
    public Entidad crearJuego(){
        System.out.println("Ingrese la palabra");
        String palabra = leer.nextLine();
        juego.setPalabraStr(palabra);
        System.out.println("Ingrese el nro de intentos");
        int intentos = leer.nextInt();
        juego.setNroIntentos(intentos);
        juego.setN(palabra.length());
        String letra = null;
        String vector[] = new String [palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            letra = palabra.substring(i, i+1);
            vector[i] = letra;
        }
        juego.setPalabra(vector);
        return juego;
    }
    
//     Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
    
    public void longitud(){
        System.out.println("La longitud de la palabra es: " + juego.getN());
    }
    
//     Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public int buscar(String letra){
        
        int contador = 0;
       
       
        for (String elemento : juego.getPalabra()) {
            
            if(elemento.equals(letra)){
                //System.out.println("Se encontro");
                contador++;
                
            }
            
            
        }
        
        
        return contador;
    }
    
    /* Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
    
    */
    
    public boolean encontradas(String letra2){
        
        int encontradas = buscar(letra2);
        
        
            
            
        
        System.out.println("Se encontraron " + encontradas +" letras, faltan" + (juego.getN() - encontradas));
        
        if(buscar(letra2)>0){
            return true;
        } else{
            return false;
        }
    }
    /* Método intentos(): para mostrar cuantas oportunidades le queda al jugador.*/
    
    public void intentos(){
        
        juego.setNroIntentos(juego.getNroIntentos() - 1);
        System.out.println("quedan " + juego.getNroIntentos() + " intentos");
        
    }
   /*  Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.*/
    
    public void juego(){
        System.out.println("Ingrese una letra a buscar");
        String letra = leer.next();
        int contador = 0;
     
        while(juego.getNroIntentos() != 0){
            
            if(contador == juego.getN()){
                System.out.println("Victoria, juego terminado");
                System.out.println("Palabra: " + juego.getPalabraStr());
               break;
            }
            System.out.println("------------------------------");
            System.out.println("Ingrese una letra a buscar");
            letra = leer.next();
            System.out.println("Longitud de la palabra: " + juego.getN());
            if(buscar(letra) == 0){
                System.out.println("No esta en la palabra");
                intentos();
            } else { System.out.println("Esta en la palabra");}
            encontradas(letra);
            if(encontradas(letra)){
                contador++;
            }
            
            System.out.println("------------------------------");
        }
    }
}

