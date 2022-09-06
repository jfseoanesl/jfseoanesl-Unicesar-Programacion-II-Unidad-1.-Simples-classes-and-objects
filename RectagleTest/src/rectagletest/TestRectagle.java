package rectagletest;

public class TestRectagle {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangle r = new Rectangle();
        rectangleInfo(r);
    }
    
    public static void rectangleInfo(Rectangle rect){
       
        System.out.println("Rectagle info: ");
        System.out.printf("Width: %.2f%n", rect.getWidth());
        System.out.printf("Height: %.2f%n", rect.getHeight());
        System.out.printf("Area: %.2f%n", rect.getArea());
        System.out.printf("Perimeter: %.2f%n", rect.getPerimeter());
        
    }
    
}
