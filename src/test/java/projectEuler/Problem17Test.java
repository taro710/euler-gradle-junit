package projectEuler;

import euler.Problem17;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem17Test {
  @Test
  @DisplayName("euler.Problem17 Test")
  void check() {
    assertEquals(Problem17.answer(1), 3);
    assertEquals(Problem17.answer(5), 19);
    assertEquals(Problem17.answer(1), 3);
    assertEquals(Problem17.answer(1), 3);
    assertEquals(Problem17.answer(1), 3);
    assertEquals(Problem17.answer(1), 3);
    assertEquals(Problem17.check(1), "one");
    assertEquals(Problem17.check(9), "nine");
    assertEquals(Problem17.check(10), "ten");
    assertEquals(Problem17.check(19), "nineteen");
    assertEquals(Problem17.check(20), "twenty");
    assertEquals(Problem17.check(110), "onehundredandten");
  }
}
