package TASK;
//The number 6 is a truly  grat number , GIven twi int valiues , a anf b  return true if either one is 6 . Or if their sum or difference is 6 or ther is differene in 6  , other wise  return  false

import java.util.Scanner;

public class No6IsGreat {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(isGreat(num1, num2));
    }

    public static boolean isGreat(int num1, int num2) {
        if (num1 == 6 || num2 == 6 || (num1 + num2) == 6 || Math.abs(num1 - num2) == 6) {
            return true;
        } else {
            return false;
        }
    }

}
