import java.util.Scanner;
public class DocSoThanhChu {
    public static void main(String[] args) {
        int x;
        int a;
        int b;
        String result1 = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of Integer that is not over 2 units and higher than Zero :");
        x = scanner.nextInt();
        if (x <= 20) {
            switch (x) {
                case 1: {
                    System.out.println("One");
                    break;
                }
                case 2: {
                    System.out.println("Two");
                    break;
                }
                case 3: {
                    System.out.println("Three");
                    break;
                }
                case 4: {
                    System.out.println("Four");
                    break;
                }
                case 5: {
                    System.out.println("Five");
                    break;
                }
                case 6: {
                    System.out.println("Six");
                    break;
                }
                case 7: {
                    System.out.println("Seven");
                    break;
                }
                case 8: {
                    System.out.println("Eight");
                    break;
                }
                case 9: {
                    System.out.println("Nine");
                    break;
                }
                case 10: {
                    System.out.println("Ten");
                    break;
                }
                case 11: {
                    System.out.println("Eleven");
                    break;
                }
                case 12: {
                    System.out.println("Twelve");
                }
                case 13: {
                    System.out.println("Thirteen");
                    break;
                }
                case 14: {
                    System.out.println("Fourteen");
                    break;
                }
                case 15: {
                    System.out.println("Fifteen");
                    break;
                }
                case 16: {
                    System.out.println("Sixteen");
                    break;
                }
                case 17: {
                    System.out.println("Seventeen");
                    break;
                }
                case 18: {
                    System.out.println("Eighteen");
                    break;
                }
                case 19: {
                    System.out.println("Nineteen");
                    break;
                }
                case 20: {
                    System.out.println("Twenty");
                    break;
                }

            }
        } else if(x <= 99){
            b = x % 10;
            a = (x - b) / 10;
            switch (a) {
                case 2: {
                    result1 = "Twenty";
                    break;
                }
                case 3: {
                    result1 = "Thirty";
                    break;
                }
                case 4: {
                    result1 = "Forty";
                    break;
                }
                case 5: {
                    result1 = "Fifty";
                    break;
                }
                case 6: {
                    result1 = "Sixty";
                    break;
                }
                case 7: {
                    result1 = "Seventy";
                    break;
                }
                case 8: {
                    result1 = "Eighty";
                    break;
                }
                case 9: {
                    result1 = "Ninety";
                    break;
                }
            }
            switch (b) {
                case 0: {
                    System.out.println(result1);
                    break;
                }
                case 1: {
                    System.out.println(result1 + " and One");
                    break;
                }
                case 2: {
                    System.out.println(result1 + " and two");
                    break;
                }
                case 3: {
                    System.out.println(result1 + " and three");
                    break;
                }
                case 4: {
                    System.out.println(result1 + " and four");
                    break;
                }
                case 5: {
                    System.out.println(result1 + " and five");
                    break;
                }
                case 6: {
                    System.out.println(result1 + " and six");
                    break;
                }
                case 7: {
                    System.out.println(result1 + " and seven");
                    break;
                }
                case 8: {
                    System.out.println(result1 + " and eight");
                    break;
                }
                case 9: {
                    System.out.println(result1 + " and nine");
                    break;
                }

            }
        }
    }
}









