package projectEuler;

import euler.Problem11Check;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem11Test {
  @Test
  @DisplayName("euler.Problem11 Test")
  void check() {
    assertEquals(Problem11Check.answer(4), 70600674);
  }
}
