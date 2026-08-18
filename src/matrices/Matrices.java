package matrices;
import java.util.Arrays;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. DECLARAR E INICIALIZAR UNA MATRIZ
        int[][] numeros = new int[2][2];
        // Modificar valores
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[1][0] = 3;
        numeros[1][1] = 4;

        // Mostrar matriz
        System.out.println("Matriz de números:");
        System.out.println(Arrays.deepToString(numeros));

        // Acceder a un elemento
        System.out.println("Elemento [0][1]: " + numeros[0][1]);

        // 2. INICIALIZACIÓN DIRECTA
        int[][] enteros = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        System.out.println("\nMatriz de enteros:");
        System.out.println(Arrays.deepToString(enteros));

        System.out.println("Número de filas: " + enteros.length);
        System.out.println("Número de columnas: " + enteros[0].length);

        // 3. RECORRER UNA MATRIZ
        String[][] escuderias = {
                {"Cadillac", "McLaren"},
                {"Mercedes", "Williams"}
        };

        System.out.println("\nEscuderías:");

        for (int fila = 0; fila < escuderias.length; fila++) {
            for (int columna = 0; columna < escuderias[fila].length; columna++) {
                System.out.println("Valor[" + fila + "][" + columna + "]: " + escuderias[fila][columna]);
            }
        }

        // 4. CAMBIAR EL TAMAÑO DE LA MATRIZ
        escuderias = new String[][]{
                {"Alpine", "Ferrari"},
                {"Aston Martin", "Kick Sauber"},
                {"Red Bull", "Haas"}
        };

        System.out.println("\nNueva matriz de escuderías:");
        for (int fila = 0; fila < escuderias.length; fila++) {
            for (int columna = 0; columna < escuderias[fila].length; columna++) {
                System.out.println("Valor[" + fila + "][" + columna + "]: " + escuderias[fila][columna]);
            }
        }

        // 5. CREAR UNA MATRIZ CON DATOS DEL USUARIO
        System.out.print("\nNúmero de filas: ");
        int numeroFilas = scanner.nextInt();

        System.out.print("Número de columnas: ");
        int numeroColumnas = scanner.nextInt();

        scanner.nextLine(); // Consumir el salto de línea pendiente

        String[][] pilotos = new String[numeroFilas][numeroColumnas];
        // Introducir datos
        for (int fila = 0; fila < pilotos.length; fila++) {
            for (int columna = 0; columna < pilotos[fila].length; columna++) {
                System.out.print("Piloto [" + fila + "][" + columna + "]: ");
                pilotos[fila][columna] = scanner.nextLine();
            }
        }

        // 6. MOSTRAR MATRIZ DE PILOTOS
        System.out.println("\nMatriz de pilotos:");
        for (int fila = 0; fila < pilotos.length; fila++) {
            for (int columna = 0; columna < pilotos[fila].length; columna++) {
                System.out.println("Piloto [" + fila + "][" + columna + "]: "+ pilotos[fila][columna]
                );
            }
        }
        scanner.close();
    }
}