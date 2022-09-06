package rectagletest;

public class Rectangle {
    
    //instance attributes
    private double width;
    private double height;

    //constructor method
    public Rectangle() {
        this.width=20;
        this.height=15;
    }

    //getter and setter from width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //getter and setter from height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    // calculate area method
    public double getArea(){
        
       return this.height * this.width / 2;
       
    }
    
    // calculate perimeter method
    public double getPerimeter(){
        
        return (this.width + this.height) * 2;
        
    }
    
    
}
