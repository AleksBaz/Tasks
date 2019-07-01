package task9.HorsesSpeed;

import task9.Interfaces.Run;
import task9.Logic.SpeedResult;

public class NagHorseSpeed implements Run {
    public int speedRun() {
        int minSpeed = 20;
        int maxSpeed = 25;
        return new SpeedResult().CalculateSpeed(minSpeed, maxSpeed);
    }
}
