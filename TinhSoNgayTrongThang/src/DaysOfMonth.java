import java.util.Scanner;
public class DaysOfMonth {
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Which the month would you like to count day : ");
        x = scan.nextInt();
        switch (x){
            case 2:{
                System.out.println("It has 28 or 29 days");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11:{
                System.out.println("It has 30 days");
                break;
            }
            default:{
                System.out.println("It has 31 days");
            }
        }
    }
}
