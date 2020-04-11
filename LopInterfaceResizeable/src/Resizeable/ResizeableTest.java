package Resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(20,30);
        Triangle triangle1 = new Triangle(20,30,25);
        Square square1 = new Square(30);
        rectangle1.resize(0.5);
        triangle1.resize(1);
        square1.resize(2);
        System.out.println(rectangle1.toString());
        System.out.println(triangle1.toString());
        System.out.println(square1.toString());
    }
}
