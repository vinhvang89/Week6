import java.util.Scanner;

public class UnitsOfPrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number;
        int N = 2 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Prime :");
        number = scan.nextInt();
        while (count <= number) {
            if (isPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
    public static boolean isPrime(int n){
        if(n < 2)
            return false;
        if( n == 2)
            return true;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }return true;
    }
}
