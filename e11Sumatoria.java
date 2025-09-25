import java.util.Scanner;
class e10MinMaxArray{

    static float numeros(int cantidad){
        Scanner num = new Scanner(System.in);
        float[] numeros = new float[cantidad];
        float sumatoria = 0;
        for (int i = 0; i < cantidad; i++) {
                System.out.println("Dame el numero " + (i+1) +":" );
                numeros[i] = num.nextFloat();
                sumatoria = sumatoria + numeros[i]; 
            }//
    return sumatoria;
    }//fin de alumnos


    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame la cantidad de numeros a analizar:");
            int cantidad = entrada.nextInt();
        System.out.println("La suma de los numeros insertados es: "+ numeros(cantidad));
    }

}//fin de class
