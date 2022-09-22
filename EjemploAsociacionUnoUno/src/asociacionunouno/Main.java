package asociacionunouno;

import java.util.Date;
import modelo.*;

/**
 *
 * @author Jairo F
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuenta = new Cuenta(0, 0, new Date());
        Cliente cliente = new Cliente("Jairo", "Seoanes", "123");
        cliente.setCuentaRegistrada(cuenta);
        System.out.println("---------------------------");
        cuenta.setTitular(cliente);
        
        System.out.println(cliente);
        System.out.println(cuenta);
        System.out.println("---------------------------");
        
    
        Cuenta c2 = new Cuenta(0,0, new Date());
        Cliente cli = new Cliente("Pable", "Perez", "abc",c2);
        System.out.println(cli);
        System.out.println("---------------------------");
        
    }
    
}
