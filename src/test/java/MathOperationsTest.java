import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {

    @Test
    void addThreeAndFourEqualSeven() {
        var calculator = new MathOperations();
        assertEquals(7, calculator.add(4, 3));
        assertTrue(calculator.add(5, 6) == 10);
    }

    @Test
    void subtractionTenMinusFourEqualSix() {
        var calculator = new MathOperations();
        assertEquals(6, calculator.subtraction(10, 4));
    }

    @Test
    void multiplicationFiveToSixEqualThirty() {
        var calculator = new MathOperations();
        assertEquals(30, calculator.multiplication(5, 6));
    }


//    @Test
//    void division45to9Equal5() {
//        var calculator = new MathOperations();
//        assertEquals(5, calculator.division(50, 9));
//    }


    // Fibonacci
    @Test
    @DisplayName("Fibonacci")
    void getFibonacciValue() {
        var fibo = new MathOperations();
        assertTrue(fibo.getFibonacciValue(5) == 6);
    }


    @Test
    @DisplayName("Should check all the items in the list")
        // Проверить все элементы в списке
    void shouldCheckAllTheItemsInTheList() {
        List<Integer> numbers = List.of(2, 3, 5, 7);
        List<Integer> numbers2 = List.of(2, 3, 4, 7);
        Assertions.assertAll(() -> assertEquals(numbers2.get(0), numbers.get(0)),
                () -> assertEquals(numbers2.get(1), numbers.get(1)),
                () -> assertEquals(numbers2.get(2), numbers.get(2)),
                () -> assertEquals(numbers2.get(3), numbers.get(3))
        );
    }


        
    }

