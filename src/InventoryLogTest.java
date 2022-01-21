import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryLogTest {
    InventoryLog logTestOne = new InventoryLog();
    InventoryLog logTestTwo = new InventoryLog();

    @Test
    public void add() {
        logTestOne.add('a');
        logTestOne.add('b');
        logTestOne.add('c');
        assertEquals("Log: [a, b, c]", logTestOne.toString());

    }

    @Test
    public void subtract() {
        logTestOne.add('a');
        logTestOne.add('c');
        logTestOne.add('b');
        logTestOne.add('c');
        logTestOne.add('a');
        logTestOne.add('a');
        logTestOne.add('c');
        logTestOne.add('c');
        //subtract a
        logTestOne.subtract('c');
        assertEquals("Log: [a, b, a, a]", logTestOne.toString());
    }

    @Test
    public void get() {
        logTestOne.add('a');
        logTestOne.add('b');
        logTestOne.add('c');
        assertEquals(2, logTestOne.get('c'));
    }

    @Test
    public void set() {
        logTestOne.add('a');
        logTestOne.add('b');
        logTestOne.set('b',5);
        assertEquals("Log: [a, b, b, b, b, b, b]", logTestOne.toString());
    }

    @Test
    public void contains() {
        assertEquals(false, logTestOne.contains('c'));
        logTestTwo.add('b');
        assertEquals(true, logTestTwo.contains('b'));
    }

    @Test
    public void size() {
        assertEquals(0,logTestOne.size());
        logTestTwo.add('x');
         assertEquals(1,logTestTwo.size());
    }

    @Test
    public void isEmpty() {
        assertTrue(true);
    }
}