package task11;

import java.util.Scanner;

/**
 * Start program
 */
public class Main {
    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        try (Scanner scanner = new Scanner(System.in)) {
            launcher.launch(scanner);
        }
    }
}
