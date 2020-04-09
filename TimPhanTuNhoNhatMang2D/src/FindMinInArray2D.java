public class FindMinInArray2D {
    public static void main(String[] args) {
        int[][] array = {{56,2,4,5},{34,2,4,8},{2,99,45,3},{1,87,3,44}};
        int min = array[0][0];
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                if (ints[j] < min)
                    min = ints[j];
            }
        }
        System.out.println("Smallest element in Array is :" +min);

    }
}
