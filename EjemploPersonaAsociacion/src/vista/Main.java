package vista;

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
        
        // se crea una persona
        Persona persona = new Persona("123", "Jairo", "Seoanes", "M");
        Fecha fechaNacimiento = new Fecha(12,03,2000);
        Direccion dirDomicilio = new Direccion("Valledupar", "12 A - 25");
        Direccion dirTrabajo = new Direccion("Valledupar", "16 A - 44");
        persona.setFechaNacimiento(fechaNacimiento);
        persona.setDirDomicilio(dirDomicilio);
        persona.setDirTrabajo(dirTrabajo);
        System.out.println(persona);
        
        // se crea una segunda persona
        Fecha fechaNacimiento2 = new Fecha(28,03,2018);
        Direccion dirDomicilio2 = new Direccion("Valledupar", "50 B - 30");
        Direccion dirTrabajo2 = new Direccion("Valledupar", "40 C - 12");
        Persona persona2 = new Persona("456", "Pablo", "Perez", "M", fechaNacimiento2, dirDomicilio2, dirTrabajo2);
        System.out.println(persona2);
        
        // se crea una tercera persona
        Persona persona3 = new Persona("789", 
                                       "Pepito", 
                                       "Lopez", 
                                       "M",
                                       new Fecha(15, 12, 2013),
                                       new Direccion("La paz", "13 - 31"),
                                       new Direccion("San diego", "05 - 37"));
        System.out.println(persona3);
    }
    
}
