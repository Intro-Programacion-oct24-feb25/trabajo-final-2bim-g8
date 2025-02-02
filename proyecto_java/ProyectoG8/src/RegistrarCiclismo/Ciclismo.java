/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistrarCiclismo;

import java.util.Scanner;

/**
 *
 * @author CDML
 */
public class Ciclismo {

    public static void registrarParticipanteCiclismo() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Registrando participante para Ciclismo");
        System.out.print("Nombre del participante: ");
        String nombre = leer.nextLine();

        System.out.print("Edad: ");
        int edad = leer.nextInt();
        leer.nextLine();

        System.out.print("Tipo de ciclismo (montaña, ruta, urbano): ");
        String tipoCiclismo = leer.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = leer.nextLine();

        System.out.print("Marca de bicicleta preferida: ");
        String marcaBicicleta = leer.nextLine();

        System.out.println("\nDatos recogidos:\n");
        System.out.printf("""
                              Participante registrado para Ciclismo:
                              Nombre: %s
                              Edad: %d
                              Tipo de ciclismo: %s
                              Ciudad: %s
                              Marca de bicicleta: %s
                              """, nombre, edad, tipoCiclismo, ciudad, marcaBicicleta);
    }
}
