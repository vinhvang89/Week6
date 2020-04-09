import java.util.Scanner;

public class RunQuadraticEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = scan.nextDouble();
        System.out.println("Enter b :");
        double b = scan.nextDouble();
        System.out.println("Enter c :");
        double c = scan.nextDouble();
        QuadraticEquation VKL = new QuadraticEquation(a,b,c);
        System.out.println(VKL.checkRoot());
        if (VKL.checkRoot().equals("The equation has a root"))
            System.out.println("Root :" +VKL.getRoot1());
        else if(VKL.checkRoot().equals("The equation has 2 roots"))
            System.out.println("Root 1 : " +VKL.getRoot1()+" Root 2 : " + VKL.getRoot2() );
    }
}
