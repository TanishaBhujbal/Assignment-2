//Create an Employee class with fields id (private), name (protected), and department (public). Use
//appropriate access modifiers and demonstrate access in another class within the same package and a subclass.

class Employee1 {
    private int id;
    protected String name;
    public String department;
    public Employee1(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
    public int getId() {
        return id;
    }
}
class Manager extends Employee1 {
    public Manager(int id, String name, String department) {
        super(id, name, department);
    }
    public void displayManagerDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Manager Department: " + department);
        System.out.println("Manager ID: " + getId());
    }
}
public class Main2 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1(101, "OM", "Sales");
        System.out.println("Employee Details:");
        emp.displayDetails();
        Manager mgr = new Manager(102, "Vivek", "HR");
        System.out.println("\nManager Details:");
        mgr.displayManagerDetails();
    }
}