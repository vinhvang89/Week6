import java.util.Scanner;

public class FindAValueInArray {
    public static void main(String[] args) {
        String[] myList = {"Falcon","Kitten","Rat","Pig","Human","Bee","Dog","Idiot"};
        Scanner scan = new Scanner(System.in);
        String finding;
        System.out.println("Enter a kind of animals that u wanna to eat :");
        finding = scan.nextLine();
        boolean flag = false;
        for (String element:myList){
            if(element.equals(finding)) {
                flag = true;
            }
        }
        if (flag)
            System.out.println("We have your choose in myList");
        else
            System.out.println("Can not found !");

    }
}
