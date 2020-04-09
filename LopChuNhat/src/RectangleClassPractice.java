import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class RectangleClassPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Width :");
        double width = scan.nextDouble();
        System.out.println("Enter Height :");
        double height = scan.nextDouble();
        Rectangle Fuck = new Rectangle(width,height);
        System.out.println("Your Rectangle : " + Fuck.show());
        System.out.println("Your Rectangle area is : " + Fuck.getArea());
        System.out.println("Your Rectangle Perimeter is : " + Fuck.getPerimeter());

    }
}
