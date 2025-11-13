package E31ScannerTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.IllegalStateException;

class App {
    /*
     * Pregunten un integer
     * Generar un int[] de <input> pocisiones
     * Cachar todas las excepciones (numerica, letras, etc...)
     */
    public static void main(String ... args) {
        int cantidad = 0;
        Scanner numeros = new Scanner(System.in);
        System.out.println("Dame la cantidad de numeros del Array...");
        try{
            cantidad = numeros.nextInt();
            int[] num = new int[cantidad];
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Dame el numero " + (i+1) +":" );
                num[i] = numeros.nextInt();
            }//
        }//fin de try
        catch(IllegalStateException ex){
            System.out.println("Excepcion distinta...");
        }
        catch(InputMismatchException ex){
            System.out.println("Dato no valido... ");
            System.out.println(ex);
        }
        System.out.println("El array contiene los siguientes datos: ");
        for (int i = 0; i < cantidad; i++) {
                System.out.println("Dame el numero " + num[i]);
            }//
    }
}
