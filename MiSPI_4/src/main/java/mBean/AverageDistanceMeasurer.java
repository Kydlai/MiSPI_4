package mBean;

import java.util.ArrayList;
import java.util.List;

public class AverageDistanceMeasurer implements AverageDistanceMeasurerMBean {
    private final MyTimer timer = MyTimer.getInstance();
    @Override
    public Double getAverageDistance() {
        return timer.getAverageTime();
    }

    @Override
    public void addClick() {
        timer.addTime();
    }
}
