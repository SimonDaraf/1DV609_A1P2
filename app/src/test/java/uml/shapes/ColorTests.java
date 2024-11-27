package uml.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uml.shapes.errors.InvalidRgbValueException;

public class ColorTests {
  private Color getSystemUnderTest(int red, int green, int blue) {
    return new Color(red, green, blue);
  }

  @Test
  public void shouldFailIfRedValueIsOver255() {
    Color sut = getSystemUnderTest(256, 0, 0);

    Assertions.assertThrows(InvalidRgbValueException.class, () -> {
      getSystemUnderTest(256, 0, 0);
    });
  }
}
