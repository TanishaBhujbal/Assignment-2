//Create a Car class with fields brand, model, and price. Use the this keyword in the constructor to
//differentiate between instance variables and parameters with the same name.

public class Car {
    String brand;
    String model;
    double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Corolla", 300000.0);
        myCar.displayDetails();
    }
}
