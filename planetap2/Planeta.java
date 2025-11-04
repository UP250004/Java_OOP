public class Planeta {
    // Atributos de la clase Planeta
    private float diametro;
    private int aniosTranscurridos;
    private int diasAnio;

    // Constructor que inicializa los días del año y el diámetro.
    // Los 'aniosTranscurridos' se inicializan en 0 por defecto.
    public Planeta(int diasAnio, float diam) {
        this.diasAnio = diasAnio;
        this.diametro = diam;
        this.aniosTranscurridos = 0; // Inicializamos a 0
    }

    // Método para simular la traslación y aumentar los años transcurridos
    // (Asumiendo que se llama con los días transcurridos)
    // El diagrama tiene un método 'movTraslaciónCdiasTranscurridos', lo implementamos
    // para aumentar los años si los días transcurridos superan los días del año.
    public void movTraslacion(int diasTranscurridos) {
        // Incrementamos los años transcurridos si los días dados son al menos un año.
        this.aniosTranscurridos += diasTranscurridos / this.diasAnio;
        System.out.println("Han transcurrido " + (diasTranscurridos / this.diasAnio) + " años en el planeta.");
    }

    // Getters y Setters (Opcionales, pero buena práctica)
    public float getDiametro() {
        return diametro;
    }

    public int getAniosTranscurridos() {
        return aniosTranscurridos;
    }

    public int getDiasAnio() {
        return diasAnio;
    }
}