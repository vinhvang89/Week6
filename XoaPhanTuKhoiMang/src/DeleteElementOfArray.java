import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementOfArray {
    public static void main(String[] args) {
            int[] array = {1,34,2,6,7,8,89,55};
            int[] array1 = new int[7];
            Scanner scan = new Scanner(System.in);
            int a;
            System.out.println("Enter element which you want to delete :");
            a = scan.nextInt();
            int j = 0;
            for (int i = 0; i < array.length ; i++) {
                if ( array[i] != a){
                 array1[j] = array[i];
                j++;
                }

            }
            array = array1;

        System.out.println(Arrays.toString(array));
    }
}
