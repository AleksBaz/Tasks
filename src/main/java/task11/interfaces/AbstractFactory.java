package task11.interfaces;

public interface AbstractFactory<T> {
    T create(String type);
}
