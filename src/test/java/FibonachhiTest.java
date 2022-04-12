import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonachhiTest {

    @Test
    @DisplayName("Найти число Фиббоначи")
    void getFibonacciValue() {
        var fibo = new Fibonachhi();
        assertEquals(1, fibo.getFibonacciValue(3));
    }
}