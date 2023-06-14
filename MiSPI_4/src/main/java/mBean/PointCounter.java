package mBean;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PointCounter implements PointCounterMBean, Incremental{
    @Getter private Integer totalPointCount = 0;

    @Override
    public Boolean isTotalPointCountDivisibleBy15() {
        return totalPointCount % 15 == 0;
    }

    @Override
    public Boolean isTotalPointCountDivisibleBy3() {
        return totalPointCount % 3 == 0;
    }

    @Override
    public void increment() {
        totalPointCount++;
    }
}