package projectEuler;

import euler.Problem25;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem25Test {
  @Test
  @DisplayName("euler.Problem25 Test")
  void check() {

    assertEquals(Problem25.answer(1000), 4782);
    assertEquals(Problem25.answer(3), 12);
  }
}
