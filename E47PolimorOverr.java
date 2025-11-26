public class E47PolimorOverr {
    
    public static void main(String[] args) {
        Perro scooby = new Perro();
        scooby.hacerSonido();
        Animal al = new Animal();
        al.hacerSonido();
    }
}

public class Animal {
    void hacerSonido(){
        System.out.println("algo?");
    }
    
}

class Perro extends Animal{
    void hacerSonido(){
        System.out.println("whoofff");
    }
}
