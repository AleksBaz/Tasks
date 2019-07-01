package task9.HorsesSpeed;

import task9.Interfaces.Run;
import task9.Logic.SpeedResult;

public class FurySpeed implements Run {
    public int speedRun() {
        int minSpeed = 1;
        int maxSpeed = 37;
        return new SpeedResult().CalculateSpeed(minSpeed, maxSpeed);
    }
}
