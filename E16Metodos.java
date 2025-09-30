class E16Metodos{
    public static void main(String[] args){
        String palabra = "holaMundo";
        escribir(palabra);
        Marcador marcadorBlanco = new Marcador("Blanco", i);
    }
    static void escribir(String texto){
        for(char letra: texto.toCharArray()){
            if(this.nivelTinta > 0){
            System.out.println(letra);
            this.nivelTinta--;//this.nivelTinta = this.nivelTinta - 1;
            }
        }

        }
    }

}

class Marcador{
    String colorMarcador;
    short nivelTinta;

    Marcador(String color, short porcentaje){
        this.nivelTinta = 3;
        this.colorMarcador = color;
    }
}
