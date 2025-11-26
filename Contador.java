import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1; // Inicialización segura
        Cont miCont = new Cont();
        while (true) {
            System.out.println("\n--------------------------------------------------");
            System.out.println("Selecciona una acción:");
            System.out.println("1. Sumar 1 al numero actual");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            try {
                // Intenta leer la opción (puede lanzar InputMismatchException)
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consume el carácter de nueva línea

                switch (opcion) {
                    case 1:
                        System.out.println("El numero anterior era " + miCont.getNumero());
                        miCont.setNumero();
                        System.out.println("El numero actual es " + miCont.getNumero());
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
            }
    }
}
}
class Cont{
    private int numero = 0;
    // getter
    public float getNumero() {
        return numero;
    }
    
    // Setter
    public void setNumero() {
        this.numero += 1;
    }
}
