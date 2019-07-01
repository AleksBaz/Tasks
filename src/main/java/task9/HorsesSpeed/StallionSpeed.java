package task9.HorsesSpeed;

import task9.Interfaces.Run;
import task9.Logic.SpeedResult;

public class StallionSpeed implements Run {
    public int speedRun() {
        int minSpeed = 5;
        int maxSpeed = 33;
        return new SpeedResult().CalculateSpeed(minSpeed, maxSpeed);
    }
}
