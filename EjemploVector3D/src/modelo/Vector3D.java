package modelo;

/**
 *
 * @author Jairo F
 */
public class Vector3D {
    
    private double x;
    private double y;
    private double z;
    
    
    public Vector3D(){
        this.x=0;
        this.y=0;
        this.z=0;
        //this(0,0,0);
    }
    
    public Vector3D(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

 
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    
    public String getVector(){
        return "("+this.x+","+this.y+","+this.z+")";
    }
   
    public Vector3D sumVector(Vector3D v){
        
        Vector3D resultado = this.sumVector(v.getX(), v.getY(), v.getZ());
        return resultado;
    }
    
    public Vector3D sumVector(double x, double y, double z){
        double sumX = this.x + x;
        double sumY = this.y + y;
        double sumZ = this.z + z;
        
        Vector3D resultado = new Vector3D(sumX, sumY, sumZ);
        return resultado;
    }
    
    public Vector3D scalarMultiplication(double n){
        double multX = this.x * n;
        double multY = this.y * n;
        double multZ = this.z * n;
       
        Vector3D resultado = new Vector3D(this.x * n, multY, multZ);
        return resultado;
        
    }
    
    public double moduleVector(){
        double xx = Math.pow(this.x, 2);
        double yy = Math.pow(this.y, 2);
        double zz = Math.pow(this.z, 2);
        
        double sumxxyyzz = xx + yy + zz;
        return Math.sqrt(sumxxyyzz);
        
    }
    
}
