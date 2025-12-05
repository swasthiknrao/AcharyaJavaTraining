package TASK;

//GIven an aarray of integers , print true if  6  appears  as either the  first or last element in the array . The array will be length 1 or more check for the length  usng condition
public class ArrayWithOutLoops {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        if (arr.length < 1) {
            System.out.println("Array length should be at least 1");
            return;
        } else {
            if (arr[0] == 6 || arr[arr.length - 1] == 6) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
}
