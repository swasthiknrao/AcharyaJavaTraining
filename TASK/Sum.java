package TASK;
import java.util.Scanner;

public class Sum {
    public static void sum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("sum :" + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();

        System.out.println("Enter the array element:");
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }

        sum(a);

    }
}

