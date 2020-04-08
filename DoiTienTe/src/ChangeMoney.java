import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double x;
        double rate = 23000d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào số USD :");
        x = scan.nextDouble();
        System.out.println("Số VND đổi được là :" +x*rate);
    }
}
