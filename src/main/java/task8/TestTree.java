package task8;

import java.util.TreeSet;

/** Task 8 TreeSet - создать древовидную структуру хранения номеров шаров от боулинга (шаров всего 20)
 *  (учесть что шары 2 и 7 хранятся в отдельной коллекции - там смещен центр тяжести (эти шары служат для обмана)
 *  проитерироваться по дереву, удалить шары 3 и 17 из дерева, проитерироваться по дереву
 */

public class TestTree {
    public static void main(String[] args){
        TestTree balls = new TestTree();
        TreeSet<Integer> bowlingBalls = new TreeSet<>();

        for(int i = 0; i <= 20; i++) {
            if (i != 2 && i != 7) {
                bowlingBalls.add(i);
            }
                bowlingBalls.removeIf(a -> a == 3 || a == 17);
        }
        System.out.println(bowlingBalls.toString());
    }
}
