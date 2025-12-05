//calculate teh area and teh perimeter of the circle
public class CircleRectangleAverage {
    public static void main(String[] args) {
        double r = 10;
        double a = 3.14 * r * r;
        double p = 2 * 3.14 * r;
        System.out.println("circle : ");
        System.out.println(" the area = " + a + " \n the perimeter : " + p);
        // area of the rectangle
        int l = 10;
        int b = 5;
        System.out.println("\n rectangle :");
        System.out.println(" the area  = " + l * b);

        // avg of 3 marks
        int m1 = 90;
        int m2 = 89;
        int m3 = 67;
        System.out.println(" the avg  = " + (m1 + m2 + m3) / 3);
    }
}
