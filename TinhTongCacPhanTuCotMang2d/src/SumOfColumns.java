import java.util.Scanner;

public class SumOfColumns {
    public static void main(String[] args) {
        int[][] array = {{12,33,4},{87,2,13},{54,6,8}};
        int sum = 0;
        int choose ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a column :");
        choose = scan.nextInt();
        for (int[] ints : array) {
            sum += ints[choose];
        }
        System.out.println("Sum of " +choose+"column :" + sum);
    }
}
