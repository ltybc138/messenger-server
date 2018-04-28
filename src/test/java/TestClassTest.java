import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {

    @Test
    void sum() {
        TestClass testClass = new TestClass();
        assertTrue(5 == testClass.sum(2, 3));
    }
}