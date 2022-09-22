package modelo;

/**
 *
 * @author Jairo F
 */
public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    
    private Fecha fechaNacimiento;
    
    private Direccion dirDomicilio;
    private Direccion dirTrabajo;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, String genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }

    public Persona(String cedula, String nombre, String apellido, String genero, Fecha fechaNacimiento, Direccion dirDomicilio, Direccion dirTrabajo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.dirDomicilio = dirDomicilio;
        this.dirTrabajo = dirTrabajo;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the fechaNacimiento
     */
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the dirDomicilio
     */
    public Direccion getDirDomicilio() {
        return dirDomicilio;
    }

    /**
     * @param dirDomicilio the dirDomicilio to set
     */
    public void setDirDomicilio(Direccion dirDomicilio) {
        this.dirDomicilio = dirDomicilio;
    }

    /**
     * @return the dirTrabajo
     */
    public Direccion getDirTrabajo() {
        return dirTrabajo;
    }

    /**
     * @param dirTrabajo the dirTrabajo to set
     */
    public void setDirTrabajo(Direccion dirTrabajo) {
        this.dirTrabajo = dirTrabajo;
    }

    @Override
    public String toString() {
        return "Persona{" + 
               "\n          cedula=" + cedula + 
               "\n          nombre=" + nombre + 
               "\n          apellido=" + apellido +
               "\n          genero=" + genero + 
               "\n          fechaNacimiento=" + fechaNacimiento + 
               "\n          dirDomicilio=" + dirDomicilio + 
               "\n          dirTrabajo=" + dirTrabajo + 
               "\n}";
    }
    
    
}
