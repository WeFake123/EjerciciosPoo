/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones__3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Colecciones__3 {

    /**
    Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
     */
    public static void main(String[] args) {
        
        ArrayList<Alumno> alumno = new ArrayList();
        Scanner leer = new Scanner(System.in);
        AlumnoServicios alumno1 = new AlumnoServicios();
        
        int decision = 1;
        
        while(decision == 1){
            System.out.println("--------------------------");
            System.out.println("Deseas agregar un alumno?");
            System.out.println("1 - si");
            System.out.println("2 - salir");
            System.out.println("--------------------------");
            
            
            decision = leer.nextInt();
            
            
            if(decision == 1){
                
                int[] notasAux = new int[3];
                
                Alumno aux = new Alumno();
                System.out.println("Agregar nombre de alumno");
                aux.setNombre(leer.next());
                
                for (int i = 0; i < 3; i++) {
                    System.out.println("Ingrese la nota numero " + (i + 1));
                    notasAux[i] = leer.nextInt();
                }
                
                aux.setNotas(notasAux);
                
                for (int i = 0; i < 3; i++) {
                    System.out.println(aux.getNotas()[i]);
                }
                
                
               
                alumno.add(aux);
                
            }
            

        }
        System.out.println("Ingrese alumno para calcular nota");
        String alumnoBuscar = leer.next();
        

        
        
        for (Alumno aux : alumno) {
            if (aux.getNombre().equals(alumnoBuscar)) {
                System.out.println("Se encontro al alumno " + alumnoBuscar);
                alumno1.notaFinal(aux);
                
            }
        }
        
        
        
        
        System.out.println("    -------------------------------- ");
        for (Alumno aux : alumno) {
            System.out.println(aux);
        }
        
        
        
    }
    
}
