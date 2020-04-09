import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,5,8,13,21,34};
        int j=0;
        int index ;
        int element;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of index:");
        index = scan.nextInt();
        System.out.println("Enter a element :");
        element = scan.nextInt();
        int[] array1 = new int[array.length +1];
        for (int i = 0; i < array1.length ; i++) {
            if ( i == index){
                    array1[i] = element;
            } else {
                array1[i] = array[j];
                j++;
            }
        }
        array = array1;
        System.out.println(Arrays.toString(array));
    }
}
