package TriangleClass;

public class Test {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3,8,6,"Blue",false);
        System.out.println(triangle1.checkTriangle());
        System.out.println(triangle1.getHeight());
        System.out.println(triangle1.getArea());
    }
}
