package task6;

public class Main {
    public static void main(String[] args) {
        DoubleOperation<Double> doubleOperation = (k, v) -> k-v;
        System.out.println(doubleOperation.calculate(5.5, 1.3));
        System.out.println(doubleOperation.interfaceInfo());
    }
}
