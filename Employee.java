//Create an Employee class with fields id, name, and salary. Use a parameterized constructor to initialize the
//fields and display the employee details.
public class Employee {
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee(int id, String Yashraj, String sales) {
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee employee = new Employee(217019, "Soham", 50000.0);
        employee.displayDetails();
    }
}