/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

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

   

   
}


