package SignimusTechnologyTask;

abstract class shape{

    public abstract double calculateArea();
}

class Circle extends shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends shape{
     
    private double width;
    private double height;

    public Rectangle(double width , double height){
        this.width=width;
        this.height=height;
    }

    public double calculateArea(){
        return width * height;
    }
    
}

public class   AbstractClass {
     
    public static void main(String[]args){
         shape circle = new Circle(5);
         shape rectangle = new Rectangle(4 , 6);

         System.out.println("Area of Circle :"+ circle.calculateArea());
         System.out.println("Area of Rectangle :"+ rectangle.calculateArea());
    }

}

