public class ShowPrimeUnder100 {
    public static void main(String[] args) {
        int num = 100;
        while (num >= 2) {
            if (isPrime(num))
                System.out.println(num);
            num --;
        }
    }
    public static boolean isPrime(int x){
        if(x < 2)
            return false;
        if(x== 2)
            return true;
        else {
            for (int i = 2 ; i<= Math.sqrt(x) ;i++){
                if(x%i == 0)
                    return false;
            }
        }return true;
    }
}
