package task2;

public class Task3_3 {
    private static boolean a = true;
    private static boolean b = false;
    private static boolean c = false;

    public static void main(String[] args) {
        Task3_3 task = new Task3_3();
        task.runTests();
    }

    private void runTests() {
        System.out.println(taskA(a, b));
        System.out.println(taskB(a, b));
        System.out.println(taskC(a, b, c));
    }

    private boolean taskA(boolean a,boolean b) {
        return !a && b;
    }

    private boolean taskB(boolean a,boolean b) {
        return a || !b;
    }

    private boolean taskC(boolean a,boolean b, boolean c) {
        return a && b || c;
    }
}
