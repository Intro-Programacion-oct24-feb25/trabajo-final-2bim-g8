/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectog8;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class ProyectoG8 {

    static int[] participantesPorActividad = new int[7];
    static String[] actividades = {"Fútbol", "Natación", "Atletismo", "Básquetbol", "Ciclismo", "Tenis", "Yoga"};

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        int totalActividades = 0;

        while (continuar) {
            mostrarMenu();
            int opcion = entrada.nextInt();
            entrada.nextLine();  // Limpiar buffer

            if (opcion == 1) {
                registrarParticipanteFutbol();
                participantesPorActividad[0]++;
                totalActividades++;
            } else if (opcion == 2) {
                registrarParticipanteNatacion();
                participantesPorActividad[1]++;
                totalActividades++;
            } else if (opcion == 3) {
                registrarParticipanteAtletismo();
                participantesPorActividad[2]++;
                totalActividades++;
            } else if (opcion == 4) {
                registrarParticipanteBasquetbol();
                participantesPorActividad[3]++;
                totalActividades++;
            } else if (opcion == 5) {
                registrarParticipanteCiclismo();
                participantesPorActividad[4]++;
                totalActividades++;
            } else if (opcion == 6) {
                registrarParticipanteTenis();
                participantesPorActividad[5]++;
                totalActividades++;
            } else if (opcion == 7) {
                registrarParticipanteYoga();
                participantesPorActividad[6]++;
                totalActividades++;
            } else {
                System.out.println("Lo sentimos, el club no tiene esa opción.");
            }

            System.out.print("¿Desea continuar (sí/no)? ");
            String respuesta = entrada.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }

        obtenerInformacion(totalActividades);
        obtenerReporte(actividades, participantesPorActividad);
    }

    public static void mostrarMenu() {
        System.out.println("Seleccione la actividad para registrar un participante:");
        System.out.println("1. Fútbol");
        System.out.println("2. Natación");
        System.out.println("3. Atletismo");
        System.out.println("4. Básquetbol");
        System.out.println("5. Ciclismo");
        System.out.println("6. Tenis");
        System.out.println("7. Yoga");
        System.out.print("Ingrese una opción: ");
    }

    public static void registrarParticipanteFutbol() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Registrando participante para Fútbol...");
        System.out.print("Nombre del participante: ");
        String nombre = entrada.nextLine();
        System.out.print("Edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer
        System.out.print("Posición preferida: ");
        String posicion = entrada.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = entrada.nextLine();
        System.out.print("Equipo favorito: ");
        String equipoFavorito = entrada.nextLine();

        System.out.println("\nParticipante registrado para Fútbol:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Posición preferida: " + posicion);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Equipo favorito: " + equipoFavorito);
    }
}


