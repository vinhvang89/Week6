import java.util.Scanner;

public class GreatestCommon {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        a =scan.nextInt();
        System.out.println("Enter b :");
        b = scan.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if ( a == 0|| b == 0)
            System.out.println("There is no greatest common ");
        while (a!=b){
            if ( a > b )
                a = a - b;
            else
                b = b - a ;
        }
        System.out.println("The greatest common of factor :" +a);
    }

}
