

import java.util.Iterator;
import java.util.Scanner;

public class DEC3 {

    // write a prog to search a given number if it is present in the array or not

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

    public static void divisible3(int a[]) {
        int count = 0;

        for (int c : a) {
            if (c % 3 == 0) {
                count++;

            }
        }

        System.out.println(" there are : " + count + "  elements in  the array  which can be devisible by  3");
    }

    public static void divisible5(int a[]) {
        int count = 0;

        for (int c : a) {
            if (c % 5 == 0) {
                count++;

            }
        }

        System.out.println(" there are : " + count + "  elements in  the array  which can be devisible by  5");
    }

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

    public static void bubble(int a[]) {
        int temp;

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - 1 - i; j++) {

                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void sum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("sum :" + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "MENU\n 1.search \n 2. divisible by 5 \n 3.divisible by 3 \n 4. bubble sort  \n 5.compare between 2  \n 6 .sum \n enter your choice :");

        System.out.println("Enter the size of an array :");
        int ch = sc.nextInt();

        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();

        System.out.println("Enter the array element:");
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }

        switch (ch) {
            case 1:
                search(a);

                break;
            case 2:

                divisible5(a);
                break;

            case 3:

                divisible3(a);
                break;

            case 4:

                bubble(a);
                break;

            case 5:

                compare(a);
                break;

            case 6:
                sum(a);
                break;
            default:

                System.out.println("invalid");

                break;

        }

    }

}
