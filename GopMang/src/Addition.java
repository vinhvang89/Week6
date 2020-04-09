import java.util.Arrays;

public class Addition {
    public static void main(String[] args) {
        int[] array1 = {3,8,2,4,6,8};
        int[] array2 = {8,7,12};
        int j = 0;
        int[] array = new int[array1.length+array2.length];
        for (int i = 0; i < array.length ; i++) {
            if ( i < array1.length)
                array[i] = array1[i];
            else {
                array[i] = array2[j];
                j++;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
