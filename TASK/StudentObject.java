
package TASK;
/*  Create array of student ablects atleast 3 size or more , using loops and scanner class give vzlue and print the student abjects using loops

*/
import java.util.Scanner;
public class StudentObject {
    int id;
    String firstName;
    String lastName;
    double fees;

    public StudentObject(int id, String firstName, String lastName, double fees) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fees = fees;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getFees() {
        return fees;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        StudentObject[] students = new StudentObject[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("First Name: ");
            String firstName = sc.next();
            System.out.print("Last Name: ");
            String lastName = sc.next();
            System.out.print("Fees: ");
            double fees = sc.nextDouble();

            students[i] = new StudentObject(id, firstName, lastName, fees);
        }

        System.out.println("\nStudent Details:");
        for (StudentObject student : students) {
            System.out.println("ID = " + student.id + ", Name = " + student.getName() + ", Fees = " + student.getFees());
        }

       
    }
}