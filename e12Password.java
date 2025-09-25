import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginCheckerScanner {

    // Usamos un HashMap para almacenar correos y contraseñas
    private static final Map<String, String> credenciales = new HashMap<>();

    static {
        // Inicializamos el mapa con los correos y contraseñas predefinidos
        credenciales.put("usuario1@ejemplo.com", "password123");
        credenciales.put("usuario2@ejemplo.com", "password456");
        credenciales.put("admin@ejemplo.com", "admin_pass");
    }

    /**
     * Busca un correo electrónico en el mapa de credenciales.
     * @param correo El correo electrónico a buscar.
     * @return 1 si el correo existe, -1 si no.
     */
    public int login(String correo) {
        if (credenciales.containsKey(correo)) {
            return 1;
        }
        return -1;
    }

    /**
     * Verifica si la contraseña corresponde al correo.
     * @param correo El correo electrónico.
     * @param pass La contraseña a verificar.
     * @return true si la contraseña es correcta, false en caso contrario.
     */
    public boolean password(String correo, String pass) {
        // En este caso, el método recibe el correo directamente para verificar
        return credenciales.containsKey(correo) && credenciales.get(correo).equals(pass);
    }

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        LoginCheckerScanner checker = new LoginCheckerScanner();

        System.out.println("--- Sistema de Login ---");
        System.out.println("--- Correos Existentes con sus contraseñas ---");
        System.out.println("usuario1@ejemplo.com  -- password123");
        System.out.println("usuario2@ejemplo.com -- password456");
        System.out.println("admin@ejemplo.com -- admin_pass");
        System.out.print("Por favor, ingrese su correo: ");
        String correoIngresado = scanner.nextLine();

        // 1. Verificamos el correo con el método login
        int resultadoLogin = checker.login(correoIngresado);

        if (resultadoLogin != -1) {
            System.out.println("Correo encontrado. Ahora ingrese la contraseña.");
            System.out.print("Ingrese su contraseña: ");
            String passIngresada = scanner.nextLine();

            // 2. Verificamos la contraseña con el método password
            boolean resultadoPassword = checker.password(correoIngresado, passIngresada);

            if (resultadoPassword) {
                System.out.println("\n¡Acceso concedido! Bienvenido.");
            } else {
                System.out.println("\nContraseña incorrecta. Acceso denegado.");
            }

        } else {
            System.out.println("\nEl correo ingresado no existe. Acceso denegado.");
        }

        scanner.close(); // Siempre es buena práctica cerrar el objeto Scanner
    }
}