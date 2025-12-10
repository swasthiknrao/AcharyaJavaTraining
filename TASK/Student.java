/*
Create a Student class, with the following instance variables:

id: int
first name: String
last name: String
fees: double

and the following methods

instance methods:

getName() -> returns the firstname and lastname combined
getFees() -> returns the fees 

Create three objects of the Student and print the values.

Use parameterized constructor for printing different values.

I am attaching the Employee program discussed in the class for your reference.
 */

package TASK;
public class Student {
    int id;
    String firstName;
    String lastName;
    double fees;


    public Student(int id, String firstName, String lastName, double fees) {
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

        Student student1 = new Student(1, "darshan", "boss", 150000.50);
        Student student2 = new Student(2, "pawan", "kumar", 200000.75);
        Student student3 = new Student(3, "arman", "Mansoori", 180000.00);


        System.out.println("Student 1: ID = " + student1.id + ", Name = " + student1.getName() + ", Fees = " + student1.getFees());
        System.out.println("Student 2: ID = " + student2.id + ", Name = " + student2.getName() + ", Fees = " + student2.getFees());
        System.out.println("Student 3: ID = " + student3.id + ", Name = " + student3.getName() + ", Fees = " + student3.getFees());
    }
}