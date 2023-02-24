import java.util.Scanner;
// Make a shape class with color attribute and blank getArea() method
class Shape {
    String color;
    public void getArea() {
    }
    // Make a constructor for this shape class
    public Shape(){
        this.color = "Blue";
    }
}

// Make a rectangle class which inherits from the Shape class
class Rectangle extends Shape{
    // Add width and height attributes
    int width;
    int height;
    // Override the getArea() method to calculate the area of a rectangle with the actual formula
    @Override
    public void getArea() {
        int area = width * height;
        System.out.println("Area of the rectangle is " + area + ".");
    }

    // Make a constructor for this rectangle class
    public Rectangle (int width, int height){
        this.width = width;
        this.height = height;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the width: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        System.out.println("Enter the height: ");
        int y = scan.nextInt();

        Rectangle rectangle = new Rectangle(x, y);
        System.out.println("Color : " + rectangle.color);
        rectangle.getArea();
    }
}