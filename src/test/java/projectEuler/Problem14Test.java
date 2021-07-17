package projectEuler;

import euler.Problem14;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem14Test {
  @Test
  @DisplayName("euler.Problem14 Test")
  void check() {
    assertEquals(Problem14.answer(1000000), 837799);
  }
}
