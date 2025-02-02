/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import java.util.Scanner;
import MostrarMenu.Menu;
import RegistrarFutbol.Futbol;
import RegistrarAtletismo.Atletismo;
import RegistrarNatacion.Natacion;
import RegistrarBasquetbol.Basquetbol;
import RegistrarYoga.Yoga;
import RegistrarTenis.Tenis;
import RegistrarCiclismo.Ciclismo;
import ObtenerInformacion.Informacion;
import ObtenerReporte.Reporte;

/**
 *
 * @author utpl
 */
public class ProyectoG8 {

    static int[] participantesPorActividad = new int[7];
    static String[] actividades = {"Fútbol", "Natación", "Atletismo",
        "Básquetbol", "Ciclismo",
        "Tenis", "Yoga"};

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        int totalActividades = 0;

        while (continuar) {

            Menu.mostrarMenu();
            int opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 1) {
                Futbol.registrarParticipanteFutbol();
                participantesPorActividad[0]++;
                totalActividades++;

            } else if (opcion == 2) {
                Natacion.registrarParticipanteNatacion();
                participantesPorActividad[1]++;
                totalActividades++;

            } else if (opcion == 3) {
                Atletismo.registrarParticipanteAtletismo();
                participantesPorActividad[2]++;
                totalActividades++;

            } else if (opcion == 4) {
                Basquetbol.registrarParticipanteBasquetbol();
                participantesPorActividad[3]++;
                totalActividades++;

            } else if (opcion == 5) {
                Ciclismo.registrarParticipanteCiclismo();
                participantesPorActividad[4]++;
                totalActividades++;

            } else if (opcion == 6) {
                Tenis.registrarParticipanteTenis();
                participantesPorActividad[5]++;
                totalActividades++;

            } else if (opcion == 7) {
                Yoga.registrarParticipanteYoga();
                participantesPorActividad[6]++;
                totalActividades++;

            } else {
                System.out.println("Lo sentimos, el club no tiene esa opción.");
            }

            System.out.print("¿Desea continuar (si/no)? ");
            String respuesta = entrada.nextLine();
            if (respuesta.equals("si")) {
                continuar = false;
            }
        }

        Informacion.obtenerInformacion(totalActividades);
        Reporte.obtenerReporte(actividades, participantesPorActividad);
    }

}
