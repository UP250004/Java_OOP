class FuncionInvocacion{
    static void ImprimirSaludo(){// Primer función, declaracion o implementación de la función "ImprimirSaludo();"
        System.out.print("Hola, (Escrito con  void)");
    }

    static String ObtenerSaludo(){// Segunda declaración, de la función "ObtenerSaludo();"
        return "\nHola, mucho gusto, bienvenido a la casa de los sustos xd.";
    }
    public static void main(String[] args){
        //invocación
        ImprimirSaludo();
        String saludar = ObtenerSaludo();
        System.out.print(saludar);//Poner exactamente System.out.print("x");
    }
}

