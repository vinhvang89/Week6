public class FindMinInArray {
    public static void main(String[] args) {
        int[] array = {2,5,6,89,1,33,7,1,55};
        System.out.println(findMin(array));

    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int element:arr){
            if ( element < min )
                min = element;
        }
        return min;
    }
}
