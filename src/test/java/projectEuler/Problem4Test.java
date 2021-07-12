package projectEuler;

import euler.Problem3;
import euler.Problem4;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem4Test {
        @Test
        @DisplayName("euler.Problem2 Test")
        // TODO 処理時間短縮
        void check() {
            assertEquals(Problem4.answer(),906609);
        }
}
