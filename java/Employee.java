/**
 * Employee
 */
public class Employee {

    private String name;
    double salary;
    static int counter;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Employee ob = new Employee("Aman", 2305.7);
        ob.toString();
    }
}