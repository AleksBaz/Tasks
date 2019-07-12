package task11;

import task11.interfaces.AbstractFactory;
import task11.factorys.SimpleFactory;
import task11.logic.ATM;
import task11.logic.Random;
import task11.menu.Menu;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Console ATM
 */
public class Launcher {
    static private ATM atm;
    static private Random random;

    public Launcher() {
        AbstractFactory<ATM> factory = SimpleFactory.getFactory("ATMFactory");
        AbstractFactory<Random> factory1 = SimpleFactory.getFactory("Random");
        atm = factory.create("SimpleATM");
        random = factory1.create("Random");
    }

    public boolean launch(Scanner scanner) {
            for (; ; ) {
                new Menu().showMenu();
                String userChoice = scanner.next();
                new Launcher().choice(scanner, userChoice);
                if (userChoice.equals("4")) {
                    break;
                }
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        return false;
    }

    public boolean choice(Scanner scanner, String userChoice) {

        if (userChoice.equals("4")) {
            System.out.println("Good buy!");
            scanner.close();
        } else if (userChoice.equals("1")) {
            System.out.println("Enter sum withdraw: ");
            int countGet = scanner.nextInt();
            random.goRandom();
            boolean res = atm.getMoney(countGet);
            return res;

        } else if (userChoice.equals("2")) {
            System.out.println("Enter sum input: ");
            int countPut = scanner.nextInt();
            random.goRandom();
            return atm.putMoney(countPut);

        } else if (userChoice.equals("3")) {
            random.goRandom();
            atm.getBalance();
            return true;
        } else {
            System.out.println("Incorrect input, try again!");
        }
        return false;
    }
}
