package modelo;

/**
 *
 * @author Jairo F
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String programa;

    public Estudiante(String nombre, int edad, String programa) {
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the programa
     */
    public String getPrograma() {
        return programa;
    }

    /**
     * @param programa the programa to set
     */
    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return "Estudiante(" + "nombre=" + nombre + ", edad=" + edad + ", programa=" + programa + ')';
    }
    
    
}
