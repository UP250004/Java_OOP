class e7DosParams{

    static float Sumar(int n1, int n2){
        float resultado = n1 + n2;
        return resultado;
    }


    public static void main(String[] args){
        float resultado = Sumar(3,-2);
        if(resultado == 0){
            System.out.print("Es cero");
        }
        if(resultado < 0){
            System.out.print("Es negativo");
        }
        if(resultado > 0){
            System.out.print("Es positivo");
        }
    }
}//fin de class
