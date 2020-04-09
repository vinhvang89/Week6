public class FindMaxIn2DArray {
    public static void main(String[] args) {
        int[][] array = {{1,3,4},{9,15,2},{18,9,3}};
        int max = array[0][0];
        for (int i =0 ; i < 3;i++){
            for (int j = 0 ;j<3;j++){
                if(array[i][j] > max)
                    max = array[i][j];
            }
        }
        System.out.println("Greatest number in Array :" +max);



    }
}
