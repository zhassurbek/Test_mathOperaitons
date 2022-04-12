import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ExampleTest {

    @Test
    @Disabled("Not implemented yet")
    void shouldShowSimpleAssertion()  {
        Assertions.assertEquals(1, 1);
    }

//
//    @Test
//    @DisplayName("Should check all items in the list")
//    void shouldCheckAllItemsInTheList() {
//
//        fail("Not implemented");
//    }

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


        Assertions.assertEquals(2, numbers.get(0));
        Assertions.assertEquals(3, numbers.get(1));
        Assertions.assertEquals(5, numbers.get(2));
        Assertions.assertEquals(7, numbers.get(3));

        
    }

//    @ParameterizedTest
//    @DisplayName("Should create shapes with different numbers of sides")
//    @ValueSource(ints = {3, 4, 5 ,16, 33})
//    void shouldCreateShapesWithDifferentNumbersOfSides() {
//        new Shape
//
//    }

}
