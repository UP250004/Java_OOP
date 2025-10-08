import java.util.Scanner;

public class P2E1ExMarker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Se crean los marcadores de diferentes colores
        Marcador marcadorRojo = new Marcador("Rojo");
        Marcador marcadorBlanco = new Marcador(); // Usará el color predeterminado (blanco)
        Marcador marcadorVerde = new Marcador("Verde");
        Marcador marcadorAzul = new Marcador("Azul");
        
        System.out.println("Por favor, ingresa la palabra que deseas escribir:");
        String palabra = scanner.nextLine();
        
        // Escribimos con cada marcador
        System.out.println("\u001b[31m" + "\n--- Escribiendo con el marcador Rojo ---");
        escribir(palabra, marcadorRojo, "\u001b[31m");
        System.out.println("\u001b[32m" + "\n--- Escribiendo con el marcador Verde ---");
        escribir(palabra, marcadorVerde, "\u001b[32m");
        System.out.println("\u001b[34m" + "\n--- Escribiendo con el marcador Azul ---");
        escribir(palabra, marcadorAzul, "\u001b[34m");
        System.out.println("\u001b[0m" + "\n--- Escribiendo con el marcador Blanco ---");
        escribir(palabra, marcadorBlanco, "\u001b[0m");
        
        
        scanner.close();
    }

    public static void escribir(String texto, Marcador marcador, String codigo) {
        System.out.println("Escribiendo con un marcador de color: " + marcador.getColorMarcador() + codigo);
        for (char letra : texto.toCharArray()) {
            if (marcador.getNivelTinta() > 0) {
                System.out.println(letra + codigo);
                marcador.decrementarNivelTinta();
            } else {
                System.out.println("¡El marcador " + marcador.getColorMarcador() + " se ha quedado sin tinta!");
                break;
            }
        }
    }
}
class Marcador {
    String colorMarcador;
    short nivelTinta;

    // Constructor con un parámetro para el color
    Marcador(String color) {
        this.nivelTinta = 100;
        this.colorMarcador = color;
    }

    // Constructor sin parámetros (constructor por defecto)
    // Asigna el color "Blanco" por defecto
    Marcador() {
        this("Blanco"); // Llama al otro constructor con "Blanco"
    }
    
    public short getNivelTinta() {
        return this.nivelTinta;
    }
    
    public String getColorMarcador() {
        return this.colorMarcador;
    }

    public void decrementarNivelTinta() {
        if (this.nivelTinta > 0) {
            this.nivelTinta--;
        }
    }
}