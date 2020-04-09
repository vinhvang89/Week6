
import java.util.Arrays;

public class MineSweeper {
    public static void main(String[] args) {
        int[][] map = { {0,0,0,0,0},
                        {0,0,33,0,0},
                        {0,33,0,0,0},
                        {0,0,0,33,0},
                        {0,0,0,0,0}};

//        Set up so quanh bomb
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0;j<5;j++){
                if(map[i][j] == 33){
                   if(map[i+1][j] != 33) map[i+1][j] +=1;
                   if(map[i-1][j] != 33) map[i-1][j] +=1;
                   if(map[i+1][j+1] !=33) map[i+1][j+1] +=1;
                   if(map[i-1][j-1] != 33) map[i-1][j-1] +=1;
                   if(map[i][j+1] !=33) map[i][j+1] +=1;
                   if(map[i][j-1] !=33) map[i][j-1] +=1;
                   if(map[i-1][j+1] !=33) map[i-1][j+1] +=1;
                   if (map[i+1][j-1] != 33) map[i+1][j-1] +=1;
                }
            }
        }

        System.out.println(Arrays.toString(map[0]));
        System.out.println(Arrays.toString(map[1]));
        System.out.println(Arrays.toString(map[2]));
        System.out.println(Arrays.toString(map[3]));
        System.out.println(Arrays.toString(map[4]));
    }

}
