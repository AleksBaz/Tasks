package task11.logic;

public class Random {
     public void goRandom() {
         java.util.Random random = new java.util.Random();
         for (int i = 0; i < 10; i++) {
             new Thread(() -> {
                 final int act = 1 + random.nextInt(3 - 1);
                 if(act == 1) {
                     new ATM().getBalance();
                 }
                 if(act == 2) {
                     new ATM().getMoney(1 + random.nextInt(10_000 - 1));
                 }
                 if(act == 3) {
                     new ATM().putMoney(1 + random.nextInt(100_000 - 1));
                 }
             }).start();
         }
     }
}
