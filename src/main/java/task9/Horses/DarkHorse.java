package task9.Horses;
import task9.HorsesSpeed.FurySpeed;
import task9.HorsesSpeed.NagHorseSpeed;
import task9.HorsesSpeed.StallionSpeed;
import task9.HorsesSpeed.WarHorseSpeed;

import java.util.Random;

public class DarkHorse extends Horse {
    public DarkHorse() {
        Random random = new Random();
        int randomHorse = (random.nextInt(4) + 1);
        switch(randomHorse) {
            case 1: run = new NagHorseSpeed();
                break;
            case 2: run = new WarHorseSpeed();
                break;
            case 3: run = new StallionSpeed();
                break;
            case 4: run = new FurySpeed();
                break;
        }
    }

    @Override
    public void display() {
        System.out.println("Dark Horse");
    }
}
