package TASK;
import java.util.Scanner;

public class Divisible5 {
    public static void divisible5(int a[]) {
        int count = 0;

        for (int c : a) {
            if (c % 5 == 0) {
                count++;

            }
        }

        System.out.println(" there are : " + count + "  elements in  the array  which can be devisible by  5");
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

        divisible5(a);

    }
}

