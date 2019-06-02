package task6;

public interface DoubleOperation<T extends Number> {
    T calculate(T first, T second);

    default String interfaceInfo() {
        return "This is functional interface for operation on two parameters.";
    }
}
