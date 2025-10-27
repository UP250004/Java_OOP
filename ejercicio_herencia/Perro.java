package ejercicio_herencia;

public class Perro {
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
