package asociacionunovarios;

import java.util.ArrayList;
import modelo.Estudiante;
import modelo.Universidad;

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
        ArrayList<Estudiante> lista = new ArrayList();
        Estudiante a = new Estudiante("Pepe", 20, "Ing Sistemas");
        lista.add(a);
        Estudiante b = new Estudiante("Jose", 30, "Ing Ambiental");
        lista.add(b);
        Estudiante c = new Estudiante("Paco", 50, "Ing Electronica");
        lista.add(c);
        
        Universidad upc = new Universidad("Unicesar", "Valledupar");
        upc.setEstudiantesInscritos(lista);
        
        System.out.println(upc);
        System.out.println("----------------");
        
        Universidad udes = new Universidad("Udes Vpar", "Valledupar",lista);
        System.out.println(udes);
    }
    
}
