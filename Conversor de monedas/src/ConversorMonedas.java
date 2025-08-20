import java.util.Scanner;

public class ConversorMonedas {

    // Tasas de cambio (puedes actualizar según el valor actual)
    private static final double DOLAR_A_PESO_ARG = 875.50;
    private static final double DOLAR_A_REAL_BR = 5.20;
    private static final double DOLAR_A_PESO_COL = 3900.75;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elija una opción válida: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertir(scanner, "Dólar", "Peso Argentino", DOLAR_A_PESO_ARG);
                    break;
                case 2:
                    convertir(scanner, "Peso Argentino", "Dólar", 1 / DOLAR_A_PESO_ARG);
                    break;
                case 3:
                    convertir(scanner, "Dólar", "Real Brasileño", DOLAR_A_REAL_BR);
                    break;
                case 4:
                    convertir(scanner, "Real Brasileño", "Dólar", 1 / DOLAR_A_REAL_BR);
                    break;
                case 5:
                    convertir(scanner, "Dólar", "Peso Colombiano", DOLAR_A_PESO_COL);
                    break;
                case 6:
                    convertir(scanner, "Peso Colombiano", "Dólar", 1 / DOLAR_A_PESO_COL);
                    break;
                case 7:
                    System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

            System.out.println(); // Espacio entre operaciones
        } while (opcion != 7);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("Sea bienvenido al conversor de monedas");
        System.out.println("1) Dólar a Peso Argentino");
        System.out.println("2) Peso Argentino a Dólar");
        System.out.println("3) Dólar a Real Brasileño");
        System.out.println("4) Real Brasileño a Dólar");
        System.out.println("5) Dólar a Peso Colombiano");
        System.out.println("6) Peso Colombiano a Dólar");
        System.out.println("7) Salir");
    }

    private static void convertir(Scanner scanner, String monedaOrigen, String monedaDestino, double tasaCambio) {
        System.out.printf("Ingrese la cantidad en %s: ", monedaOrigen);
        double cantidad = scanner.nextDouble();
        double resultado = cantidad * tasaCambio;
        System.out.printf("%.2f %s equivalen a %.2f %s%n",
                cantidad, monedaOrigen, resultado, monedaDestino);
    }
}
