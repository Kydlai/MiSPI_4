import mBean.AverageDistanceMeasurer;
import mBean.PointCounter;

import javax.management.*;
import java.awt.geom.Area;
import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();

        ObjectName pointCounterName = new ObjectName("MiSPI_4.src.main.java.mBean:type=PointCounter");
        PointCounter pointCounter = new PointCounter();

        ObjectName averageMeasurerName = new ObjectName("MiSPI_4.src.main.java.mBean:type=averageDistanceMeasurer");
        AverageDistanceMeasurer averageDistanceMeasurer = new AverageDistanceMeasurer();

        mBeanServer.registerMBean(pointCounter, pointCounterName);
        mBeanServer.registerMBean(averageDistanceMeasurer, averageMeasurerName);

        while(true){
            double x, y, r;
            Reader reader = new Reader();

            x = reader.readX();
            y = reader.readY();
            r = reader.readR();

            pointCounter.increment();
            averageDistanceMeasurer.addClick();

            AreaChecker checker = new AreaChecker(x, y, r);
            checker.run();
            boolean inArea = checker.isInArea();
            System.out.println(inArea ? "Входит в область" : "Не входит в область");
        }
    }

}
