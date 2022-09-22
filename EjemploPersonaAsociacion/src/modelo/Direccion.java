package modelo;

/**
 *
 * @author Jairo F
 */
public class Direccion {
    private String barrio;
    private String no;

    public Direccion() {
    }

    public Direccion(String barrio, String no) {
        this.barrio = barrio;
        this.no = no;
    }

    /**
     * @return the barrio
     */
    public String getBarrio() {
        return barrio;
    }

    /**
     * @param barrio the barrio to set
     */
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    /**
     * @return the no
     */
    public String getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "(" + "barrio=" + this.barrio + ", no=" + this.no + ')';
    }
    
    
}
