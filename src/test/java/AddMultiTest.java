import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddMultiTest {
    @Test
    void add() {
        assertEquals(25, AddMulti.Add(5,5,10,5));
    }
}