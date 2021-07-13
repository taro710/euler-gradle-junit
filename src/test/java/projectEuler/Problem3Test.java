package projectEuler;

import euler.Problem2;
import euler.Problem3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem3Test {
        @Test
        @DisplayName("euler.Problem3 Test")
        // TODO 処理時間短縮
        void check() {
            assertEquals(Problem3.answer(600851475143L),6857);
        }
}
