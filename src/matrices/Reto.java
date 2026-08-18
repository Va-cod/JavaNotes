package matrices;

import org.w3c.dom.ls.LSOutput;

public class Reto {
    public static void main(String[] args) {
        int[][] matriz = {{100, 200, 300}, {400, 500, 600}, {700, 800, 900}};
        int suma = 0;

        for (int fila = 0; fila < matriz.length; fila++){
            for (int columna = 0; columna < matriz[0].length; columna++){
                if (fila == columna) {
                    suma += matriz[fila][columna];
                }
            }
        }
        System.out.println("Suma: " + suma);
    }
}
