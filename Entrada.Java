import java.util.Scanner;

public class Entrada{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 1. Crea un objeto Scanner

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.next(); // 2. Lee una cadena (palabra)

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt(); // 3. Lee un número entero

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");

        scanner.close(); // 4. Cierra el scanner cuando ya no se necesite
    }
}
/**
04 Ejercicios secuenciales en Java
Recibe dos números y muestra el resultado de la suma, resta, división y multiplicación de ambos.
*/
// Inicio del programa y declaración de variables: