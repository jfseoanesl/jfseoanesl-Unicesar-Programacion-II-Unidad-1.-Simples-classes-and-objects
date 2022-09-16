package testcoche;

/**
 *
 * @author Jairo F
 */
public class Coche {
    private String color;
    private String marca;
    private String matricula;
    private int modelo;
    private double caballos;
    private int nPuertas;

    public Coche() {
        this.color="Blanco";
        this.marca="Toyota";
        this.matricula = "XXXX";
        this.modelo=2023;
        this.caballos=1500.45;
        this.nPuertas=4;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the caballos
     */
    public double getCaballos() {
        return caballos;
    }

    /**
     * @param caballos the caballos to set
     */
    public void setCaballos(double caballos) {
        this.caballos = caballos;
    }

    /**
     * @return the nPuertas
     */
    public int getnPuertas() {
        return nPuertas;
    }

    /**
     * @param nPuertas the nPuertas to set
     */
    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

   
    public String mostrarInfo() {
        return "Coche{" + "color=" + color + ", marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo + ", caballos=" + caballos + ", nPuertas=" + nPuertas + '}';
    }
    
    
    
}
