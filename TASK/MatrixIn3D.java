package TASK;
/*
Take a two dimensional array of size 3X3. Insert the values into the 
array using the scanner class. Insert different numbers. Now check how many numbers are between 1 to 50, 50 to 100 and above 100. Using conditional statement for achieving the output.

Example:

81   23   340

22   5    3

2    73   105

Expected output:

In the above array there are 5 number  between 1 to 50
In the above array there are 2 number  between 50 to 100
In the above array there are 2 number  above 100

Take your own ramdom values into the array and check. 
in java


*/

class matrixIn3D {
public static void main(String args[]) {
    int arr[][] = new int[3][3];
    java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.println("Enter 9 numbers to fill the 3x3 matrix:");

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            arr[i][j] = sc.nextInt();
        }
    }

    int count1to50 = 0;
    int count51to100 = 0;
    int countAbove100 = 0;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (arr[i][j] >= 1 && arr[i][j] <= 50) {
                count1to50++;
            } else if (arr[i][j] > 50 && arr[i][j] <= 100) {
                count51to100++;
            } else if (arr[i][j] > 100) {
                countAbove100++;
            }
        }
    }

    System.out.println("In the above array there are " + count1to50 + " numbers between 1 to 50");
    System.out.println("In the above array there are " + count51to100 + " numbers between 51 to 100");
    System.out.println("In the above array there are " + countAbove100 + " numbers above 100");
    
}
}
