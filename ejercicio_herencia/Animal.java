package ejercicio_herencia;

public class Animal {
    int energia;
    int saciedad;
    String especie;
    String raza;
    float tamaño;
    float peso;

    int comer(String tipoAlimento, float cantidad){
        this.saciedad = (int)cantidad;
        return this.saciedad;
    }

    int descansar(int tiempo){
        this.energia = tiempo;
        return this.energia;
    }
}
