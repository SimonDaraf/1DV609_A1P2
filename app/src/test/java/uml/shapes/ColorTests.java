package uml.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uml.shapes.errors.InvalidRgbValueException;

public class ColorTests {
  private Color getSystemUnderTest(int red, int green, int blue) throws InvalidRgbValueException {
    return new Color(red, green, blue);
  }

  @Test
  public void shouldFailIfRedValueIsOver255() {
    try {
      Color sut = getSystemUnderTest(256, 0, 0);
      Assertions.fail("No exception of type InvalidRgbValueException was thrown.");
    } catch (InvalidRgbValueException e) {
      Assertions.assertTrue(true);
    }
  }

  @Test
  public void shouldFailIfGreenValueIsOver255() {
    try {
      Color sut = getSystemUnderTest(0, 256, 0);
      Assertions.fail("No exception of type InvalidRgbValueException was thrown.");
    } catch (InvalidRgbValueException e) {
      Assertions.assertTrue(true);
    }
  }

  @Test
  public void shouldFailIfBlueValueIsOver255() {
    try {
      Color sut = getSystemUnderTest(0, 0, 256);
      Assertions.fail("No exception of type InvalidRgbValueException was thrown.");
    } catch (InvalidRgbValueException e) {
      Assertions.assertTrue(true);
    }
  }

  @Test
  public void shouldFailIfRedValueIsBelow0() {
    try {
      Color sut = getSystemUnderTest(-1, 0, 0);
      Assertions.fail("No exception of type InvalidRgbValueException was thrown.");
    } catch (InvalidRgbValueException e) {
      Assertions.assertTrue(true);
    }
  }

  @Test
  public void shouldFailIfGreenValueIsBelow0() {
    try {
      Color sut = getSystemUnderTest(0, -1, 0);
      Assertions.fail("No exception of type InvalidRgbValueException was thrown.");
    } catch (InvalidRgbValueException e) {
      Assertions.assertTrue(true);
    }
  }

  @Test
  public void shouldFailIfBlueValueIsBelow0() {
    try {
      Color sut = getSystemUnderTest(0, 0, -1);
      Assertions.fail("No exception of type InvalidRgbValueException was thrown.");
    } catch (InvalidRgbValueException e) {
      Assertions.assertTrue(true);
    }
  }
}
