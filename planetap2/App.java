public class App {
    public static void main(String[] args) {
        
        // Declaramos un array (arreglo) de tipo Planeta
        // NOTA: Un array de Planeta puede almacenar objetos Planeta y Tierra (por herencia).
        Planeta[] sistemaSolar = new Planeta[2]; 

        // 1. Inicializamos el primer elemento del array con un objeto Planeta (por ejemplo, Marte)
        // Constructor: Planeta(diasAnio, diametro)
        sistemaSolar[0] = new Planeta(687, 6779.0f); 

        // 2. Inicializamos el segundo elemento del array con un objeto Tierra
        // Constructor: Tierra(diasAnio, diametro, cantPersonas)
        // 'Tierra' extiende de 'Planeta', por eso puede estar en el array Planeta[].
        Tierra miTierra = new Tierra(365, 12742.0f, 800000);
        sistemaSolar[1] = miTierra; // Asignamos el objeto Tierra al array

        System.out.println("--- GESTIÓN CON ARRAY ---");
        
        // Iteramos el array para mostrar información
        for (int i = 0; i < sistemaSolar.length; i++) {
            Planeta p = sistemaSolar[i];
            
            System.out.println("\nPlaneta #" + (i + 1));
            System.out.println("Diámetro: " + p.getDiametro() + " km");
            
            // Si el planeta es una instancia de Tierra, podemos acceder a sus métodos específicos.
            if (p instanceof Tierra) {
                Tierra t = (Tierra) p; // Hacemos un 'casting' (conversión)
                System.out.println("** Es la Tierra **");
                System.out.println("Población: " + t.getCantPersonas());
                
                // Aplicamos la lógica de desastre en la Tierra
                t.terremotos(50000); 
                t.aumentarAniosTranscurridos();
                System.out.println("Años transcurridos en la Tierra: " + t.getAniosTranscurridos());
            }
        }
    }
}