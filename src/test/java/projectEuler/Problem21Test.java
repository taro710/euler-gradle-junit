package projectEuler;

import euler.Problem20;
import euler.Problem21;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem21Test {
  @Test
  @DisplayName("euler.Problem21 Test")
  void check() {
    assertEquals(Problem21.answer(10000), 31626);
  }
}
