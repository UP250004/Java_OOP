//import java.util.ArrayList;
public class Mueble {
    String fabricante;
    //ArrayList<Integer> numerosParesV2 = new ArrayList<>();//para hacer esto ocupas importar la libreria de ArrayList
    int[] dimensiones = new int[3];
    float precio;
    //Constructor
    Mueble(int ancho, int largo, int altura, float precio){
        this.dimensiones[0] = ancho;
        this.dimensiones[1] = largo;
        this.dimensiones[2] = altura;
        this.precio = precio;
    }


    //metodo
    public boolean venderse(float precio){
        if(precio >= this.precio){
            System.out.println("El mueble con el valor de " +this.precio + " con las dimensiones de "+ this.dimensiones[0] + " mts de ancho, "+ this.dimensiones[1] + " mts de largo " +this.dimensiones[2] + " mts de altura, con el dinero del cliente de " + precio + " rupias, su cambio es de " + (precio - this.precio) + " bolivares...." );
            return true;
        }else{
            System.err.println("El dinero dado no es suficiente para pagar el mueble, le falta: " + (this.precio - precio) + "pesos o dinero o lo que sea...");
            return false;
        }
    }
}
