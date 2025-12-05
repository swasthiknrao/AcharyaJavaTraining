package TASK;
import java.util.Scanner;

// write a prog to search a given number if it is present in the array or not
public class Search {
    public static void search(int a[]) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        System.out.println("Enter the searching element :");
        int s = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (s == a[i]) {
                found = true;
            }

        }

        if (found) {
            System.out.println("found ");
        } else {
            System.out.println("not found");
        }

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

        search(a);

    }
}
