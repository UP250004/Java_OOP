import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.IllegalStateException;


// Excepciones personalizadas
// -----------------------------------------------------------------------------
class CelularApagadoException extends Exception {
    public CelularApagadoException(String mensaje) {
        super(mensaje);
    }
}

class BateriaAgotadaException extends Exception {
    public BateriaAgotadaException(String mensaje) {
        super(mensaje);
    }
}

// --------------------------------------------------------------------------------
// Clase Celular modificada
// --------------------------------------------------------------------------------

class Celular {
    short nivelBateria; // Nivel de batería (0-100)
    boolean encendido; // Estado de encendido/apagado
    public Celular(short nivelInicial, boolean estadoInicial) {
        this.nivelBateria = nivelInicial;
        this.encendido = estadoInicial;
    }

    void encender() {
        if (this.encendido) {
            System.out.println("El celular ya estaba encendido.");
            return;
        }
        System.out.println("Encendiendo...");
        this.encendido = true;
    } 

    void apagar() {
        if (!this.encendido) {
            System.out.println("El celular ya estaba apagado.");
            return;
        }
        System.out.println("Apagando...");
        this.encendido = false;
    } 
    void cargar(short porcentaje) throws IllegalStateException {
        if (this.nivelBateria == 100) {
            // Usa IllegalStateException para un estado inválido de la operación
            throw new IllegalStateException("El celular ya tiene 100% de batería y no puede cargarse más.");
        }
        
        short nuevaBateria = (short) Math.min(100, this.nivelBateria + porcentaje);
        System.out.println("Cargando batería de " + this.nivelBateria + "% a " + nuevaBateria + "%...");
        this.nivelBateria = nuevaBateria;
    }
    void llamar(String contacto) throws CelularApagadoException, BateriaAgotadaException {
        
        // 1. EXCEPCIÓN: Si no hay batería presente
        if (this.nivelBateria <= 0) {
            // Arroja BateriaAgotadaException si la batería es cero.
            throw new BateriaAgotadaException("El celular está \"muerto\". Sin batería presente.");
        }
        
        // 2. EXCEPCIÓN: Si el celular está apagado
        if (!this.encendido) {
            // Arroja CelularApagadoException si está apagado.
            throw new CelularApagadoException("El celular está apagado. ¡Enciéndelo primero!");
        }
        
        // Si las validaciones pasan, procede con la llamada
        System.out.println("Llamando a " + contacto + "...");
        
        // Simulación: la llamada consume un poco de batería
        this.nivelBateria = (short) Math.max(0, this.nivelBateria - 10); 
        System.out.println("Llamada finalizada. Batería restante: " + this.nivelBateria + "%");
    }

    void jugar() throws CelularApagadoException, BateriaAgotadaException {
        
        // 1. EXCEPCIÓN: Si no hay batería presente
        if (this.nivelBateria <= 0) {
            // Arroja BateriaAgotadaException si la batería es cero.
            throw new BateriaAgotadaException("El celular está \"muerto\". Sin batería presente.");
        }
        
        // 2. EXCEPCIÓN: Si el celular está apagado
        if (!this.encendido) {
            // Arroja CelularApagadoException si está apagado.
            throw new CelularApagadoException("El celular está apagado. ¡Enciéndelo primero!");
        }
        
        this.nivelBateria = (short) Math.max(0, this.nivelBateria - 25); 
        System.out.println("Jugaste un rato, la batería restante del celular es de: " + this.nivelBateria + "%");
    }
}

// --------------------------------------------------------------------------------
// Clase principal de la aplicación (App)
// --------------------------------------------------------------------------------

public class App {
    public static void main(String ... args) {
        
        Celular miCelular = new Celular((short) 100, false); // Inicia con 100% y apagado
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        
        System.out.println("--- Simulador de Celular Interactivo ---");

        // Bucle principal del simulador
        while (true) {
            System.out.println("\n--------------------------------------------------");
            System.out.println("Batería actual: " + miCelular.nivelBateria + "%. Estado: " + (miCelular.encendido ? "ENCENDIDO" : "APAGADO"));
            System.out.println("Selecciona una acción:");
            System.out.println("1. Encender");
            System.out.println("2. Apagar");
            System.out.println("3. Llamar ");
            System.out.println("4. Jugar Candy Crush ");
            System.out.println("5. Cargar batería (+20%)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            try {
                // Intenta leer la opción (puede lanzar InputMismatchException)
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consume el carácter de nueva línea

                switch (opcion) {
                    case 1:
                        miCelular.encender();
                        break;
                    case 2:
                        miCelular.apagar();
                        break;
                    case 3:
                        // Llamar usa las excepciones personalizadas
                        System.out.println("A quien quieres llamar?: ");
                        miCelular.llamar(scanner.nextLine()); 
                        break;
                    case 4:
                        // Cargar usa IllegalStateException
                        miCelular.jugar(); 
                        break;
                    case 5:
                        // Cargar usa IllegalStateException
                        miCelular.cargar((short) 20); 
                        break;
                    case 0:
                        System.out.println("Simulación terminada. ¡Adiós!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.err.println("ERROR DE ENTRADA: Por favor, introduce un número válido (0-4).");
                scanner.nextLine(); 
            } catch (CelularApagadoException | BateriaAgotadaException e) {
                System.err.println("ERROR DE OPERACIÓN: " + e.getMessage());
            } catch (IllegalStateException e) {
                System.err.println("ERROR DE ESTADO: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Un error inesperado ocurrió: " + e.getMessage());
            }
        }//fin de while
    }//fin de main
}//fin de app