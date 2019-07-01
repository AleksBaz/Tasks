package task9;

import task9.Logic.Fabrica;
import task9.Logic.Menu;
import task9.Logic.MoneyColculate;
import java.util.Scanner;

/**
 * Main class for Horse Race. Contains methods to get user input and game logic.
 */
public class StartHorseRace {
    public static void main(String[] args) {
        String userHorse;
        String userChoice = "";
        int userMoney = 10000;
        boolean chekH = false;

        System.out.println("\n Welcome to Hippodrome! \n");
        System.out.println("Your money: " + userMoney);

        try {
            for (; ; ) {
                Scanner in = new Scanner(System.in);
                new Menu().showMenu();
                userHorse = in.next();
                switch (userHorse) {
                    case "1":
                        userChoice = "Nag Horse";
                        System.out.println("You bet on Nag Horse");
                        chekH = true;
                        break;
                    case "2":
                        userChoice = "Dark Horse";
                        System.out.println("You bet on Dark Horse");
                        chekH = true;
                        break;
                    case "3":
                        userChoice = "War Horse";
                        System.out.println("You bet on War-horse");
                        chekH = true;
                        break;
                    case "4":
                        userChoice = "Stallion Horse";
                        System.out.println("You bet on Stallion");
                        chekH = true;
                        break;
                    case "5":
                        userChoice = "Furry Horse";
                        System.out.println("You bet on Fury");
                        chekH = true;
                        break;
                    case "Q":
                        userChoice = "Q";
                        System.out.println("Good Bye!");
                        break;
                    default:
                        System.out.println("You bet dont accept");
                        chekH = false;
                        break;
                }

                if(userChoice.equals("Q")) {
                    in.close();
                    break;
                }
                if(chekH) {
                    System.out.println("Enter bet amount: ");
                    int userBet = in.nextInt();
                    if(userMoney >= userBet) {
                        System.out.println("Bets accepted!\n");
                        userMoney = new MoneyColculate().calculate((new Fabrica().fabricate()), userBet,
                                userMoney, userChoice);
                    }else {
                        System.out.println("Not enough money in your account");
                    }
                }else {
                    System.out.println("Wrong Input, please enter number of horse");
                }
                if(userMoney == 0) {
                    System.out.println("You lost all the money");
                    System.out.println("Good Buy!");
                    break;
                }
            }
        }
        catch(Exception e){
                System.err.println("!!! Error --- " + e.getMessage() );
                e.printStackTrace();
        }
    }
}
