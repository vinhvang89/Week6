package AccessModifier;

import java.text.DecimalFormat;

public class TestModifier {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        DecimalFormat df = new DecimalFormat("0.00");
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();
        System.out.println(df.format(area));
        System.out.println(df.format(perimeter));

    }
}
