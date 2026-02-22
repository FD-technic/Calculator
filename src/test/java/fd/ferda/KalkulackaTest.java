package fd.ferda;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class KalkulackaTest {

    @Test
    void secti() {
        var kalkulacka = new Kalkulacka();
        assertEquals(4, kalkulacka.secti(3,1));

    }
    @Test
    void odecti() {
        var kalkulacka = new Kalkulacka();
        assertEquals(2, kalkulacka.odecti(3,1));

    }
    @Test
    void vydel() {
        var kalkulacka = new Kalkulacka();
        assertEquals(-5, kalkulacka.vydel(15, -3));
    }

    @Test
    void deleniNulou() {
        var k = new Kalkulacka();
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> k.vydel(10,0));

        assertEquals("b nesmí být 0", ex.getMessage());
    }
}