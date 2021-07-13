package projectEuler;

import euler.Problem6;
import euler.Problem7;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem7Test {
        @Test
        @DisplayName("euler.Problem7 Test")
        void check() {
            assertEquals(Problem7.answer(6),13);
            assertEquals(Problem7.answer(10001),104743);
        }
}
