package SignimusTechnologyTask;

class Car{
    String brand;
    String color;
    int speed;
    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.speed = 0;
    }
    
    public void star(){
        System.out.println(brand+"Car has started.");
    }

    public void stop(){
        speed =0;
        System.out.println(brand +"car has stopped.");
    }

    public void accelerate(int increment){
        speed += increment;  //speed = speed + increment;
        System.out.println(brand +"car is now running at "+speed + "km/h.");

    }

    public void displayDetails(){
        System.out.println("Car Details : Brand =" + brand + ", Color = " + color + ", Speed ="+ speed +"km/h .");
    }
}

public class CarDriving{
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Red");
        Car car2 = new Car("BMW", "Black");

        System.out.println("WELCOME , Let's Drive ....");


        car1.displayDetails();
        car1.star();
        car1.accelerate(50);
        car1.accelerate(30);
        car1.stop();
        System.out.println();
 
        // Calling methods on car2
        car2.displayDetails();
        car2.star();
        car2.accelerate(80);
        car2.stop();
       
        
    } 
}