import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {
    public Main main;

    @Test
    public void testAddFromMain1() {
        main = new Main();
        assertNotEquals(main, null);
    }

}
