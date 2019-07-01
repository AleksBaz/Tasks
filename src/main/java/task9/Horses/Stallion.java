package task9.Horses;

import task9.HorsesSpeed.StallionSpeed;

public class Stallion extends Horse {
    public Stallion() {
        run = new StallionSpeed();
    }

    @Override
    public void display() {
        System.out.println("Stallion");
    }
}
