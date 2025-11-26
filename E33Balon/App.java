import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.IllegalStateException;

// --------------------------------------------------------------------------------
// Excepciones personalizadas
// --------------------------------------------------------------------------------

/**
 * Excepción lanzada cuando el balón ha superado su límite de presión y se ha roto.
 */
class BalonTronado extends Exception {
    public BalonTronado(String mensaje) {
        super(mensaje);
    }
}

/**
 * Excepción reservada para cuando el balón tiene un pinchazo y pierde aire gradualmente.
 */
class BalonPonchado extends Exception {
    public BalonPonchado(String mensaje) {
        super(mensaje);
    }
}

// --------------------------------------------------------------------------------
// Clase Aire
// --------------------------------------------------------------------------------
class Aire {
    float presion;      // Presión actual en alguna unidad (ej. PSI o kPa)
    float temperatura;
    float cantidadcm3;  // Cantidad de aire

    /**
     * Constructor para inicializar el estado del aire.
     */
    public Aire(float presion, float temperatura, float cantidadcm3) {
        this.temperatura = temperatura;
        this.presion = presion;
        this.cantidadcm3 = cantidadcm3;
    }
    
    // Método para obtener la presión actual
    public float getPresion() {
        return presion;
    }
    
    // Método para modificar la presión
    public void setPresion(float nuevaPresion) {
        this.presion = nuevaPresion;
    }
}

// --------------------------------------------------------------------------------
// Clase Forma3D
// --------------------------------------------------------------------------------

class Forma3d {
    float diametro;
    float volumen;
    String figura;

    /**
     * Constructor base para una forma 3D.
     */
    public Forma3d(float diametro, float volumen, String figura) {
        this.diametro = diametro;
        this.volumen = volumen;
        this.figura = figura;
    }
}

// --------------------------------------------------------------------------------
// Clase Balon 
// --------------------------------------------------------------------------------

class Balon extends Forma3d {
    String marca;
    short tamaño;
    float contenidoMax;     // Presión máxima que soporta el balón
    boolean tronado;        // Indica si el balón se ha roto
    Aire aire;              // Referencia de composición (Tiene UN Aire)

    // Valor constante para la presión crítica
    public static final float PRESION_CRITICA_BASE = 150.0f;
    public static final float INCREMENTO_INFLAR = 10.0f;
    public static final float DECREMENTO_DESINFLAR = 5.0f;
    
    /**
     * Constructor del Balón. Inicializa sin aire (presion = 0) por defecto.
     * @param marca Marca del balón.
     * @param tamaño Tamaño (short).
     * @param contenidoMax Presión máxima que soporta.
     * @param diametro Diámetro de la forma 3D.
     * @param figura Figura 3D.
     */
    public Balon(String marca, short tamaño, float contenidoMax, float diametro, String figura) {
        super(diametro, contenidoMax, figura); // El contenidoMax del balón se usa como volumen inicial de la forma
        this.marca = marca;
        this.tamaño = tamaño;
        this.contenidoMax = contenidoMax; // Presión máxima que soporta (ej. 120.0f)
        this.tronado = false;
        // -1: Crear un balón sin aire (presión inicial 0)
        this.aire = new Aire(0.0f, 25.0f, 1000.0f); 
    }
    
    /**
     * Aumenta la presión del balón.
     * @throws BalonTronado Si la presión supera el límite máximo.
     * @throws IllegalStateException Si el balón ya está tronado.
     */
    public void inflar() throws BalonTronado, IllegalStateException {
        // Validación de estado: si ya está tronado, no se puede inflar
        if (this.tronado) {
            throw new IllegalStateException("¡El balón ya está TRONADO y no se puede inflar!");
        }

        float presionActual = this.aire.getPresion();
        float nuevaPresion = presionActual + INCREMENTO_INFLAR;
        
        System.out.println("Inflando el balón...");

        // 3: Reventar con aire (Excepción)
        if (nuevaPresion > PRESION_CRITICA_BASE) {
            this.tronado = true; // El balón se rompe
            this.aire.setPresion(0.0f); // La presión cae a cero
            throw new BalonTronado("¡El balón ha TRONADO! Presión máxima superada (" + PRESION_CRITICA_BASE + ").");
        }
        
        // 2: Inflar el balón (Operación normal)
        this.aire.setPresion(nuevaPresion);
        System.out.printf("Presión aumentada. Nueva presión: %.1f\n", nuevaPresion);
    }
    
