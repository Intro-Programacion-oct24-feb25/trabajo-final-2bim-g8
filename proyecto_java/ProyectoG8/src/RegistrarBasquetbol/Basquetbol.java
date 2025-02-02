/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistrarBasquetbol;

import java.util.Scanner;

/**
 *
 * @author CDML
 */
public class Basquetbol {

    public static void registrarParticipanteBasquetbol() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Registrando participante para Básquetbol");
        System.out.print("Nombre del participante: ");
        String nombre = leer.nextLine();

        System.out.print("Edad: ");
        int edad = leer.nextInt();
        leer.nextLine();

        System.out.print("Posición preferida: ");
        String posicion = leer.nextLine();

        System.out.print("Estatura: ");
        double estatura = leer.nextDouble();
        leer.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = leer.nextLine();

        System.out.println("\nDatos recogidos:\n");
        System.out.printf("""
                              Participante registrado para Basquetbol:
                              Nombre: %s
                              Edad: %d
                              Posiciion preferida: %s
                              Estatura: %.2f
                              Ciudad: %s
                              """, nombre, edad, posicion, estatura, ciudad);
    }
}
