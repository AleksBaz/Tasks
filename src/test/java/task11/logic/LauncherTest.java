package task11.logic;

import org.junit.Before;
import org.junit.Test;

import task11.Launcher;
import task11.menu.Menu;
import java.util.Scanner;

import static org.junit.Assert.*;

public class LauncherTest {
    Launcher launcher;

    @Before
    public void setUp() {
        launcher = new Launcher();
    }

    @Test
    public void processResultTest() {
        try (Scanner scanner = new Scanner("1" + System.lineSeparator())) {
            assertTrue(launcher.choice(scanner, "3"));
        }
        try (Scanner scanner = new Scanner("1" + System.lineSeparator())) {
            assertTrue(launcher.choice(scanner, "0"));
        }

        try (Scanner scanner = new Scanner("1" + System.lineSeparator())) {
            assertTrue(launcher.choice(scanner, "0.444"));
        }
        try (Scanner scanner = new Scanner("1" + System.lineSeparator())) {
            assertTrue(launcher.choice(scanner, "-20"));
        }
        assertTrue(launcher.choice(null, "1"));
        assertTrue(launcher.choice(null, "2"));
        assertFalse(launcher.choice(null, "3"));
        assertTrue(launcher.choice(null, "4"));
    }

    @Test
    public void showMenuTest() {
        new Menu().showMenu();
        assert (true);
    }
}

