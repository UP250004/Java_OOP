
public class Silla extends Mueble{
    //Atributos
    int nivelErgonomia;
    String materialPrincipal;
    //Constructor
    Silla(int ancho, int largo, int altura, float precio, int x,String material){
        super(ancho, largo, altura, precio);
        this.nivelErgonomia = x;
        this.materialPrincipal = material;
        System.out.println("El nivel de ergonomia actual es de " + this.nivelErgonomia + " y el material de la silla es de " + this.materialPrincipal);
    }
    //Metodos
    void sentarse(){
        System.out.println("Te has sentado en la silla puto...");
    }//fin del metodo "sentarse"
}
