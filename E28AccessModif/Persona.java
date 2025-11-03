class Persona {
    protected String telefono;
    public String nombre;
// SETTER (escribir valor)
    boolean setTlef(String newTelef){
        //valida 10 numeros
        if(newTelef.length() != 10){
            System.out.println("Error en el telefono, no se pudo guardar...");
            return false;
        }
        //valida solo numeros
        if(!newTelef.matches("\\d+")){
            System.out.println("Datos erroneos, solo debe de contener numeros...");
            return false;
            
        }
        System.out.println("Telefono actualizado...");
        this.telefono= newTelef;
        return true;
        
    }
// GETTER (leer el valor)
    String getTelef(){
        return this.telefono;
    }
}
