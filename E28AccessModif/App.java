class App {
    public static void main(String ... args) {
        Persona per1 = new Persona();
        per1.nombre = "Alex";
        per1.setTlef("4494558516");

        System.out.println("Telefono del estudiante: " + per1.getTelef());
        

        Estudiante es1 = new Estudiante();
        es1.matricula = "UP250004";
        es1.nombre = "Juanito";
        es1.setTlef("4494745222");
        es1.printNombre();
        es1.printTelef();
    }
    
}
