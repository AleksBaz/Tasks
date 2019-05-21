package task2;

public class Task3_13 {
    private boolean a = true;
    private boolean b = true;

    public static void main(String[] args) {
        Task3_13 task = new Task3_13();
        task.runTests();
    }

    private void runTests() {
        for(int i = 0; i<2; i++) {
            b = true;
            for(int j = 0; j<2; j++) {
                System.out.println("a =" + a + ", b = " + b + ", Result = " + taskA(a, b));
                System.out.println("a =" + a + ", b = " + b + ", Result = " + taskB(a, b));
                System.out.println("a =" + a + ", b = " + b + ", Result = " + taskC(a, b));
                b = false;
            }
            a = false;
        }
    }

    private boolean taskA(boolean a,boolean b) {
        return !(a&&b);
    }

    private boolean taskB(boolean a,boolean b) {
        return !a||b;
    }

    private boolean taskC(boolean a,boolean b) {
        return a||!b;
    }
}
