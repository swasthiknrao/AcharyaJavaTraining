//calculate the area of circle  square rectagle use methid overloading
import java.util.Scanner;
class AreaCalculator {
    // Method to calculate area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a square
    public double area(int side) {
        return side * side;
    }

    // Method to calculate area of a rectangle
    public double area(int length, int width) {
        return length * width;
    }
}
public class Overload {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        Scanner sc = new Scanner(System.in);

        // Calculate area of circle
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + calculator.area(radius));

        // Calculate area of square
        System.out.print("Enter side of the square: ");
        int side = sc.nextInt();
        System.out.println("Area of Square: " + calculator.area(side));

        // Calculate area of rectangle
        System.out.print("Enter length and width of the rectangle: ");
        int length = sc.nextInt();
        int width = sc.nextInt();
        System.out.println("Area of Rectangle: " + calculator.area(length, width));

    }
}