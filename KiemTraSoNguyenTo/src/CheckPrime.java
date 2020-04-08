import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        x = scan.nextInt();
        if(x == 2){
            System.out.println(x +" is a prime number");
        } else if(x >2){
            for (int i = 2; i <= Math.sqrt(x) ; i++) {
                    if(x%i == 0){
                        System.out.println("It is not prime number");
                        break;
                    } else {
                        System.out.println(x +" is a prime number");
                    }
            }
        }
    }

}
