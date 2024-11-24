public class weekthree3 {
    int id;
    String name;

    // Constructor with no arguments
    public weekthree3() {
        id = 10;
        name = "Svcet";
        System.out.println("Default constructor called");
    }

    // Constructor with arguments
    public weekthree3(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parameterized constructor called");
    }

    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        weekthree3 obj1 = new weekthree3();
        obj1.display();

        weekthree3 obj2 = new weekthree3(20, "Svcet-Chittoor");
        obj2.display();
    }

}
