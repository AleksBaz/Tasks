package task11.logic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ATMTest {
    private ATM atm;
    private int money;

    @Before
    public void setUp() {
        atm = new ATM();
        money = 1_000_000;
    }

    @Test
    public void getBalanceTest() {
        assertEquals(money, atm.getBalance());
    }

    @Test
    public void putMoneyTest() {
        assertTrue(atm.putMoney(4888));
        assertTrue(atm.putMoney(100));
        assertFalse(atm.putMoney(0));
        assertFalse(atm.putMoney(-9999));
    }

    @Test
    public void getMoney() {
        assertTrue(atm.getMoney(3829));
        assertFalse(atm.getMoney(0));
        assertFalse(atm.getMoney(-9999));
        assertFalse(atm.getMoney(0));
    }
}
