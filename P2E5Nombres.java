import java.util.ArrayList;
class P2E5Nombres{
    public static void main(String[] args){
        ArrayList<String> nombres = new ArrayList<String>();//1 ArrayList de nombres

        //2 Agregar nombres (Apellido Materno, Apellido Paterno, Nombre, Segundo Nombre).
        nombres.add("Viramontes");
        nombres.add(0,"Rubio");
        nombres.add(0,"Brian");
        nombres.add(0,"Odin");


        
        int a = 0;
        for(String i : nombres){
            System.out.println(i + " Posicion del nombre: " + a);
            a++;
        }
        //3 Imprimir ArrayList: "Brian Odin Rubio Viramontes"...
        System.out.println("Imprimiendo en orden el nombre: " + (nombres.get(1)) + " "+ (nombres.get(0)) + " " + (nombres.get(2)) + " " + (nombres.get(3)));
        //4 Evaluar si el nombre "Mitsiu" esta presente en la variable nombre
        System.out.println(("Existe el nombre Mitsiu en la variable? ")+ (nombres.contains("Mitsiu") ? "Si lo tiene" : "No lo tiene"));

        String primero = nombres.get(1);
        //5 Obtener la posicion del primer nombre en mayusculas
        System.out.println("El nombre " + primero.toUpperCase() + " tiene la posición: " + nombres.indexOf("Brian"));
        //6 !!      !!   !!      !!  !!     ! !   !! en minusculas
        System.out.println("El nombre " + primero.toLowerCase() + " tiene la posición: " + nombres.indexOf("Brian"));
        //7 Modiificar todos los elementos del ArrayList para estar en mayusculas (String.toUpperCase())

        
        for(int i = 0; i < nombres.size(); i++){
            String nombreMayuscula = nombres.get(i).toUpperCase();
            nombres.set(i, nombreMayuscula);
        }

        System.out.println("ArrayList después de modificar a mayúsculas:");
        System.out.println(nombres);
    }//fin de main
}//fin de class