import java.util.Scanner;

public class DrawShapes {
    public static void main(String[] args) {
        int choose;
        System.out.println("Menu");
        System.out.println("1 . Happy face");
        System.out.println("2 . Fuck you");
        System.out.println("3 . Big nose");
        System.out.println("4 . Saboteur");
        System.out.println("5 . Rubbit");
        System.out.println("0 . Exit");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choose :");
        choose = scan.nextInt();
        switch (choose){
            case 1 :{
                System.out.println("(─‿‿─) ");
                break;
            }
            case 2 : {
                System.out.println("凸(¬‿¬)凸 ");
                break;
            }
            case 3 :{
                System.out.println("‹(•¿•)› ");
                break;
            }
            case 4 :{
                System.out.println("̿’ ̿’(•̪●)=ε/̵͇̿̿/’̿’̿ ̿ ");
                break;
            }
            case 5 :{
                System.out.println("(|___|)");
                System.out.println("(=@.@=)");
                System.out.println("(!!)(!!)");
                break;
            }
        }
        while (choose != 0){
            System.out.println("Enter your choose :");
            choose = scan.nextInt();
            switch (choose){
                case 1 :{
                    System.out.println("(─‿‿─) ");
                    break;
                }
                case 2 : {
                    System.out.println("凸(¬‿¬)凸 ");
                    break;
                }
                case 3 :{
                    System.out.println("‹(•¿•)› ");
                    break;
                }
                case 4 :{
                    System.out.println("̿’ ̿’(•̪●)=ε/̵͇̿̿/’̿’̿ ̿ ");
                    break;
                }
                case 5 :{
                    System.out.println("(|___|)");
                    System.out.println("(=@.@=)");
                    System.out.println("(!!)(!!)");
                    break;
                }
            }
        }
    }
}
