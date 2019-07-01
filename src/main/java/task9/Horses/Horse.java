package task9.Horses;

import task9.Interfaces.Run;

public abstract class Horse {
    Run run;

    Horse() {}

    public abstract void display();

    public int speedResult() {
        return run.speedRun();
    }
}
