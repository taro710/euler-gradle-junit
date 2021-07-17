package projectEuler;

import euler.Problem15CheckLittle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem15CheckLittleTest {
  @Test
  @DisplayName("euler.Problem15 Test")
  void check() {
    assertEquals(Problem15CheckLittle.answer(40, 20), 137846528820L);
  }
}
