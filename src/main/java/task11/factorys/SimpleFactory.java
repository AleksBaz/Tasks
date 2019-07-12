package task11.factorys;

import task11.interfaces.AbstractFactory;

/**
 * Creates objects
 */
public class SimpleFactory {
     public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("ATMFactory")) {
            return new ATMFactory();
        }
         if (type.equalsIgnoreCase("Random")) {
             return new RandomFactory();
         }
        throw new IllegalArgumentException(type + " type not supported by FactoryProvider.getFactory method.");
    }
}

