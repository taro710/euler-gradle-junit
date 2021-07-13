package projectEuler;

import euler.Problem8;
import euler.Problem9;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem9Test {
        @Test
        @DisplayName("euler.Problem9 Test")
        void check() {
            assertEquals(Problem9.answer(),31875000);
        }
}
