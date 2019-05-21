package task1;

class Semaphore implements Control {

    private String result;

    public int calculate(int time) {
        return time % 6;
    }

    public String switchLights(int remain) {

        if (remain >= 0 & remain <= 1) {
            result = "Green";
        } else if (remain == 2) {
            result = "Yellow";
        } else if (remain > 2 & remain <= 5) {
            result = "Red";
        } else {
            result = "WTF! It looks like traffic light is broken! How did you do this?";
        }
        return result;
    }
}