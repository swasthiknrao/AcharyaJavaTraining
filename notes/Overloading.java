//calculate the area of circle  square rectagle use methid overloading
import java.util.Scanner;
class AreaCalculator {
 
    public double area(double radius) {
        return 3.14 * radius * radius;
    }

    public double area(int side) {
        return side * side;
    }

    public double area(int length, int width) {
        return length * width;
    }
}
public class Overloading {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + calculator.area(radius));

 
        System.out.print("Enter side of the square: ");
        int side = sc.nextInt();
        System.out.println("Area of Square: " + calculator.area(side));


        System.out.print("Enter length and width of the rectangle: ");
        int length = sc.nextInt();
        int width = sc.nextInt();
        System.out.println("Area of Rectangle: " + calculator.area(length, width));

    }
}