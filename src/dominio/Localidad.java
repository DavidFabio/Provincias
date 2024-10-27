package dominio;

public class Localidad {
    private String nombre;
    private int numeroDeHabitantes;

    // Constructor
    public Localidad(String nombre, int numeroDeHabitantes) {
        this.nombre = nombre;
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeHabitantes() {
        return numeroDeHabitantes;
    }

    public void setNumeroDeHabitantes(int numeroDeHabitantes) {
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    // toString
    @Override
    public String toString() {
        return "Localidad: " + nombre + ", Habitantes: " + numeroDeHabitantes;
    }
}
