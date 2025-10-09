import java.util.Scanner;

public class E16Metodos {
    public static void main(String[] args) {
        Scanner palabraUser = new Scanner(System.in);
        
        // Se crean los marcadores de diferentes colores
        Marcador marcadorRojo = new Marcador("Rojo");
        Marcador marcadorBlanco = new Marcador(); // Constructor por defecto
        Marcador marcadorVerde = new Marcador("Verde");
        Marcador marcadorAzul = new Marcador("Azul");
        /*
        System.out.println("\u001b[31m" + "\n--- Escribiendo con el marcador Rojo ---");
        escribir(palabra, marcadorRojo, "\u001b[31m");
        System.out.println("\u001b[32m" + "\n--- Escribiendo con el marcador Verde ---");
        escribir(palabra, marcadorVerde, "\u001b[32m");
        System.out.println("\u001b[34m" + "\n--- Escribiendo con el marcador Azul ---");
        escribir(palabra, marcadorAzul, "\u001b[34m");
        System.out.println("\u001b[0m" + "\n--- Escribiendo con el marcador Blanco ---");
        escribir(palabra, marcadorBlanco, "\u001b[0m");
        */
        System.out.println("Por favor, ingresa la palabra que deseas escribir:");
        String palabra = palabraUser.nextLine();
        
        // El objeto marcador ahora se encarga de escribir por sí mismo
        System.out.println("\u001b[0m" + "\n--- Escribiendo con el marcador Rojo ---");
        marcadorRojo.escribir(palabra,"\u001b[31m");
        
        System.out.println("\u001b[0m" + "\n--- Escribiendo con el marcador Blanco ---");
        marcadorBlanco.escribir(palabra,"\u001b[0m");
        
        System.out.println("\u001b[0m" + "\n--- Escribiendo con el marcador Verde ---");
        marcadorVerde.escribir(palabra,"\u001b[32m");
        
        System.out.println("\u001b[0m" + "\n--- Escribiendo con el marcador Azul ---");
        marcadorAzul.escribir(palabra,"\u001b[34m");
        
        scanner.close();
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

    // Constructor por defecto
    Marcador() {
        this("Blanco");
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

    public void escribir(String texto,String color) {
        System.out.println("Escribiendo con un marcador de color: " + this.getColorMarcador() + "color");
        for (char letra : texto.toCharArray()) {
            if (this.getNivelTinta() > 0) {
                System.out.println(color + letra);
                this.decrementarNivelTinta();
            } else {
                System.out.println("¡El marcador " + this.getColorMarcador() + " se ha quedado sin tinta!");
                break;
            }
        }
    }
}