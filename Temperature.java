//Create a Temperature class with a static method to convert temperature between Celsius and Fahrenheit.
//Write a program to demonstrate its usage.

public class Temperature {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        double celsius = 28.0;
        double fahrenheit = Temperature.celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        fahrenheit = 75.0;
        celsius = Temperature.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
    }
}