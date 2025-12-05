package TASK;
import java.util.Scanner;

public class Compare {
    public static void compare(int a[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++)
                if (a[i] == a[j]) {
                    count++;
                }

        }

        System.out.println(" there are : " + count + " commen elements");
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

        compare(a);

    }
}

