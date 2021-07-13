package projectEuler;

import euler.Problem7;
import euler.Problem8;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem8Test {
        @Test
        @DisplayName("euler.Problem8 Test")
        void check() {
            assertEquals(Problem8.answer(4),5832);
            assertEquals(Problem8.answer(13),23514624000L);
        }
}
