/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *

 */
public class modelo {

    private int[][] calificaciones;
    private int numeroEstudiante;
    private int numeroMaterias;

    public modelo(int numeroEstudiante, int numeroMaterias) {
        this.numeroEstudiante = numeroEstudiante;
        this.numeroMaterias = numeroMaterias;
        calificaciones = new int[numeroEstudiante][numeroMaterias];
        
        
    }
    
    
    
    public int[] encontrarEstudianteMayorYMenorPromedio() {
    int estudianteMayor = 0;
    int estudianteMenor = 0;
    double mayorPromedio = calcularpromedioestudiante(0);
    double menorPromedio = calcularpromedioestudiante(0);

    for (int i = 1; i < numeroEstudiante; i++) {
        double promedioActual = calcularpromedioestudiante(i);
        if (promedioActual > mayorPromedio) {
            mayorPromedio = promedioActual;
            estudianteMayor = i;
        }
        if (promedioActual < menorPromedio) {
            menorPromedio = promedioActual;
            estudianteMenor = i;
        }
    }
    
    return new int[] {estudianteMayor, estudianteMenor};
}


    public int[][] getCalificaciones() {
        return calificaciones;
    }

    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setCalificaciones(int estudiante, int calificacion, int materia) {
        // Verifica que los índices estén dentro de los límites antes de asignar la calificación
        if (estudiante >= 0 && estudiante < numeroEstudiante && materia >= 0 && materia < numeroMaterias) {
            calificaciones[estudiante][materia] = calificacion;
        } else {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de rango: Estudiante " + estudiante + ", Materia " + materia);
        }
    }

    public double calcularpromedioestudiante(int estudiante) {
        int suma = 0;
        for (int calificacion : calificaciones[estudiante]) {
            suma += calificacion;
        }
        return (double) suma / numeroMaterias;
    }
   
    public double calculopromediomateria(int materia) {
        int suma = 0;
        for (int[] estudiante : calificaciones) {
            suma += estudiante[materia];
        }
        return (double) suma / numeroEstudiante;
    }

    public void setNumeroEstudiante(int numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
}