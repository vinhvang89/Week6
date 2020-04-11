package ComparatorCircle;

import javafx.scene.shape.Circle;

import java.util.Arrays;

public class ComparatorCircle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5);
        System.out.println("Before sorted");
        for (Circle circle:circles){
            System.out.println(circle);
        }
        CompareCircle compareCircle = new CompareCircle();
        Arrays.sort(circles,compareCircle);
        System.out.println("After sorted");
        for (Circle circle:circles){
            System.out.println(circle);
        }
    }
}
