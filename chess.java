
import java.util.Scanner;

public class chess {
    public static void main(String args[]) {
        System.out.println("Enter the position of the knght : ");

        Scanner sc = new Scanner(System.in);
        int knightRow = sc.nextInt();
        int knightCol = sc.nextInt();

        if (knightRow >= 1 || knightRow <= 8 || knightCol >= 1 || knightCol <= 8) {
            int[][] moves = {
                    { 2, 1 }, { 1, 2 }, { -1, 2 }, { -2, 1 },
                    { -2, -1 }, { -1, -2 }, { 1, -2 }, { 2, -1 }
            };

            int count = 0;

            for (int[] move : moves) {
                int newRow = knightRow + move[0];
                int newCol = knightCol + move[1];

                if (newRow >= 1 && newRow <= 8 && newCol >= 1 && newCol <= 8) {
                    count++;
                }
            }

            System.out.println("The knight can make " + count + " valid moves.");
        } else {
            System.out.println("Enter the valid position");
        }
    }
}
