
public class Tierra extends Planeta {
    // Atributo específico de la clase Tierra
    private int cantPersonas;

    // Constructor de Tierra
    // Debe llamar al constructor de la superclase (Planeta) usando 'super()'
    public Tierra(int diasAnio, float diam, int personasIniciales) {
        super(diasAnio, diam); // Llama al constructor de Planeta
        this.cantPersonas = personasIniciales;
    }

    // Método para simular un terremoto y disminuir la cantidad de personas
    // El diagrama indica 'terremotos(): personasMuertas'
    public int terremotos(int personasMuertas) {
        if (this.cantPersonas >= personasMuertas) {
            this.cantPersonas -= personasMuertas;
            System.out.println("¡Terremoto! Murieron " + personasMuertas + " personas.");
            System.out.println("Población actual: " + this.cantPersonas);
            return personasMuertas;
        } else {
            int personasFallecidas = this.cantPersonas;
            this.cantPersonas = 0;
            System.out.println("¡Terremoto! Murieron " + personasFallecidas + " personas, la población llegó a 0.");
            return personasFallecidas;
        }
    }

    // Método para simular un tsunami y disminuir la cantidad de personas
    // El diagrama indica 'tsunami(): personasMuertas'
    public int tsunami(int personasMuertas) {
        if (this.cantPersonas >= personasMuertas) {
            this.cantPersonas -= personasMuertas;
            System.out.println("¡Tsunami! Murieron " + personasMuertas + " personas.");
            System.out.println("Población actual: " + this.cantPersonas);
            return personasMuertas;
        } else {
            int personasFallecidas = this.cantPersonas;
            this.cantPersonas = 0;
            System.out.println("¡Tsunami! Murieron " + personasFallecidas + " personas, la población llegó a 0.");
            return personasFallecidas;
        }
    }

    // Método para aumentar los años transcurridos
    // Utiliza el método 'movTraslacion' de la superclase (Planeta)
    // El método de la clase Tierra aumenta los años transcurridos llamando
    // al método heredado, por ejemplo, simulando 365 días (un año).
    public void aumentarAniosTranscurridos() {
        // Usamos el valor de 'diasAnio' de la superclase
        super.movTraslacion(super.getDiasAnio());
    }

    // Getter para la cantidad de personas
    public int getCantPersonas() {
        return cantPersonas;
    }
}