package projectEuler;

import euler.Problem2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem2Test {
        @Test
        @DisplayName("euler.Problem2 Test")
        void check() {
            assertEquals(Problem2.answer(),4613732);
        }
}
