package task11.factory;

import task11.factorys.ATMFactory;
import task11.logic.ATM;
import task11.logic.Random;
import task11.factorys.RandomFactory;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class FactoryTest {
    private ATMFactory factory;
    private RandomFactory factory1;

    @Before
    public void setUp(){
        factory = new ATMFactory();
        factory1 = new RandomFactory();
    }

    @Test
    public void createTest() {
        assertThat(factory.create("ATMFactory"), instanceOf(ATM.class));
        assertThat(factory1.create("Random"), instanceOf(Random.class));
    }

    @Test (expected = IllegalArgumentException.class)
    public void createTestIllegalArgument() {
        factory.create("Denga");
    }
}

