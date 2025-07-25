package com.moonsolution.conversormonedas.Utils;

public class MenuConversor {
    public static void exibirMenu() {
        System.out.println("""
        ********************************************
        Bienvenido/a al Conversor de Moneda =]
        
        1) Dólar => Peso argentino
        2) Peso argentino => Dólar
        3) Dólar => Real brasileño
        4) Real brasileño => Dólar
        5) Dólar => Peso colombiano
        6) Peso colombiano => Dólar
        7) Salir
        ********************************************
        Elija una opción válida:
        """);
    }

    public static String obtenerMonedaBase(int opcion) {
        return switch (opcion) {
            case 1, 3, 5 -> "USD";
            case 2 -> "ARS";
            case 4 -> "BRL";
            case 6 -> "COP";
            default -> "";
        };
    }

    public static String obtenerMonedaDestino(int opcion) {
        return switch (opcion) {
            case 1 -> "ARS";
            case 2 -> "USD";
            case 3 -> "BRL";
            case 4 -> "USD";
            case 5 -> "COP";
            case 6 -> "USD";
            default -> "";
        };
    }
}
