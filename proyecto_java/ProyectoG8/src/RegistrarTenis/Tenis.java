/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistrarTenis;

import java.util.Scanner;

/**
 *
 * @author CDML
 */
public class Tenis {

    public static void registrarParticipanteTenis() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Registrando participante para Tenis");
        System.out.print("Nombre del participante: ");
        String nombre = leer.nextLine();

        System.out.print("Edad: ");
        int edad = leer.nextInt();
        leer.nextLine();

        System.out.print("Nivel (principiante, intermedio, avanzado): ");
        String nivel = leer.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = leer.nextLine();

        System.out.print("Mano hábil (derecha/izquierda): ");
        String manoHabil = leer.nextLine();

        System.out.println("\nDatos recogidos:\n");
        System.out.printf("""
                             Participante registrado para Tenis:
                             Nombre: %s
                             Edad: %d
                             Nivel: %s
                             Ciudad: %s
                             Mano habil: %s
                             """, nombre, edad, nivel, ciudad, manoHabil);
    }
}
