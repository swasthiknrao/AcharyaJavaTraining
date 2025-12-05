package TASK;
//find the absoulte value of a number

import java.util.Scanner;

public class Neg {
    public static void main(String args[]) {
        System.out.println("Enter a negative number to convert it into positive:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            n = n * (-1);
        }
        System.out.println(n);
    }
}
