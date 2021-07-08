package projectEuler;

import euler.Problem1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem1Test {
        @Test
        @DisplayName("euler.Problem1 Test")
        void check() {
            assertEquals(Problem1.answer(1000),234168);
        }
}
