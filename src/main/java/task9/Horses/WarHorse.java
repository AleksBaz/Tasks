package task9.Horses;

import task9.HorsesSpeed.WarHorseSpeed;

public class WarHorse extends Horse {
    public WarHorse() {
        run = new WarHorseSpeed();
    }

    @Override
    public void display() {
        System.out.println("War Horse");
    }
}
