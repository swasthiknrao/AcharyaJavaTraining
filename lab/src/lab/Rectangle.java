package lab;

public class Rectangle {
    double width;
    double height;

    enum Color {
        RED,
        GREEN,
        BLUE
    }

    Color boxColor;

    public double calculateArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.width = 10.5;
        rect.height = 5.0;
        rect.boxColor = Color.BLUE;
        System.out.println("Width: " + rect.width);
        System.out.println("Height: " + rect.height);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Box Color: " + Color.BLUE);
    }
}


