class Marker {
    String nombreColor;
    short nivelTinta;
    Marker(String paramColor){
        System.out.println("Creating a marker");
        this.nivelTinta = 100;
        this.nombreColor = paramColor; //Esta variable almacena el color mandado desde main
        
    }

}
class E14Constructores {
    public static void main(String[] args) {
        /*new Marker();// se llama, pero no se almacena en nada, se "deshecha la variable..."*/
        Marker marcadorBlanco = new Marker("Blanco");//aqui si se almacena lo de Marker a diferencia del anterior
        System.out.println(marcadorBlanco.nombreColor);

        Marker marcadorVerde = new Marker("Verde");
        System.out.println(marcadorVerde.nombreColor);
    }
}