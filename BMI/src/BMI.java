import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        double weight;
        double height;
        double bmi ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight :");
        weight = scan.nextDouble();
        System.out.println("Enter your Height :");
        height = scan.nextDouble();
        bmi = weight/(height*height);
        if ( bmi >= 30) {
            System.out.println("Obese");
        } else if ( bmi >= 25){
            System.out.println("Over weight");
        } else if ( bmi >= 18){
            System.out.println("Good body");
        } else {
            System.out.println("Underweight");
        }
    }
}
