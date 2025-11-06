import java.util.ArrayList;
class P2E4ArrayList{
    class Persona{
        void saludar(){
            System.out.println("Buenos días");
        }
    }

    class Profesor extends Persona{
        void saludar(){
            System.out.println("Hola putos");
            super.saludar();
        }
    }

    public static void main(String ... args){
        Profesor prof = new Profesor();
        prof.saludar();
    }
    /* 
    public static void main(String[] args){
        int[] numerosPares = new int[4];
        numerosPares[0] = 2;
        numerosPares[1] = 4;
        numerosPares[2] = 6;
        numerosPares[3] = 8;
        ArrayList<Integer> numerosParesV2 = new ArrayList<Integer>();//ArrayList no existe dentro de Java por default, debemos de implementar una librería, se debe de aplicar este metodo de esta manera...
        numerosParesV2.add(2); //Recibe un parametro tipo "E", regresa un booleano... 
        numerosParesV2.add(4);
        numerosParesV2.add(6);
        numerosParesV2.add(8);
        numerosParesV2.add(10);///Estos métodos permiten meter una n cantidad de objetos en el Array
        System.out.println(numerosParesV2.get(3));//Get: agarra un valor que se encuentre en la posicion marcada en el Array
        
        System.out.println("Tamaño del Array: " + numerosParesV2.size());
        System.out.println("Se va a remover el 8 del arreglo... "+ numerosParesV2.get(3));
        numerosParesV2.remove(3);
        for (int e : numerosParesV2){
            System.out.println(e);
        }
        System.out.println("Tamaño del Array: " + numerosParesV2.size());

        int[] arregloExportado = numerosParesV2.toArray();
        for (int a : arregloExportado){
            System.out.println(a);
        }
        System.out.println("Tamaño del Array: " + arregloExportado.size());
    }
        */
    }
    
