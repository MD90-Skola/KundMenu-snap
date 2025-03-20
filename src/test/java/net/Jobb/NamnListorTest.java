package net.Jobb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class NavigeringsMenuTest {

    @Test
    void testExitCommand() {
        // Simulate user input "exit" followed by a newline
        ByteArrayInputStream in = new ByteArrayInputStream("exit\n".getBytes());
        System.setIn(in);

        // Capture system output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the menu (this will exit immediately due to "exit")
        NavigeringsMenu.start();

        // Verify output contains expected shutdown message
        assertTrue(out.toString().contains("Programmet avslutas"));
    }

    @Test
    void testShowCustomers() {
        // Simulate input "1" to trigger customer listing
        ByteArrayInputStream in = new ByteArrayInputStream("1\nexit\n".getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        NavigeringsMenu.start();

        // Verify output contains customer list prompt
        assertTrue(out.toString().contains("Visa kunder"));
    }
}

class MainTest {
    @Test
    void testMainRunsWithoutErrors() {
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}
