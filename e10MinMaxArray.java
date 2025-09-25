import java.util.Scanner;
class e10MinMaxArray{

    static void numeros(int cantidad){
        Scanner num = new Scanner(System.in);
        float[] numeros = new float[cantidad];
        for (int i = 0; i < cantidad; i++) {
                System.out.println("Dame el numero " + (i+1) +":" );
                numeros[i] = num.nextFloat();
            }//
            float minActual = numeros[0];
            float maxActual = numeros[0];
            float minGlobal = 0;
            float maxGlobal = 0;
            System.out.println("------- Numeros insertados -------");
        for (int i = 0; i < cantidad; i++) {
                System.out.print(numeros[i] + " --- " );
                    if(numeros[i] < minActual){
                        minGlobal = numeros[i];
                    }
                    if(numeros[i] > maxActual){
                        maxGlobal = numeros[i];
                }
            }//
        System.out.println("\n" );
        System.out.println("El numero más pequeño de la lista es: "+ minGlobal +"\n" );
        System.out.println("El numero más grande de la lista es: "+ maxGlobal +"\n" );
    }//fin de alumnos


    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame la cantidad de numeros a analizar:");
            int cantidad = entrada.nextInt();
        numeros(cantidad);    
    }

}//fin de class
