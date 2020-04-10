import java.time.LocalTime;
import java.util.Scanner;

public class RunStopWatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StopWatch watch = new StopWatch();
        long start;
        int startTime;
        int endTime;
        System.out.println("Enter 1 if u wanna to Start :");
        startTime = scan.nextInt();
        if ( startTime == 1){
            start = LocalTime.now().getSecond();
            watch.setStart(start);
        }
        System.out.println("Enter 2 if u wanna to End :");
        endTime = scan.nextInt();
        if ( endTime == 2 ){
            watch.setEnd();
            System.out.println("Thời gian đã chạy được là : "+watch.getTime() +" giây");
        }
    }
}
