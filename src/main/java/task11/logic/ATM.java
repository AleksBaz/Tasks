package task11.logic;

import task11.interfaces.ATMCircs;

import java.util.concurrent.TimeUnit;

/**
 * In this class realise all capability's of ATM
 */
public class ATM implements ATMCircs {
    private static final Object heck = new Object();
    private static volatile int money = 1_000_000;

    public boolean putMoney(int amount) {
        synchronized (heck) {
            if (amount > 0) {
                try {
                    TimeUnit.NANOSECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                money += amount;
                System.err.println("Success. balance: " + money + "\n");
                return true;
            }
            return false;
        }
    }

    public boolean getMoney(int amount) {
        synchronized (heck) {
            if (amount <= money  && amount > 0) {
                try {
                    TimeUnit.NANOSECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                money -= amount;
                System.err.println("Withdraw success. balance: " + money + "\n");
                return true;
            } else {
                System.err.println("Not enough money \n");
            }
            return false;
        }
    }

    public int getBalance() {
        synchronized (heck) {
            try {
                TimeUnit.NANOSECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println("Balance: " + money);
            return money;
        }
    }
}