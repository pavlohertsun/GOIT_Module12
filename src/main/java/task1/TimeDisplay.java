package task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDisplay implements Runnable {
    @Override
    public void run() {
        while (true) {
            displayElapsedTime();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void displayElapsedTime() {
        long currentTime = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = sdf.format(new Date(currentTime));
        System.out.println("time has passed: " + formattedTime);
    }
}
