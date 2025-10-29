


























class 



LintersAndFormatersFixed {
    public static void main( String[] args ) {
        Perros animal1 = new Perros( "Juan", "Perro", "Husky" );
animal1.Edad = 4; animal1.mostrarInformacion(); animal1.hacerSonido(); animal1.ladrar();
}} class 


Animales {
    String Nombre;
String Especie;
                        int Edad;
    Animales(String nombreP, String especieP) {
this.Nombre = nombreP;          this.Especie = especieP;
    }
void mostrarInformacion() {
                System.out.println("Nombre: " + this.Nombre);
        System.out.println("Especie: " + this.Especie);
            System.out.println("Edad: " + this.Edad + " Años");
    }          
    
    
    public void hacerSonido() { System.out.println(this.Nombre + " hace un sonido."); }
}




// clase perro 
// que hereda de animales
// y tiene un metodo ladrar
// y un metodo hacerSonido que hace un gruñido



class 
Perros extends Animales {
    String raza;
    Perros(String nombreP, String especieP, String razaP) {
    super(nombreP, especieP);
    this.raza = razaP; }
    public void hacerSonido() { System.out.println(super.Nombre + " hace un gruñido*");}
    void ladrar() { System.out.println("Guau"); } }