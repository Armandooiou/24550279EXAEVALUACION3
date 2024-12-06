/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._exa_evaluacion_33;

import java.util.Scanner;

/**
 *
 * @author aaro1
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
  
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número de estudiantes
        System.out.print("Ingrese el numero de estudiantes: ");
        int numeroEstudiantes = scanner.nextInt();

        // Verificar que el número de estudiantes sea mayor a 0
        if (numeroEstudiantes <= 0) {
            System.out.println("El numero de estudiantes debe ser mayor a 0.");
            return;
        }

        // Crear un arreglo para almacenar las calificaciones
        int[] calificaciones = new int[numeroEstudiantes];

        // Permitir ingresar las calificaciones de los estudiantes
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.print("Ingrese la calificacion del estudiante " + (i + 1) + ": ");
            int calificacion = scanner.nextInt();

            // Verificar que la calificación esté entre 0 y 100
            if (calificacion < 0 || calificacion > 100) {
                System.out.println("La calificacion debe estar entre 0 y 100.");
                i--; // Repetir la entrada para este estudiante
            } else {
                calificaciones[i] = calificacion;
            }
        }

        // Calcular el promedio de las calificaciones
        double promedio = calcularPromedio(calificaciones);

        // Contar cuántos estudiantes tienen una calificación mayor o igual al promedio
        int cantidadMayoresAlPromedio = contarCalificacionesMayores(calificaciones, promedio);

        // Obtener la calificación más alta y la más baja
        int calificacionMasAlta = obtenerCalificacionMasAlta(calificaciones);
        int calificacionMasBaja = obtenerCalificacionMasBaja(calificaciones);

        // Imprimir los resultados
        System.out.println("Promedio de calificaciones: " + promedio);
        System.out.println("Cantidad de estudiantes con calificacion mayor o igual al promedio: " + cantidadMayoresAlPromedio);
        System.out.println("Calificacion mas alta: " + calificacionMasAlta);
        System.out.println("Calificacion mas baja: " + calificacionMasBaja);
    }

    // Método para calcular el promedio de las calificaciones
    public static double calcularPromedio(int[] calificaciones) {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    // Método para contar las calificaciones mayores o iguales al promedio
    public static int contarCalificacionesMayores(int[] calificaciones, double promedio) {
        int contador = 0;
        for (int calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador++;
            }
        }
        return contador;
    }

    // Método para obtener la calificación más alta
    public static int obtenerCalificacionMasAlta(int[] calificaciones) {
        int max = calificaciones[0];
        for (int calificacion : calificaciones) {
            if (calificacion > max) {
                max = calificacion;
            }
        }
        return max;
    }

    // Método para obtener la calificación más baja
    public static int obtenerCalificacionMasBaja(int[] calificaciones) {
        int min = calificaciones[0];
        for (int calificacion : calificaciones) {
            if (calificacion < min) {
                min = calificacion;
            }
        }
        return min;
    }
}

    

