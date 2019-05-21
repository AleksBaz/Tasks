package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String colorLight;
        int time;
        int number;

        Semaphore trafficLight = new Semaphore();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter time in minutes");
        try {
            time = in.nextInt();
            System.out.println("Your input " + time);

            number = trafficLight.calculate(time);
            colorLight = trafficLight.switchLights(number);
            System.out.println("Traffic light: " + colorLight);
            in.close();
        }
        catch(Exception e) {
            System.out.println("Incorrect input");
        }

    }
}
