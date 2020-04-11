package HeDoiTuongHinhHoc;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(15);
        Circle circle2 = new Circle(20,"Red",false);
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        Rectangle rectangle1 = new Rectangle(10,20,"Purple",true);
        System.out.println(rectangle1.toString());
        Square square1 = new Square(30,"Black",false);
        System.out.println(square1.getArea());

    }
}
