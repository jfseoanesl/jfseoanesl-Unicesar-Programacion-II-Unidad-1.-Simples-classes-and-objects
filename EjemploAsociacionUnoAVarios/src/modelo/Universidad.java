package modelo;

import java.util.ArrayList;

/**
 *
 * @author Jairo F
 */
public class Universidad {
    private String nombre;
    private String ciudad;
    
    private ArrayList<Estudiante> estudiantesInscritos;

    public Universidad(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estudiantesInscritos = new ArrayList();
    }

    public Universidad(String nombre, String ciudad, ArrayList<Estudiante> estudiantesInscritos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estudiantesInscritos = estudiantesInscritos;
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
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the estudiantesInscritos
     */
    public ArrayList<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    /**
     * @param estudiantesInscritos the estudiantesInscritos to set
     */
    public void setEstudiantesInscritos(ArrayList<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    @Override
    public String toString() {
        
        String infoEstudiantes = "";
        for(Estudiante e: this.estudiantesInscritos){
            infoEstudiantes = infoEstudiantes +"\t\t"+ e.toString()+"\n";
        }
        
        return "Universidad{" +
               "\n             nombre=" + nombre + 
               "\n             ciudad=" + ciudad +
               "\n             estudiantes-Inscritos:" + 
               "\n             ------------------------------"+
               "\n"+infoEstudiantes + 
               "             ------------------------------"+
               "\n}";
    }
    
    
    
}
