package task9.Logic;

public class MoneyColculate {
    public int calculate(String winner, int betMoney, int moneySumm, String userChoice) {
        if (winner.equals(userChoice)) {
            betMoney *= 2;
            moneySumm += betMoney;
            System.out.println("\n Congratulations you are WINNER!!! \n");
            System.out.println("balance: " + moneySumm);
        } else {
            moneySumm -= betMoney;
            System.out.println("You lose! Lucky next time!");
            System.out.println("balance: " + moneySumm);
        }
        return moneySumm;
    }
}