    /**
     * Disminuye la presión del balón.
     * @throws IllegalStateException Si el balón ya está tronado.
     */
    public void desinflar() throws IllegalStateException {
        // Validación de estado: si ya está tronado, no se puede desinflar
        if (this.tronado) {
            throw new IllegalStateException("El balón ya está TRONADO y desinflado. No hay acción.");
        }
        
        float presionActual = this.aire.getPresion();
        float nuevaPresion = Math.max(0.0f, presionActual - DECREMENTO_DESINFLAR);
        
        if (nuevaPresion == 0.0f && presionActual > 0.0f) {
            System.out.println("El balón está completamente desinflado.");
        } else if (nuevaPresion == 0.0f && presionActual == 0.0f) {
            System.out.println("El balón ya está completamente desinflado (presión 0).");
        } else {
            System.out.printf("Desinflando... Nueva presión: %.1f\n", nuevaPresion);
        }
        
        this.aire.setPresion(nuevaPresion);
    }
    
    /**
     * Devuelve el estado actual del balón.
     */
    public String getEstado() {
        if (tronado) {
            return "TRONADO (Inutilizable)";
        } else if (this.aire.getPresion() == 0.0f) {
            return "DESINFLADO";
        } else if (this.aire.getPresion() < 50.0f) {
            return "PARCIALMENTE INFLADO";
        } else {
            return "LISTO PARA JUGAR";
        }
    }
}

// --------------------------------------------------------------------------------
// Clase principal
// --------------------------------------------------------------------------------

public class App {
    public static void main(String ... args) {
        
        // Creamos un balón de fútbol con una presión máxima de 120.0f, 
        // pero que truena al superar 150.0f (PRESION_CRITICA_BASE).
        Balon miBalon = new Balon("Nike", (short) 5, 120.0f, 22.0f, "Esfera"); 
        Scanner scanner = new Scanner(System.in);
        int opcion = -1; // Inicialización segura
        
        System.out.println("--- Simulador de Balón Interactivo ---");
        System.out.println("Modelo: " + miBalon.marca + " | Presión Máxima Recomendada: " + miBalon.contenidoMax);
        System.out.printf("Presión Crítica (Rotura): %.1f\n", Balon.PRESION_CRITICA_BASE);

        // Bucle principal del simulador
        while (true) {
            System.out.println("\n--------------------------------------------------");
            System.out.printf("Presión actual: %.1f | Estado: %s\n", miBalon.aire.getPresion(), miBalon.getEstado());
            System.out.println("Selecciona una acción:");
            System.out.println("1. Inflar Balón (+10.0)");
            System.out.println("2. Desinflar Balón (-5.0)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            try {
                // Intenta leer la opción (puede lanzar InputMismatchException)
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consume el carácter de nueva línea

                switch (opcion) {
                    case 1:
                        miBalon.inflar();
                        break;
                    case 2:
                        miBalon.desinflar();
                        break;
                    case 0:
                        System.out.println("Simulación terminada. ¡Adiós!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } catch (InputMismatchException e) {
                // Maneja si el usuario ingresa texto en lugar de un número (java.util)
                System.err.println("ERROR DE ENTRADA: Por favor, introduce un número válido (0, 1 o 2).");
                scanner.nextLine(); // Limpia el buffer de entrada
            } catch (BalonTronado e) {
                // Maneja la excepción personalizada cuando el balón se revienta (PUNTO -3)
                System.err.println("¡CRISIS! " + e.getMessage());
                System.out.println("El balón ya no se puede usar. Saliendo de la simulación...");
                scanner.close();
                return; // Termina la aplicación después de la rotura
            } catch (IllegalStateException e) {
                // Maneja si se intenta hacer algo con un balón tronado (java.lang)
                System.err.println("ERROR DE ESTADO: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Un error inesperado ocurrió: " + e.getMessage());
            }
        }
    }
}