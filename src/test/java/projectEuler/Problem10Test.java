package projectEuler;

import euler.Problem10;
import euler.Problem9;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem10Test {
        @Test
        @DisplayName("euler.Problem10 Test")
        void check() {
            assertEquals(Problem10.answer(2000000),142913828922L);
        }
}
