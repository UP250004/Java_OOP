class e6ParamsParImpar{

    static boolean esPar(int numEvaluar){
        int residuo = numEvaluar % 2; // boolean res = numero % 2 == 0 *Otra manera de hacerlo*
        //Return res;
        if(residuo == 0){
            return true;
        }
        return false;//Se puede omitir el colocar el else por el return del if
    }//fin de esPar
    
    public static void main (String[]args){//inicio de main
        boolean numeroPar = esPar(10);

        if(numeroPar == true){
            System.out.print("Es par");
        }else{
            System.out.print("Es impar");
        }

    }//fin de main


}//fin de class
