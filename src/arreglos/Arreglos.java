package arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. DECLARAR E INICIALIZAR UN ARREGLO
        int[] numeros = new int[3];
        String[] frutas = new String[5];

        // 2. MODIFICAR VALORES
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        frutas[0] = "Manzana";
        frutas[1] = "Durazno";
        frutas[4] = "Pera";

        // 3. MOSTRAR VALORES
        System.out.println("* * * * ARREGLO DE NÚMEROS * * * *");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        System.out.println("\n* * * * ARREGLO DE FRUTAS * * * *");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Posición " + i + ": " + frutas[i]);
        }

        // 4. SINTAXIS SIMPLIFICADA
        int[] enteros = {10, 20, 30, 40, 50};

        String[] escuderias = {
                "Ferrari",
                "Cadillac",
                "McLaren"
        };

        // 5. MOSTRAR ARREGLO COMPLETO
        System.out.println("\n* * * * ESCUDERÍAS * * * *");
        System.out.println(Arrays.toString(escuderias));

        // 6. RECORRER UN ARREGLO
        System.out.println("\n* * * * ESCUDERÍAS * * * *");
        for (int i = 0; i < escuderias.length; i++) {
            System.out.println(i + ". " + escuderias[i]);
        }

        // 7. CREAR UN ARREGLO CON TAMAÑO DEL USUARIO
        System.out.print("\nLongitud del arreglo: ");
        int longitudArreglo = Integer.parseInt(scanner.nextLine());
        String[] pilotos = new String[longitudArreglo];

        // 8. LLENAR EL ARREGLO
        for (int i = 0; i < pilotos.length; i++) {
            System.out.print("Ingrese el piloto " + (i + 1) + ": ");
            pilotos[i] = scanner.nextLine().toUpperCase().toUpperCase();
        }

        // 9. MOSTRAR LOS PILOTOS
        System.out.println("\n* * * * PILOTOS * * * *");
        for (int i = 0; i < pilotos.length; i++) {
            System.out.println((i + 1) + ". " + pilotos[i]);
        }
        scanner.close();
    }
}