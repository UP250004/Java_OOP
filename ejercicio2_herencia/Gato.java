
public class Gato extends Mascota {
    Gato(){
    }
    Gato(String nombreGato){
        super(nombreGato);
        this.tirarCosas();
    }
    private void tirarCosas(){
        System.out.println("Miau...");
        super.jugar();
    }

}
