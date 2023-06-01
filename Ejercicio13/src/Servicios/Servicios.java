/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Curso.Curso;
import java.util.Scanner;

/**
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
public class Servicios {
    
    Curso curso = new Curso();
    Scanner leer = new Scanner(System.in);
    
    
    public Curso cargarAlumnos(){
      
        String vector[] = new String[5];
        
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            System.out.println("Ingrese el nombre del Alumno N" + (i + 1));
            vector[i] = leer.next();
            
        }

        curso.setAlumnos(vector);
        return curso;
        
    }
    
    public void calcularGananciaSemanal(){
        
        System.out.println("por semana se genera: " +(curso.getCantidadHorasDia() * curso.getPrecioHora() * curso.getAlumnos().length * curso.getCantidadDiasSemana()));
        
    }
    
    
    /*
    private String nombreCurso;
    private double cantidadHorasDia;
    private double cantidadHorasSemana;
    private String turno;
    private double precioHora;
    private String[] alumnos = new String[5];
    */
    
    public Curso crearCurso(){
        System.out.println("Ingrese nombre del curso");
        curso.setNombreCurso(leer.next());
        System.out.println("Ingrese cantidad de horas por dia");
        curso.setCantidadHorasDia(leer.nextDouble());
        System.out.println("Ingrese cantidad de dias por semana");
        curso.setCantidadDiasSemana(leer.nextDouble());
       
        System.out.println("Ingrese turno (manana/tarde)");
        curso.setTurno(leer.next());
        System.out.println("Ingrese el precio por hora");
        curso.setPrecioHora(leer.nextDouble());
        
        cargarAlumnos();
        
        
        return curso;
        
    }
    
    
    
}
