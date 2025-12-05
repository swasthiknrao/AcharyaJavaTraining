package TASK;
//The number 6 is a truly  grat number , GIven twi int valiues , a anf b  return true if either one is 6 . Or if their sum or difference is 6 or ther is differene in 6  , other wise  return  false

import java.util.Scanner;

public class No6IsGreat {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(isGreat(a, b));
    }

    public static boolean isGreat(int a, int b) {
        if (a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6) {
            return true;
        } else {
            return false;
        }
    }

}
