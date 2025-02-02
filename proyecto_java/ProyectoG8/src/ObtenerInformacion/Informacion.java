/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObtenerInformacion;

/**
 *
 * @author CDML
 */
public class Informacion {
     public static void obtenerInformacion(int totalActividades) {
            String mensaje = "";

            if (totalActividades == 0) {
                mensaje = "Mala campaña, debemos mejorar";
            } else if (totalActividades >= 1 && totalActividades <= 5) {
                mensaje = "Poca participación en el club, hay que mejorar";
            } else if (totalActividades >= 6 && totalActividades <= 15) {
                mensaje = "Buena participación, sigan así";
            } else {
                mensaje = "Excelente campaña del club";
            }

            System.out.println("\n" + mensaje);
        }
}
