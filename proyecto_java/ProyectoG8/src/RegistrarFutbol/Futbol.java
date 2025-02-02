/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistrarFutbol;

import java.awt.event.FocusEvent;
import java.util.ResourceBundle;
import java.util.Scanner;
import javax.swing.text.html.CSS;

/**
 *
 * @author utpl
 */
public class Futbol {

    public static void registrarParticipanteFutbol() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Registrando participante para Fútbol");
        System.out.print("Nombre del participante: ");
        String nombre = leer.nextLine();

        System.out.print("Edad: ");
        int edad = leer.nextInt();
        leer.nextLine();

        System.out.print("Posición preferida: ");
        String posicionF = leer.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = leer.nextLine();

        System.out.print("Equipo favorito: ");
        String equipoF = leer.nextLine();

        System.out.println("\nDatos recogidos:\n");
        System.out.printf("""
                              Participante registrado para Futbol:
                              Nombre: %s
                              Edad: %d
                              Posicion preferida: %s
                              Ciudad: %s
                              Equipo favorito: %s
                              """, nombre, edad, posicionF, ciudad, equipoF);
    }
}
