//Create a Resource class with a finalize() method to display a message when an object is garbage collected.
//Write a program to demonstrate garbage collection.

public class Resource {
    public Resource() {
        System.out.println("Resource object created.");
    }
    public void finalize() throws Throwable {
        System.out.println("Resource object is being garbage collected.");
        super.finalize();
    }
    public static void main(String[] args) {
        Resource res1 = new Resource();
        res1 = null;
        System.gc();
        Resource res2 = new Resource();
        res2 = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("End of program.");
    }
}
