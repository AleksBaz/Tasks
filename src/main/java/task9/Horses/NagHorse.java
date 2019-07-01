package task9.Horses;

import task9.HorsesSpeed.NagHorseSpeed;

public class NagHorse extends Horse {
    public NagHorse() {
        run = new NagHorseSpeed();
    }

    @Override
    public void display() {
        System.out.println("Nag Horse");
    }
}
