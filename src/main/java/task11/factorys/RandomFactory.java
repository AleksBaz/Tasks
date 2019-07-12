package task11.factorys;

import task11.interfaces.AbstractFactory;
import task11.logic.Random;

/**
 * Creates class Random object
 */
public class RandomFactory implements AbstractFactory<Random> {
    public Random create(String type) {
        if (type.equalsIgnoreCase("Random")) {
            return new Random();
        }
        throw new IllegalArgumentException(type + " type not supported by " + this.getClass().getName());
    }
}