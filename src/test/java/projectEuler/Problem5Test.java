package projectEuler;

import euler.Problem4;
import euler.Problem5;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem5Test {
        @Test
        @DisplayName("euler.Problem2 Test")
        void check() {
            assertEquals(Problem5.answer(20),232792560);
        }
}
