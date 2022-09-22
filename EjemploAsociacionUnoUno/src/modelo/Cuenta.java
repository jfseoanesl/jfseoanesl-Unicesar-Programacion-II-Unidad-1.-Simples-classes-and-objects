package modelo;

import java.util.Date;

/**
 *
 * @author Jairo F
 */
public class Cuenta {
    private double saldo;
    private double limite;
    private Date fechaApertura;
    
    private Cliente titular;

    public Cuenta(double saldo, double limite, Date fechaApertura, Cliente titular) {
        this.saldo = saldo;
        this.limite = limite;
        this.fechaApertura = fechaApertura;
        this.titular = titular;
    }

    public Cuenta(double saldo, double limite, Date fechaApertura) {
        this.saldo = saldo;
        this.limite = limite;
        this.fechaApertura = fechaApertura;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }

    /**
     * @return the fechaApertura
     */
    public Date getFechaApertura() {
        return fechaApertura;
    }

    /**
     * @param fechaApertura the fechaApertura to set
     */
    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    /**
     * @return the titular
     */
    public Cliente getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
               "\n      saldo=" + saldo +
               "\n      limite=" + limite +
               "\n      fechaApertura=" + fechaApertura.toString() +
               "\n      titular=(" + titular.getNombre()+", " +titular.getApellido()+ ")"+
               "\n}" ;
    }
    
    
}
