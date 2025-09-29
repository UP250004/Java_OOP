
class E15UsuarioConstructor{
    public static void main(String[] args){
        String correo = "Brian1321@gmail.com";
        String nombre = "Brian";
        short edad = 23;

        if(correo != "" ){
            Usuario brian = new Usuario(correo,nombre,edad);
            System.out.println("El nombre del usuario es: " + brian.nombre);
            System.out.println("Su correo es: " + brian.correo);
        }else{
            System.out.println("Ingrese un correo baboso...");
        }
    }

}

class Usuario{
    String nombre;
    String correo;
    short edad;

    Usuario(String CorreoEnv, String paramNombre, short paramEdad){
        this.correo = CorreoEnv;
        this.nombre = paramNombre;
        this.edad = paramEdad;
    }
}

