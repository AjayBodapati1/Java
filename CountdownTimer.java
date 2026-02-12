import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    public static void main(String args[]){
        int countdownTime;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds to countdown: ");
        countdownTime = sc.nextInt();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = countdownTime;

            @Override
            public void run() {
                if (count == 10) {
                    System.out.println("10 seconds left");
                }
                System.out.println(count);
                count--;

                if (count <= 0) {
                    System.out.println("Time UP!!");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 0, 1000);
    }
}