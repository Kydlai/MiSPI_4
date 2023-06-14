import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AreaChecker{
    private final double x, y, r;
    private boolean inArea = false;

    public void run() {
        //square
        if(x/r >= -1 && x <= 0 && y >= 0 && y/r <= 1d/2)
            inArea = true;
        //circle
        if(x*x + y*y <= r*r && x <= 0 && y <= 0)
            inArea = true;
        //triangle
        if(x + y <= r && x >= 0 && y >= 0)
            inArea = true;
        Counter.increase();
    }

    public boolean isInArea() {
        return inArea;
    }
}
