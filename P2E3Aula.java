import java.util.Random;
class Alumno {
    String nombre;
    String matricula;
    boolean enElAula; // true si está presente, false si está ausente
    boolean esDiestro; // true si es diestro, false si es zurdo

    public Alumno(String nombre, String matricula, boolean esDiestro) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.enElAula = false;
        this.esDiestro = esDiestro;
    }
}
class Asiento {
    boolean esDiestro;
    Alumno ocupante; // Referencia al alumno que ocupa este asiento

    public Asiento(boolean esDiestro) {
        this.esDiestro = esDiestro;
        this.ocupante = null; //Si no hay nadie dentro de esta madre
    }
}
class Aula {
    Asiento[] asientos;
    int capacidad;
    int numero;

    Aula(int numero, int capacidadDiestros, int capacidadZurdos) {
        this.numero = numero;
        this.capacidad = capacidadDiestros + capacidadZurdos;
        this.asientos = new Asiento[this.capacidad];
        for (int i = 0; i < capacidadDiestros; i++) {
            asientos[i] = new Asiento(true);
        }
        for (int i = capacidadDiestros; i < this.capacidad; i++) {
            asientos[i] = new Asiento(false);
        }
    }

    public boolean sentarAlumno(Alumno alumno) {
        // Buscar un asiento que se ajuste a la preferencia del alumno (diestro/zurdo)
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i].ocupante == null && asientos[i].esDiestro == alumno.esDiestro) {
                asientos[i].ocupante = alumno;
                alumno.enElAula = true;
                System.out.println(" " + alumno.nombre + " se ha sentado en un asiento " + (alumno.esDiestro ? "diestro." : "zurdo."));
                return true;
            }
        }
        return false; // No se encontró un asiento disponible
    }
}

// Clase principal
public class P2E3Aula {
    public static void main(String[] args) {
        Alumno[] listaAlumnos = {
            new Alumno("Paul Sayas", "UP24581", true),
            new Alumno("Paulo Sayas", "UP27552", false),
            new Alumno("Roberto Gomez", "UP27523", true),
            new Alumno("Lucero Díaz", "UP22547", true),
            new Alumno("Raul Sayas", "UP25004", false),
            new Alumno("Rosa Sayas", "UP26987", true),
            new Alumno("Humberto Gomez", "UP21234", true),
            new Alumno("Luz Díaz", "UP12346", false)
        };
        Aula aula604 = new Aula(604, 25, 15);
        Random aleatorio = new Random();
        System.out.println("--- Asignando asientos a los alumnos ---");
        for (Alumno alumno : listaAlumnos) {
            if (aleatorio.nextDouble() < 0.5) { 
                if (!aula101.sentarAlumno(alumno)) {
                    System.out.println(" " + alumno.nombre + " no pudo encontrar un asiento en el aula.");
                }
            } else {
                System.out.println(" " + alumno.nombre + " decidió no asistir a la clase hoy.");
            }
        }
        contarYMostrarEstado(listaAlumnos);
    }

    public static void contarYMostrarEstado(Alumno[] alumnos) {
        int presentes = 0;
        int diestrosPresentes = 0;
        int zurdosPresentes = 0;
        System.out.println("\n--- Resumen de asistencia ---");
        // Contar los alumnos presentes y ausentes
        for (Alumno alumno : alumnos) {
            if (alumno.enElAula) {
                presentes++;
                if (alumno.esDiestro) {
                    diestrosPresentes++;
                } else {
                    zurdosPresentes++;
                }
            }
        }
        
        int ausentes = alumnos.length - presentes;
        System.out.println("  - Alumnos dentro del aula: " + presentes);
        System.out.println("  - Diestros: " + diestrosPresentes);
        System.out.println("  - Zurdos: " + zurdosPresentes);
        System.out.println("\n -  Alumnos fuera del aula: " + ausentes);
        System.out.println("\n--- Lista de alumnos presentes ---");
        boolean hayPresentes = false;
        for (Alumno alumno : alumnos) {
            if (alumno.enElAula) {
                System.out.println("  - " + alumno.nombre + " (" + (alumno.esDiestro ? "Diestro" : "Zurdo") + ") " + "su matricula es: "+ alumno.matricula);
                hayPresentes = true;
            }
        }
        if (!hayPresentes) {
            System.out.println("  (Ningún alumno está presente)");
        }
        
        // Imprimir los nombres de los alumnos ausentes
        System.out.println("\n--- Lista de alumnos ausentes ---");
        boolean hayAusentes = false;
        for (Alumno alumno : alumnos) {
            if (!alumno.enElAula) {
                System.out.println("  - " + alumno.nombre + " (" + (alumno.esDiestro ? "Diestro" : "Zurdo") + ")"+"su matricula es: "+ alumno.matricula);
                hayAusentes = true;
            }
        }
        if (!hayAusentes) {
            System.out.println("  (Todos los alumnos están presentes)");
        }
    }
}