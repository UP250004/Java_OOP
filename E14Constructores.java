class Marker {
    String nombreColor;
    short nivelTinta;
    Marker(){
        System.out.println("Creating a marker");

    }

}
class E14Constructores {
    public static void main(String[] args) {
        new Marker();
        Marker marcadorBlanco = new Marker();
    }
}