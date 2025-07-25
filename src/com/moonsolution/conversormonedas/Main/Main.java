package com.moonsolution.conversormonedas.Main;

import com.moonsolution.conversormonedas.Models.DatosConversion;
import com.moonsolution.conversormonedas.Services.ConsultaApi;
import com.moonsolution.conversormonedas.Utils.MenuConversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ConsultaApi consulta = new ConsultaApi();

        int opcion;
        do {
            MenuConversor.exibirMenu();
            opcion = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            if (opcion >= 1 && opcion <= 6) {
                String base = MenuConversor.obtenerMonedaBase(opcion);
                String destino = MenuConversor.obtenerMonedaDestino(opcion);

                System.out.print("¿Qué cantidad deseas convertir?: ");
                double cantidad = entrada.nextDouble();

                DatosConversion datos = consulta.obtenerConversion(base, destino);

                if (datos.result().equals("success")) {
                    double resultado = cantidad * datos.conversion_rate();
                    System.out.printf("%.2f %s = %.2f %s%n", cantidad, base, resultado, destino);
                } else {
                    System.out.println("Error al obtener datos de conversión.");
                }
            } else if (opcion != 7) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 7);

        System.out.println("Gracias por usar el conversor.");
    }
}
