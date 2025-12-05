package TASK;

import java.util.Scanner;

// //sum of a digits of a numnet 
class SumOfDigits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		while (number > 0) {
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}
		System.out.println("Sum of digits: " + sum);
	}
}
