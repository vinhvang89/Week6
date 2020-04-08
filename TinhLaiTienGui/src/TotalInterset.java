import java.util.Scanner;

public class TotalInterset {
    public static void main(String[] args) {
        double rate;
        int months ;
        double moneys;
        double total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your moneys :");
        moneys = scan.nextDouble();
        System.out.println("Enter your months :");
        months = scan.nextInt();
       if ( months < 4){
           rate = 0.04;
       } else if( months < 6){
           rate = 0.05;
       } else  if ( months < 9){
           rate = 0.06;
       } else  {
           rate = 0.07;
       }
        for (int i = 0; i <months ; i++) {
            total += moneys*rate/12;
        }
        System.out.println("Total of money :" +(moneys+total));
    }
}
