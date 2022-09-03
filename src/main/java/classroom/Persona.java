package classroom;

public class Persona {

    long cedula;
    static int totalPersonas;

    String nombre;

    static {
        totalPersonas = 0;
    }

    Persona() {}

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        totalPersonas++;
    }

    long getCedula() {
        return cedula;
    }

}
