/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObtenerReporte;

/**
 *
 * @author CDML
 */
public class Reporte {

    public static void obtenerReporte(String[] actividades, int[] participantesA) {
        
        System.out.println("\nLas actividades ingresadas son:");
        
        for (int i = 0; i < actividades.length; i++) {
            System.out.println((i + 1) + ". Número de Participantes de"
                    + " " + actividades[i] + ": " + participantesA[i]);
        }
    }
}
