import java.util.Scanner;

public class TemperatureApp {
    public static void main(String[] args) {
        float temperature;
        int choose ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        do {
            System.out.println("Enter temperature :");
            temperature = scan.nextFloat();
            System.out.println("Your choose :");
            choose = scan.nextInt();
            if (choose == 1)
                System.out.println(convertToCelsius(temperature));
            if ( choose == 2)
                System.out.println(convertToFahrenheit(temperature));
        } while (choose != 0);

    }
    public static float convertToCelsius(float x){
            float y ;
            y = (5f/9f)*(x - 32f);
            return y;
    }
    public  static float convertToFahrenheit(float x){
            float y;
            y = (9f / 5f)*x + 32f;
            return y;
    }
}
