/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones__3;

/**
 Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
public class AlumnoServicios {
  
    
    
    
    
    
    public void notaFinal(Alumno aux){
        
        int promedio = 0;
        double valorFinal = 0;
        
        
        for (int i = 0; i < aux.getNotas().length; i++) {
            System.out.println(aux.getNotas()[i]);
            promedio = promedio + aux.getNotas()[i];
            
        }
        
        valorFinal = promedio/3;
        
        System.out.println("El promedio de " + aux.getNombre() + " es de: " + valorFinal);
    }
    
}
