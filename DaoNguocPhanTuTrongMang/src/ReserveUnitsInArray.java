import java.lang.reflect.Array;
import java.util.Scanner;

public class ReserveUnitsInArray {
    public static void main(String[] args) {
            int size ;
            int[] array;
            Scanner scan = new Scanner(System.in);
            do {
                System.out.println("Enter a size :");
                size = scan.nextInt();
                if ( size > 20 )
                    System.out.println("20 and over are not exceed ");
            } while (size > 20);
             array = new int[size];
            int i = 0;
            while (i < size){
                System.out.println("Enter a element :");
                array[i] = scan.nextInt();
                i++;
            }
            for (int j = array.length-1;j>0;j--){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
            for (int element: array){
                System.out.println(element);
            }

    }
}