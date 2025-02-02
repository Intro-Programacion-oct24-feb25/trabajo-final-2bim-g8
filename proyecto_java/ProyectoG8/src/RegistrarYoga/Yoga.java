/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistrarYoga;

import java.util.Scanner;

/**
 *
 * @author CDML
 */
public class Yoga {

    public static void registrarParticipanteYoga() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Registrando participante para Yoga");
        System.out.print("Nombre del participante: ");
        String nombre = leer.nextLine();

        System.out.print("Edad: ");
        int edad = leer.nextInt();
        leer.nextLine();

        System.out.print("Nivel (principiante, intermedio, avanzado): ");
        String nivel = leer.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = leer.nextLine();

        System.out.print("Estilo de yoga preferido: ");
        String estiloYoga = leer.nextLine();

        System.out.println("\nDatos recogidos:\n");
        System.out.printf("""
                              Participante registrado para Yoga:
                              Nombre: %s
                              Edad: %d
                              Nivel: %s
                              Ciudad: %s
                              Estilo de yoga preferido: %s
                              """, nombre, edad, nivel, ciudad, estiloYoga);
    }
}
