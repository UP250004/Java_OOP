import person.Estudiante;
import helpers.Email;
public class App {
    public static void main(String ... args){
        Estudiante es1 = new Estudiante();
        es1.setEmail("example@gmail.com");
        System.out.println(es1.getEmail());
        Email helperEmail = new Email();

        helperEmail.enviarEmail(es1.getEmail());
    }
}
