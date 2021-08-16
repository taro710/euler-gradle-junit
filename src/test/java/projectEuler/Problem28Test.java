package projectEuler;

import euler.Problem28;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem28Test {
  @Test
  @DisplayName("euler.Problem28 Test")
  void check() {

    assertEquals(Problem28.answer(5), 101);
    assertEquals(Problem28.answer(1001), 669171001);
  }
}
