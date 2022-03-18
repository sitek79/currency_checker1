package ru.dudeandrey;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("TimerTask started its execution in:" + new Date());
        completeTask();
        System.out.println("TimerTask finished its execution in:" + new Date());
    }

    private void completeTask() {
        try {
            // допустим, выполнение займет 20 секунд
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void runTimer(){
        TimerTask timerTask = new MyTimerTask();
        // стартуем TimerTask в виде демона

        Timer timer = new Timer(true);
        // будем запускать каждых 10 секунд (10 * 1000 миллисекунд)
        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
        System.out.println("TimerTask started execution");

        // вызываем cancel() через какое-то время
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask finished");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
