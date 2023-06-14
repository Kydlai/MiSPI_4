package mBean;

import java.util.ArrayList;
import java.util.List;

public class MyTimer {
    private static MyTimer myTimer;
    private MyTimer(){};
    public static MyTimer getInstance(){
        if (myTimer != null) return myTimer;
        myTimer = new MyTimer();
        return myTimer;
    }

    private double count = 0;
    private double firstTime = 0, lastTime = 0;
    public void addTime(){
        double time = System.currentTimeMillis();
        count++;
        if (count == 1) firstTime = time;
        lastTime = time;

    }

    public double getAverageTime() {
        return (lastTime - firstTime) / count;
    }
}
