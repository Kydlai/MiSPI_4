package mBean;

public interface PointCounterMBean {
    Integer getTotalPointCount();
    Boolean isTotalPointCountDivisibleBy15();
    Boolean isTotalPointCountDivisibleBy3();
}
