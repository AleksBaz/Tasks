package task9.Horses;

import task9.HorsesSpeed.FurySpeed;

public class Fury extends Horse {
    public Fury() {
        run = new FurySpeed();
    }

    @Override
    public void display() {
        System.out.println("Fury Horse");
    }
}
