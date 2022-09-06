package safebox;

/**
 *
 * @author Jairo F
 */
public class SafeBox {
    private static int MAX_ATTEMPTS=3;
    private int securityCode;
    private int attempts;
    private boolean isLocked;
    
    // constructor method
    

    // getters and Setters
    public static int getMAX_ATTEMPTS() {
        return MAX_ATTEMPTS;
    }

    public static void setMAX_ATTEMPTS(int aMAX_ATTEMPTS) {
        MAX_ATTEMPTS = aMAX_ATTEMPTS;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public boolean isIsLocked() {
        return isLocked;
    }

    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }
    
    //
    public String openBox(int code){
       String msg=null;
       
       // intrucciones requeridas para abrir la caja. 
       // si el codigo es correcto retorna un mensaje "Codigo correcto, la caja ha sido abierta"
       // si el codigo es incorrecto retorna un mensaje "Codigo errado, caja cerrada"
       // si se supera el limite de intentos, retorna un mensaje "Caja bloqueada"
       // Si la caja esta bloequeada bloqueada, retorna el mensaje "No es posible verificar codigo, caja bloqueada"
       
       return msg;
    }
    
}
