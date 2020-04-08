import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        String name ;
        String greeting = "Hello";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name :");
        name = scan.nextLine();
        System.out.println(greeting+" "+name);
    }
}
