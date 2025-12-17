package lab;

public class Student {
    private String studentName;
    private String collegeName;
    private int studentId;

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public void setCollegeName(String college) {
        this.collegeName = college;
    }

    public void setStudentId(int id) {
        this.studentId = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + collegeName);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(101);
        s1.setStudentName("Rahul Sharma");
        s1.setCollegeName("Anudip Foundation");
        s1.displayDetails();
        System.out.println("Successful");
    }
}

