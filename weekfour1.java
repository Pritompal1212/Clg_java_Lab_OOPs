public class weekfour1 {
    // Display method without parameter
    public void display() {
        System.out.println("No parameters");
    }

    // Display method with one integer parameter
    public void display(int num) {
        System.out.println("Integer argument: " + num);
    }

    // Display method with one string parameter
    public void display(String str) {
        System.out.println("String argument: " + str);
    }

    public static void main(String[] args) {
        weekfour1 obj = new weekfour1();
        obj.display(); // invokes display method without parameter
        obj.display(10); // invokes display method with integer parameter
        obj.display("Hello"); // invokes display method with string parameter
    }

}
