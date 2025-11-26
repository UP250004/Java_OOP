public class E25Overs {
    public static void main(String ... args) {
        Persona p = new Persona("Brian", 449457);
        p.volumen = 0.6f;
        p.mensaje("HOLA " + "mi nombre es "+ p.getNombre() + "\n");
        p.mensaje("HOLA " + "mi nombre es "+ p.getNombre(), 347);
        
    }
}// fin de clase E25Overs

class Persona{
    private String nombre;
    private int telefono;
    float volumen;
    String hola;
    /// Constructor
    Persona(String nombre, int telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }
    ///
    public String getNombre() {
        return nombre;
    }
    void mensaje(String volumen){
        for (char letra : volumen.toCharArray()){
            boolean upper = Math.random() < this.volumen;
            if (upper){
                System.out.print(Character.toUpperCase(letra));

            }else{
                System.out.print(Character.toLowerCase(letra));
            }
        }
    }

    void mensaje(String volumen, int numero){
        for (char letra : volumen.toCharArray()){
            boolean upper = Math.random() < this.volumen;
            if (upper){
                System.out.print(Character.toUpperCase(letra));
            }else{
                System.out.print(Character.toUpperCase(letra));
            }
        }
    }
    /// 
    

}