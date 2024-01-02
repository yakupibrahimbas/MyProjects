package O1;

import java.util.Timer;
import java.util.TimerTask;

    public class NewYearCelebration {

        public static void main(String[] args) {
            Timer timer = new Timer();

            timer.scheduleAtFixedRate(new TimerTask() {
                int countdown = 10;

                @Override
                public void run() {
                    if (countdown > 0) {
                        System.out.println("Countdown: " + countdown);
                        countdown--;
                    } else {
                        System.out.println("Happy New Year 2024!");
                        timer.cancel();
                    }
                }
            }, 0, 1000);
        }
    }

