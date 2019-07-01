package task9.HorsesSpeed;

import task9.Interfaces.Run;
import task9.Logic.SpeedResult;

public class WarHorseSpeed implements Run {
    public int speedRun() {
        int minSpeed = 15;
        int maxSpeed = 30;
        return new SpeedResult().CalculateSpeed(minSpeed, maxSpeed);
    }
}
