class Estudiante extends Persona{
    public String matricula;
    private int calif;

    void printNombre(){
        System.out.println("El nombre del estudiante es: " + super.nombre);
    }

    void printTelef(){
        System.out.println("El telefono es: " + super.telefono);
    }
}
