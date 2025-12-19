package com.anudip.learning;

public class Person {
    String name = "Priya Singh";
    int age = 28;
    int salary = 45000;

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.displayDetails();
        System.out.println("Test Successful");
    }
}


