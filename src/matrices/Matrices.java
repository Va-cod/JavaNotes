package matrices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {

        // DECLARAR E iNICIALIZAR UNA MATRIZ
        int[][] numeros = new int[2][2];

        // MODIFICAR UNA MATRIZ
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[1][0] = 3;
        numeros[1][1] = 4;

        // MOSTRAR MATRIZ EN CONSOLA
        System.out.println("Matriz de numeros:");
        System.out.println(Arrays.deepToString(numeros));
        System.out.println(numeros[0][1]);

        // INICIALIZACION DIRECTA
        int enteros[][] = {{1, 2}, {3, 4}, {5, 6}};

        // TAMAÑO DE UNA MATRIZ
        System.out.println("\nMatriz de enteros:");
        System.out.println(Arrays.deepToString(enteros));
        System.out.println("Numero de filas: " + enteros.length);
        System.out.println("Numero de columnas: " + enteros[0].length);




    }
}
