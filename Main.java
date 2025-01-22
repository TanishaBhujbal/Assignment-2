/*Create a Student class with fields like id, name, and marks. Add methods to display details and calculate
grades based on marks. Write a program to create multiple student objects and display their details and
grades.*/

class Student {
    int id;
    String name;
    double marks;
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("--------------------------");
    }
}
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice", 95.5);
        Student student2 = new Student(2, "Bob", 82.0);
        Student student3 = new Student(3, "Charlie", 68.0);
        Student student4 = new Student(4, "Diana", 55.0);
        System.out.println("Student Details:");
        System.out.println("--------------------------");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
    }
}