package TASK;
// GIven  a array  of ints return if  ...1,2,3,... appears  in th array elements
public class ArrayUsingLoop {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        boolean found = false;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
    
}
