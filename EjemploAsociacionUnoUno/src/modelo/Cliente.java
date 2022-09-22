package modelo;

/**
 *
 * @author Jairo F
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String id;
    
    private Cuenta cuentaRegistrada;

    public Cliente(String nombre, String apellido, String id, Cuenta cuentaRegistrada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentaRegistrada = cuentaRegistrada;
    }

    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the cuentaRegistrada
     */
    public Cuenta getCuentaRegistrada() {
        return cuentaRegistrada;
    }

    /**
     * @param cuentaRegistrada the cuentaRegistrada to set
     */
    public void setCuentaRegistrada(Cuenta cuentaRegistrada) {
        this.cuentaRegistrada = cuentaRegistrada;
    }

    @Override
    public String toString() {
        return "Cliente{"+  
               "\n       nombre=" + nombre +  
               "\n       apellido=" + apellido +  
               "\n       id=" + id + 
               "\n       cuentaRegistrada=(" + 
               "Saldo: " + cuentaRegistrada.getSaldo() + 
               ", Limite: " + cuentaRegistrada.getLimite()+
               ", Fecha apertura: "+cuentaRegistrada.getFechaApertura().toString() + ")"+
               "\n}";
    }
    
    
}
