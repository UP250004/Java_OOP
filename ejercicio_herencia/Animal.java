
public class Animal {
    int energia;
    int saciedad;
    String especie;
    String raza;
    float tamaño;
    float peso;

    int comer(String tipoAlimento, float cantidad){
        this.saciedad = (int)cantidad;
        if(tipoAlimento == "ScoobyGalletas"){
            System.out.println("A Scooby Doo le gusta comer Scooby Galletas para ser valiente");
        }
        return this.saciedad;
    }

    int descansar(int tiempo){
        this.energia = tiempo;
        return this.energia;
    }
}
