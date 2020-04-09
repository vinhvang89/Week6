public class SumOfCrossOfMatrix {
    public static void main(String[] args) {
        int[][] array = {{67,23,4,5,},
                         {2,65,3,98},
                         {12,8,64,23},
                         {9,56,18,34}};
        int sumOfCross = 0 ;
        for (int i =0 ; i < array.length;i++){
            for(int j =0;j< array.length;j++){
                if ( i == j || i + j == array.length -1)
                    sumOfCross += array[i][j];
            }
        }
        System.out.println("Total of all crosses :" + sumOfCross);
    }
}
