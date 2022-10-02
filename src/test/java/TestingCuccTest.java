import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingCuccTest {
    TestingCucc robikamNemar;


    @BeforeEach
    void setUp() {
    robikamNemar = new TestingCucc();
    }

    @Test
    void minusFirstLetter() {
        assertEquals(robikamNemar.minusFirstLetter(null), "no can do, sir");
    }
    @Test
    void minusFirstLetter1() {
        assertEquals(robikamNemar.minusFirstLetter(null), "no can do, sires");
    }
}