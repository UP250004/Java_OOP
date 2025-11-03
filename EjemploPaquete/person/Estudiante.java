package person;

public class Estudiante extends Persona{
    String email;
    public String matricula;
    private int calif;

    public boolean setEmail(String email){
        if(!email.contains("@")){
            this.email = email;
            System.out.println("Correo invalido...");
            return false;
        }
        this.email = email;
        System.out.println("Correo valido...");
        return true;
    }

    public String getEmail(){
        return this.email;
    }
}
