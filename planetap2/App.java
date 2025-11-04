
public class  App{
    public static void main(String[] args) {
        // Crear una instancia de Tierra (Hereda de Planeta)
        // Días del año: 365, Diámetro: 12742.0f, Personas Iniciales: 8000000000
        Tierra nuestroPlaneta = new Tierra(365, 12742.0f, 80000);

        System.out.println("--- Inicio de la Simulación ---");
        System.out.println("Población inicial de la Tierra: " + nuestroPlaneta.getCantPersonas());
        System.out.println("Años transcurridos: " + nuestroPlaneta.getAniosTranscurridos());

        // Aumentar los años transcurridos
        System.out.println("\n--- Aumento de Años ---");
        nuestroPlaneta.aumentarAniosTranscurridos(); // Aumenta 1 año
        nuestroPlaneta.aumentarAniosTranscurridos(); // Aumenta 1 año
        System.out.println("Años transcurridos: " + nuestroPlaneta.getAniosTranscurridos());

        // Simular un desastre natural (Terremoto)
        System.out.println("\n--- Simulación de Desastres ---");
        nuestroPlaneta.terremotos(100); // Mueren 100,000 personas
        
        // Simular otro desastre natural (Tsunami)
        nuestroPlaneta.tsunami(500); // Mueren 50,000 personas

        System.out.println("\n--- Fin de la Simulación ---");
        System.out.println("Población final de la Tierra: " + nuestroPlaneta.getCantPersonas());
    }
}