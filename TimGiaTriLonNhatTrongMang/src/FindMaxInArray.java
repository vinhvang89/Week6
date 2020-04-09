public class FindMaxInArray {
    public static void main(String[] args) {
        int[] array = {2,5,1001,12,99,3,500,501,23,4,999,32};
        int max  = array[0];
        int i = 0;
        int position= 0;
        for(int element:array){
            if ( element > max){
                max = element;
                position = i;
            }
            i++;
        }
        System.out.println("Greatest number in array is : " +max +" at " +position);
    }
}
