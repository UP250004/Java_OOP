class Marker {
    String nombreColor;
    short nivelTinta;
    float grosorPunta;
    String marca;
    float tamaño;
    String tipo;
} //
class e13IntroPoo {
    public static void main(String[] args) {
        Marker marcadorBlanco = new Marker(); // <----
        marcadorBlanco.nombreColor="Blanco";
        marcadorBlanco.nivelTinta=100;
        marcadorBlanco.grosorPunta=2;
        marcadorBlanco.marca= "Sharpie";
        marcadorBlanco.tamaño= 15;
        marcadorBlanco.tipo= "Tinta";

        Marker marcadorAzul = new Marker(); // <----
        marcadorAzul.nombreColor="Azul";
        marcadorAzul.nivelTinta=89;
        marcadorAzul.grosorPunta=1;
        marcadorAzul.marca= "Sharpie";
        marcadorAzul.tamaño= 13;
        marcadorAzul.tipo= "Tinta";

        Marker marcadorVerde = new Marker(); // <----
        marcadorVerde.nombreColor="Verde";
        marcadorVerde.nivelTinta=74;
        marcadorVerde.grosorPunta=3;
        marcadorVerde.marca= "Sharpie";
        marcadorVerde.tamaño= 17;
        marcadorVerde.tipo= "Tinta";

        Marker marcadorNegro = new Marker(); // <----
        marcadorNegro.nombreColor="Verde";
        marcadorNegro.nivelTinta=15;
        marcadorNegro.grosorPunta=2;
        marcadorNegro.marca= "Sharpie";
        marcadorNegro.tamaño= 17;
        marcadorNegro.tipo= "Tinta";

        Marker[] estuchePlumones = new Marker[4];
        estuchePlumones[0] = marcadorAzul;
        estuchePlumones[1] = marcadorBlanco;
        estuchePlumones[2] = marcadorNegro;
        estuchePlumones[3] = marcadorVerde;

        System.out.println("Información de los marcadores:");
        for (Marker marcador : estuchePlumones) {
            System.out.println("---");
            System.out.println("Color: " + marcador.nombreColor);
            System.out.println("Nivel de tinta: " + marcador.nivelTinta + "%");
            System.out.println("Grosor de la punta: " + marcador.grosorPunta + " mm");
            System.out.println("Marca: " + marcador.marca);
            System.out.println("Tamaño: " + marcador.tamaño + " cm");
            System.out.println("Tipo: " + marcador.tipo);
        }
    } //
} //