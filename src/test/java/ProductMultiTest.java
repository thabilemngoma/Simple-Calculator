import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductMultiTest {

    @Test
    void product() {
        assertEquals(50, ProductMulti.Product(2,5,2,1));
    }
}