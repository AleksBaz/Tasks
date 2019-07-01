package task9.Logic;

import java.util.Random;

public class SpeedResult {
    Random random = new Random();
    public int CalculateSpeed(int minSpeed, int maxSpeed) {
        return minSpeed + random.nextInt(maxSpeed - minSpeed);
    }
}
