
public class Mascota {
    String nombre;
    Mascota(String nombre){
        this.nombre = nombre;
    }
    Mascota(){
        System.out.println("Creando mascota");
    }
    void comer(){
        this.jugar();
        System.out.println("Comiendo...");
    }

    void jugar(){
        System.out.println("Jugando...");
    }
    
}
