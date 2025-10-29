
public class Gato extends Mascota {
    Gato(){
    }
    Gato(String nombreGato){
        super(nombreGato);
    }
    void tirarCosas(){
        System.out.println("Miau...");
        super.jugar();
    }

}
