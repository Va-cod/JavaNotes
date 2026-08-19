package poo;

public class Auto {

    // Atributos
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    // Constructor
    public Auto(String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    // Método para mostrar la información
    public void mostrarAuto() {
        System.out.println("""
                * * * * INFORMACIÓN DEL AUTO * * * *
                Marca: %s
                Modelo: %s
                Año: %d
                Color: %s
                """.formatted(marca, modelo, anio, color));
    }

    // Método para acelerar
    public void acelerar() {
        System.out.println("El %s %s está acelerando...".formatted(marca, modelo));
    }

    // Método para frenar
    public void frenar() {
        System.out.println("El %s %s está frenando...".formatted(marca, modelo));
    }

    public static void main(String[] args) {

        Auto auto = new Auto(
                "Toyota",
                "Land Cruiser",
                2026,
                "Negro"
        );

        auto.mostrarAuto();
        auto.acelerar();
        auto.frenar();
    }
}