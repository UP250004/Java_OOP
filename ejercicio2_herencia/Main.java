public class Main {
    public static void main(String[] args) {
        Gato donGato = new Gato("Don Gato");
        
        //donGato.tirarCosas();
        //donGato.jugar();
        donGato.comer();
        System.out.println("-----------");
        Gato garfield = new Gato();
        garfield.comer();
    }
}
