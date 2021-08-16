package projectEuler;

import euler.Problem30;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem30Test {
  @Test
  @DisplayName("euler.Problem30 Test")
  void check() {

    assertEquals(Problem30.answer(4), 19316);
    assertEquals(Problem30.answer(5), 443839);
  }
}
