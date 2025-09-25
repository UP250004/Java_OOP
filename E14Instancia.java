class Usuario{
    int edad;
    String correo;
    String nombre;
}

class E14Instancia{
    public static void main(String[] args){
        Usuario jaimeUser = new Usuario();
        jaimeUser.edad = 25;
        jaimeUser.correo = "ejemplo@gmail.com";
        jaimeUser.nombre = "Jaime Ibarra Ortiz";

        Usuario brianUser = new Usuario();
        brianUser.edad = 23;
        brianUser.correo = "ejemplo124345@gmail.com";
        brianUser.nombre = "Brian Odin Rubio Viramontes";

        Usuario[] usuarioss = new Usuario[2];
        usuarioss[0] = jaimeUser;
        usuarioss[1] = brianUser;
        System.out.println("Información de los usuarios:");
        for (Usuario user : usuarioss) {
            System.out.println("---");
            System.out.println("Nombre: " + user.nombre);
            System.out.println("Edad: " + user.edad);
            System.out.println("Correo: " + user.correo);
        }
    }
}