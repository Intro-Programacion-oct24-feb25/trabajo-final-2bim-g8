/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistrarNatacion;

import java.util.Scanner;

/**
 *
 * @author CDML
 */
public class Natacion {

    public static void registrarParticipanteNatacion() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Registrando participante para Natación");
        System.out.print("Nombre del participante: ");
        String nombre = leer.nextLine();

        System.out.print("Edad: ");
        int edad = leer.nextInt();
        leer.nextLine();

        System.out.print("Nivel (principiante, intermedio, avanzado): ");
        String nivel = leer.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = leer.nextLine();

        System.out.print("Estilo favorito: ");
        String estiloFavorito = leer.nextLine();

        System.out.println("\nDatos recogidos:\n");
        System.out.printf("""
                              Participante registrado para Natacion:
                              Nombre: %s
                              Edad: %d
                              Nivel: %s
                              Ciudad: %s
                              Estilo favorito: %s
                              """, nombre, edad, nivel, ciudad, estiloFavorito);
    }
}
