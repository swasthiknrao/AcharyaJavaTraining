package lab;

public class Employee {
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Is Permanent: " + isPermanent);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        
        emp.id = 1001;
        emp.name = "Amit Kumar";
        emp.isPermanent = true;
        emp.age = (int) 35.5;
        
        emp.displayDetails();
        System.out.println("Successfully started");
    }
}

