package funciones;

public class Funciones {

    public static void saludar(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {

        // Llamar al método saludar()
        saludar("Hello everyone");

        // Llamar al método sumar()
        int resultadoSuma = sumar(2, 8);
        System.out.println("Suma: " + resultadoSuma);

        // Llamar al método esPar()
        boolean resultadoPar = esPar(100);
        System.out.println("¿Es par?: " + resultadoPar);
    }
}