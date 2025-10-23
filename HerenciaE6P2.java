class Spaces {
    float heigth;
    float large;
    float width;

    void enter(String person){
        System.out.println(person + " a entrado en la habitación.");
    }

    void exit(String person){
        System.out.println(person + " a salido de la habitación.");
    }
    Spaces(float i, float j, float k){
        this.heigth = i;
        this.large = j;
        this.width = k;
    }
    
}

class Person{
    String name;
    Person(String n){
        this.name = n;
    }
}

class Room extends Spaces{//para realizar la herencia "extends"
    int door;
    int window;
    Room(float x, float y, float z){
        super(x,y,z);// super sirve para referirse a la clase padre de la subclase o clase hija, lo que permite modificar los valores dentro de los parentesis...
    }
}

class HerenciaE6P2 {
    public static void main(String ... args){
        Person persona1 = new Person("Alejandro");
        persona1.name = "Brian";
        Room bedRoom = new Room(2.22f,3.52f,7.12f);
        bedRoom.door = 3;
        bedRoom.window = 4;
        bedRoom.enter(persona.name);
        System.out.println("Las dimensiones de la habitación son:");
        System.out.println("Altura: " + bedRoom.heigth);
        System.out.println("Largo: " + bedRoom.large);
        System.out.println("Anchura: " + bedRoom.width);



    }
}

