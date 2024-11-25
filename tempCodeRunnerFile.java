class  Employee {
    void salary() {
        System.out.println("Salary= 200000");
    }

}

class Programmer extends Employee  // Sub class
{
    // Programmer class inherits from Employee class with the help of extends
    // keyword
    void bonus() {
        System.out.println("Bonus=50000");
    }
}

class weekfour1 {
    public static void main(String args[]) {
        Programmer p = new Programmer();
        p.salary(); // calls method of super class
        p.bonus(); // calls method of sub class
    }
}