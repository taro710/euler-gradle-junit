package projectEuler;

import euler.Problem16;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem16Test {
  @Test
  @DisplayName("euler.Problem16 Test")
  void check() {
    assertEquals(Problem16.answer(2, 1000), 1366);
  }
}
