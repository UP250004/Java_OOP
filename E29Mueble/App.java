
public class App {
    public static void main(String ... args){
        boolean vendido = false;
        Silla silla = new Silla(2,2,4,87.8f,95,"Piel carnero");
        vendido = silla.venderse(100f);
        System.out.println(vendido);
        silla.sentarse();
    }

}
