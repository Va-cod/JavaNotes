package arreglos;
import java.util.Scanner;

// RETO: PROMEDIO DE CALIFICACIONES

public class Reto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;

        System.out.print("Número de calificaciones: ");
        int numeroCalificaciones = Integer.parseInt(scanner.nextLine());
        int[] calificaciones = new int[numeroCalificaciones];

        for (int i = 0; i < calificaciones.length; i++){
            System.out.print("Calificación " + (i + 1) + ": ");
            double calificacion = Double.parseDouble(scanner.nextLine());
            suma += calificacion;
        }

        System.out.println(suma);

    }
}
