package projectEuler;

import euler.Problem20;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem20Test {
  @Test
  @DisplayName("euler.Problem20 Test")
  void check() {
    assertEquals(Problem20.answer(10), 27);
    assertEquals(Problem20.answer(100), 648);
  }
}
