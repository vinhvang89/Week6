import java.util.Scanner;

public class CountSymbolInAString {
    public static void main(String[] args) {
        String string = "shoitwrhhwighwigvcjc";
        char a ;
        int count=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any char to check :");
        a = scan.next().charAt(0);
        for (int i = 0; i < string.length() ; i++) {
            if ( string.charAt(i) == a){
                count++;
            }
        }
        System.out.println("there are "+count+" "+a+" in that string");

    }
}
