package testcoche;

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
        Coche c1 = new Coche();
        System.out.println(c1.mostrarInfo());
        System.out.println("-----------------------------");
        
        Coche c2 = new Coche();
        c2.setMarca("Ford");
        System.out.println(c2.mostrarInfo());
        
    }
    
}
