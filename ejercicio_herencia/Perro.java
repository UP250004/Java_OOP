
public class Perro extends Animal{
    String pelaje;
    int nivelOlfato;
    int nivelLadrido;

    Perro(int nivelOlfat){// nivelOlfat --> parámetro
        this.nivelOlfato = nivelOlfat;//instancia --> this.nivelOlfato
    }
    void ladrar(String sonido){
        System.out.println(sonido);
    }
}
