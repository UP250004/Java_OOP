/*
class P2E2Estudiantes{
    public static void main(String ... args){
        Estudiantes estPaul = new Estudiante("Paul Sayas", "UP24581");
        Estudiantes estPaulo = new Estudiante("Paulo Sayas", "UP27552");
        Estudiantes estRoberto = new Estudiante("Roberto Gomez", "UP27523");
        Estudiantes estRoberto = new Estudiante(" ", " ");

    }
}

class Estudiantes{
    String nombre;
    boolean asistencia;
    String matricula;
    Estudiante(String name, String up){
        this.nombre = name;
        this.matricula = up;
        this.asistencia = false;
    }

}

class Lista{
    String nombre;
    boolean asistencia;
    String matricula;

}
class Asistencia{
    Lista[] listaEstudiantes = new Lista[4];
    listaEstudiantes[0].nombre = "Paul Sayas";
    listaEstudiantes[0].asistencia = false;
    listaEstudiantes[0].matricula = "UP24581";
    listaEstudiantes[1].nombre = "Paulo Sayas";
    listaEstudiantes[1].asistencia = false;
    listaEstudiantes[1].matricula = "UP27552";
    listaEstudiantes[2].nombre = "Roberto Gomez";
    listaEstudiantes[2].asistencia = false;
    listaEstudiantes[2].matricula = "UP27523";
    listaEstudiantes[3].nombre = "Lucero Díaz";
    listaEstudiantes[3].asistencia = false;
    listaEstudiantes[3].matricula = "UP22547";
    public registrarAsistencia(){//debe de imprimir cada nombre y asignar Student.asistencia es Igual a TRUE
    System.out.println("------ Lista de estudiantes -----")
    for(Lista listEst : listaEstudiantes){
        System.out.println("Alumno: " + this.nombre);
        System.out.println("Matrícula: " + this.matricula);
        if(listaEstudiantes.nombre == ){
            
        }else{
            System.out.println("" + this.matricula);
        }
    }

    }
}*/

class Estudiante {
    String nombre;
    String matricula;
    boolean presente;

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.presente = false; // Por defecto, todos los estudiantes están ausentes
    }
}

// Clase principal para gestionar la asistencia
public class P2E2Estudiantes {
    public static void main(String[] args) {
        // Crear un array de estudiantes con un tamaño fijo
        Estudiante[] listaEstudiantes = new Estudiante[4];
        
        // Inicializar los objetos Estudiante en el array
        listaEstudiantes[0] = new Estudiante("Paul Sayas", "UP24581");
        listaEstudiantes[1] = new Estudiante("Paulo Sayas", "UP27552");
        listaEstudiantes[2] = new Estudiante("Roberto Gomez", "UP27523");
        listaEstudiantes[3] = new Estudiante("Lucero Díaz", "UP22547");

        // Marcar la asistencia de algunos estudiantes
        // Simulamos la toma de asistencia
        System.out.println("--- Tomando Asistencia ---");
        marcarAsistencia(listaEstudiantes, "UP24581"); // Paul
        marcarAsistencia(listaEstudiantes, "UP27523"); // Roberto
        marcarAsistencia(listaEstudiantes, "UP22547"); // Lucero
        marcarAsistencia(listaEstudiantes, " "); // Ejemplo de un estudiante no encontrado

        // Imprimir los resultados
        imprimirPresentes(listaEstudiantes);
        imprimirAusentes(listaEstudiantes);
    }

    /**
     * Busca y marca la asistencia de un estudiante por su matrícula.
     * @param estudiantes El array de estudiantes.
     * @param matricula La matrícula del estudiante a buscar.
     */
    public static void marcarAsistencia(Estudiante[] estudiantes, String matricula) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.matricula.equals(matricula)) {
                estudiante.presente = true;
                System.out.println(" " + estudiante.nombre + " con matrícula " + matricula + " ha sido marcado como presente.");
                return; // Salir del método una vez que se encuentra al estudiante
            }
        }
        System.out.println("Error: Estudiante con matrícula " + matricula + " no encontrado.");
    }

    /**
     * Imprime la lista de estudiantes presentes.
     * @param estudiantes El array de estudiantes.
     */
    public static void imprimirPresentes(Estudiante[] estudiantes) {
        System.out.println("\n--- Estudiantes Presentes ---");
        boolean hayPresentes = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.presente) {
                System.out.println("  - " + estudiante.nombre + " (" + estudiante.matricula + ")");
                hayPresentes = true;
            }
        }
        if (!hayPresentes) {
            System.out.println("  (Ningún estudiante ha sido marcado como presente)");
        }
    }

    public static void imprimirAusentes(Estudiante[] estudiantes) {
        System.out.println("\n--- Estudiantes Ausentes ---");
        boolean hayAusentes = false;
        for (Estudiante estudiante : estudiantes) {
            if (!estudiante.presente) {
                System.out.println("  - " + estudiante.nombre + " (" + estudiante.matricula + ")");
                hayAusentes = true;
            }
        }
        if (!hayAusentes) {
            System.out.println("  (Todos los estudiantes están presentes)");
        }
    }
}