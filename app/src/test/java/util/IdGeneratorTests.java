package util;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class IdGeneratorTests {
  private IdGenerator getSystemUnderTest() {
    return new IdGenerator();
  }

  @Test
  public void shouldReturnAlphaNumericID() {
    IdGenerator sut = getSystemUnderTest();
    int desiredLength = 6;
    String expected = "^[a-zA-Z0-9]{6}$"; // String literal, must occur six times.
    String actual = sut.generateId(desiredLength);

    assertTrue(actual.matches(expected));
  }
}
