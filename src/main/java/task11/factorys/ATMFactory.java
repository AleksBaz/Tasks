package task11.factorys;

import task11.interfaces.AbstractFactory;
import task11.logic.ATM;

/**
 * Creates class ATM object
 */
public class ATMFactory implements AbstractFactory<ATM> {
    public ATM create(String type) {
        if (type.equalsIgnoreCase("SimpleATM")) {
            return new ATM();
        }
        throw new IllegalArgumentException(type + " type not supported by " + this.getClass().getName());
    }
}

