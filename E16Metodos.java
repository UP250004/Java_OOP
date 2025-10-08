class E16Metodos {
    public static void main(String[] args) {
        String palabra = "holaMundo";
        Marcador marcadorBlanco = new Marcador("Blanco"); // Crea el marcador en main
        escribir(palabra, marcadorBlanco); // Pasa el marcador como argumento
    }

    // El método debe ser estático para ser llamado desde main
    public static void escribir(String texto, Marcador marcador) {
        System.out.println("Escribiendo con un marcador de color: " + marcador.colorMarcador);
        for (char letra : texto.toCharArray()) {
            // Accede al nivelTinta del objeto marcador que se pasó como argumento
            if (marcador.getNivelTinta() > 0) {
                System.out.println(letra);
                marcador.decrementarNivelTinta(); // Usa un método para modificar la tinta
            } else {
                System.out.println("¡El marcador se ha quedado sin tinta!");
                break; // Detiene el bucle si no hay tinta
            }
        }
    }
}


class Marcador {
    String colorMarcador;
    short nivelTinta;

    Marcador(String color) {
        this.nivelTinta = 3; // Nivel de tinta inicial
        this.colorMarcador = color;
    }
    
    // Métodos para acceder y modificar el nivel de tinta de forma segura
    public short getNivelTinta() {
        return this.nivelTinta;
    }

    public void decrementarNivelTinta() {
        if (this.nivelTinta > 0) {
            this.nivelTinta--;
        }
    }
}