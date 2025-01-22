/*Create a base class Vehicle with a method move(). Create subclasses Car and Bike that override the move()
method with specific implementations. Demonstrate runtime polymorphism by calling the move() method on
different object types.*/

class Vehicle {
    public void move() {
        System.out.println("The vehicle moves");
    }
}
class Car2 extends Vehicle {
    public void move() {
        System.out.println("The car drives on the road.");
    }
}
class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("The bike pedals on the road.");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Vehicle myCar = new Car2();
        Vehicle myBike = new Bike();
        myCar.move();
        myBike.move();
    }
}
