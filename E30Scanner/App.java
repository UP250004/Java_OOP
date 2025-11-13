package E30Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.IllegalStateException;

class App {
    public static void main(String ... args) {
        Scanner scanner = new Scanner(System.in);
        int cantHermanos = 0;
        System.out.println("Indique cuantos hermanos tienes... ");
        try {
            
            cantHermanos = scanner.nextInt();

            if(cantHermanos < 0 ){
                System.out.println("No puedes poner numeros negativos...");
                cantHermanos = 0;
            }
            System.out.println("Ok");
        }
        catch(IllegalStateException ex){
            System.out.println("Excepcion distinta...");
        }
        catch(InputMismatchException ex){
            System.out.println("Dato no valido... ");
            System.out.println(ex);
        }
        System.out.println("Tienes " + cantHermanos + " hermano(s)");
        scanner.close();
    }
    
}
