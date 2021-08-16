package projectEuler;

import euler.Problem29;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem29Test {
  @Test
  @DisplayName("euler.Problem29 Test")
  void check() {

    assertEquals(Problem29.answer(2, 5), 15);
    assertEquals(Problem29.answer(2, 100), 9183);
  }
}
