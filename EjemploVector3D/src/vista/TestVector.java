package vista;

import modelo.Vector3D;

/**
 *
 * @author Jairo F
 */
public class TestVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector3D vo = new Vector3D();
        System.out.println("V0="+vo.getVector());
        
        System.out.println("------------------------------");
        Vector3D v = new Vector3D(1,2,3);
        System.out.println("V="+vo.getVector());
        
        Vector3D suma = v.sumVector(new Vector3D(4,6,3));
        System.out.println("suma vector="+suma.getVector());
        
        Vector3D multi = v.scalarMultiplication(5);
        System.out.println("multi scalar="+multi.getVector());
        
        System.out.println("Modulo: " + v.moduleVector());
    }
    
}
