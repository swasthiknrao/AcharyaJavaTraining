// write a prog to display  teh price of a pizza  based on teh size  orderd using swich statment 
//small size 125 
//mediium size 250
// large size 300
// veryarge size 350

import java.util.Scanner;

public class PizzaPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pizza (small, medium, large, verylarge): ");
        String size = sc.nextLine().toLowerCase();
        int price;
        switch (size) {
            case "small":
                price = 125;
                break;
            case "medium":
                price = 250;
                break;
            case "large":
                price = 300;
                break;
            case "verylarge":
                price = 350;
                break;
            default:
                System.out.println("Invalid size entered.");
                return;
        }
        System.out.println("The price of the " + size + " pizza is: Rs " + price);
    }
}