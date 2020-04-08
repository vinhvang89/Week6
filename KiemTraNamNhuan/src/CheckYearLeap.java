import java.util.Scanner;
public class CheckYearLeap {
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year :");
        x = scan.nextInt();
        if(x >=0) {
            if (x % 400 == 0) {
                System.out.println("It is leap year");
            } else if(x%4==0 && x%100!=0) {
                System.out.println("It is leap year");
            }else {
                System.out.println("It is not leap year");
            }
        } else {
            System.out.println("Pls enter other year ");
        }
    }
}
