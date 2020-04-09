import java.util.Scanner;

public class CountStudentPassApp {
    public static void main(String[] args) {
        int count = 0;
        int size;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter number of Students :");
            size = scan.nextInt();
            if (size > 30 )
                System.out.println("30 or Over is not accept !");
        } while (size > 30);
        double[] points = new double[size];
        for (int i = 0; i < size ; i++) {
            System.out.println("Enter point of Students :");
            points[i] = scan.nextDouble();
        }
        for (int i = 0; i < size ; i++) {
            if ( points[i] >= 5)
                count +=1 ;
        }
        System.out.println("Number of Students is pass exam : " +count);

    }
}
