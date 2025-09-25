
import java.util.Scanner;
class classmates{
    static void alumnos(int cantidad){
        Scanner per = new Scanner(System.in);
        String[] personas = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Dame el nombre del alumno " + (i+1) +":" );
            personas[i] = per.nextLine();
            }//
            System.out.println("------- Lista de alumnos -------");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("El nombre del alumno " + (i+1) + " es " + personas[i] + "\n" );
            }//
        System.out.print(".");
    }//fin de alumnos

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame la cantidad de alumnos que hay:");
            int cantidad = entrada.nextInt();
        alumnos(cantidad);    
    }
}















/*
import java.util.Scanner;

class classmates {
    static void alumnos(int cantidad) {
        Scanner per = new Scanner(System.in);
        String[] personas = new String[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Dame el nombre del alumno " + (i + 1) + ":");
            // Corrección: se elimina 'String' antes de 'personas[i]
            personas[i] = per.nextLine(); 
        }
        System.out.println("--- Lista de Alumnos ---");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("El nombre del alumno " + (i + 1) + " es " + personas[i] + ".");
        }
        // Se cierra el objeto Scanner para liberar recursos.
        per.close();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame la cantidad de alumnos que hay:");
        int cantidad = entrada.nextInt();
        // Esto evita que nextLine() en el método alumnos() se salte la primera entrada.
        entrada.nextLine(); 
        
        alumnos(cantidad);
        
        // Se cierra el objeto Scanner de main.
        entrada.close();
    }
}

*/


