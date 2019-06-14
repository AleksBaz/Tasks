package task8;

import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args){
        TestTree balls = new TestTree();
        TreeSet<Integer> bowlingBalls = new TreeSet<>();

        for(int i = 0; i <= 20; i++) {
            if (i != 2 && i != 7) {
                bowlingBalls.add(i);
            }
            if (i == 3 || i == 17) {
                bowlingBalls.remove(i);
            }
        }
        System.out.println(bowlingBalls.toString());
    }
}
