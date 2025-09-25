import java.util.Scanner;

class e10Login {
    //int checkLogin(String);
    static int checkLogin(String reqEmail){
        //Busca email en emails
        String[] emails = new String[5];
        emails[0]= "ejemplo1@gmail.com";
        emails[1]= "ejemplo2@gmail.com";
        emails[2]= "ejemplo3@gmail.com";
        emails[3]= "ejemplo4@gmail.com";
        emails[4]= "ejemplo5@gmail.com";
        // for each
        /*
        for (String element : emails){
            if (reqEmail == element){
                //if(email.equals(reqEmail))
                //No funciona por que se ocupa la posicion del index
            }
        }
        return 1;
    }
    */
        for(int index = 0; index < emails.length; index++){
            if(emails[index].equals(reqEmail)){
                return index;
            }

        }// fin de ciclo for

        return -1;
    }// fin de checkLogin

    static boolean contraseñasCorreos(String password, int idCorreo){
        String[] passwords = new String[5];
        passwords[0]= "ejemplo12345";
        passwords[1]= "54321";
        passwords[2]= "admin12345";
        passwords[3]= "helloWorld";
        passwords[4]= "holaMundo";
        if(passwords[idCorreo].equals(password)){
            return true;
        }
        
        return false;//En case de ingresar una contraseña erronea
    }
    // bool checkPassword(int, String);

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese su correo: ");
        String correoIngresado = scanner.nextLine();
        int idCorreo = checkLogin(correoIngresado);
        if(idCorreo != -1){// Se uso el diferencial de -1 debido a que es el dato "mas pesado o importante" dentro de la función del cambio del correo
            System.out.print("Correo válido, ahora ingrese la contraseña del correo: ");
            String password = scanner.nextLine();
            boolean passCorreo = contraseñasCorreos(password,idCorreo);
            if(passCorreo == true){
                System.out.print("La contraseña del correo es correcta.");
            }

            System.out.print("La contraseña del correo es incorrecta.");
        }

        System.out.print("Correo invalido, ingrese un correo válido");// Solo debe de dar si el correo no existe
        
    }// fin de main

}// fin de class