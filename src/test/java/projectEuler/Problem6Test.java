package projectEuler;

import euler.Problem5;
import euler.Problem6;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem6Test {
        @Test
        @DisplayName("euler.Problem6 Test")
        void check() {
            assertEquals(Problem6.answer(10),2640);
            assertEquals(Problem6.answer(100),25164150);
        }
}
