import java.util.Scanner;
public class LinearEquation {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        System.out.println("Linear A Equation Resolver ");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a :");
        a = scan.nextDouble();
        System.out.println("Enter b :");
        b = scan.nextDouble();
        System.out.println("Enter c :");
        c = scan.nextDouble();
        if( a != 0 ) {
            double d = (c-b)/a;
            System.out.println("X = " +d);
        } else if( b == c) {
            System.out.println("The Solution with all of x");
        } else {
            System.out.println("No Solution");
        }
    }
}