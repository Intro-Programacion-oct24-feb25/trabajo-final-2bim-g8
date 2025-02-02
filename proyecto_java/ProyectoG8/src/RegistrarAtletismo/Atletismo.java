/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistrarAtletismo;

import java.util.Scanner;

/**
 *
 * @author CDML
 */
public class Atletismo {

    public static void registrarParticipanteAtletismo() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Registrando participante para Atletismo");
        System.out.print("Nombre del participante: ");
        String nombre = entrada.nextLine();

        System.out.print("Edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Especialidad (carreras, salto, lanzamiento): ");
        String especialidad = entrada.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = entrada.nextLine();

        System.out.print("Récord personal: ");
        String recordPersonal = entrada.nextLine();

        System.out.println("\nDatos recogidos:\n");
        System.out.printf("""
                              Participante registrado para Atletismo:
                              Nombre: %s
                              Edad: %d
                              Especialidad: %s
                              Ciudad: %s
                              Record personal: %s
                              """, nombre, edad, especialidad, ciudad, recordPersonal);
    }
}
