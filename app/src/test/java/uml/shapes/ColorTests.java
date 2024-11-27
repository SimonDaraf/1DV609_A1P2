package uml.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uml.shapes.errors.InvalidRgbValueException;

public class ColorTests {
  private Color getSystemUnderTest(int red, int green, int blue) {
    return new Color(red, green, blue);
  }

  @Test
  public void shouldCapRedValueTo255() {
    Color sut = getSystemUnderTest(256, 0, 0);
    int actual = sut.getRed();
    int expected = 255;

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldCapGreenValueTo255() {
    Color sut = getSystemUnderTest(0, 256, 0);
    int actual = sut.getGreen();
    int expected = 255;

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldCapBlueValueTo255() {
    Color sut = getSystemUnderTest(0, 0, 256);
    int actual = sut.getBlue();
    int expected = 255;

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldFailIfRedValueIsBelow0() {
    Color sut = getSystemUnderTest(-1, 0, 0);
    int actual = sut.getRed();
    int expected = 0;

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldFailIfGreenValueIsBelow0() {
    Color sut = getSystemUnderTest(0, -1, 0);
    int actual = sut.getGreen();
    int expected = 0;

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldFailIfBlueValueIsBelow0() {
    Color sut = getSystemUnderTest(0, 0, -1);
    int actual = sut.getBlue();
    int expected = 0;

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldBeAbleChangeEveryRgbValueWithNewColor() {
    Color sut = getSystemUnderTest(0, 0, 0);
    Color newColor = getSystemUnderTest(100, 50, 255);

    sut.setColor(newColor);

    Assertions.assertEquals(sut.getRed(), newColor.getRed());
    Assertions.assertEquals(sut.getGreen(), newColor.getGreen());
    Assertions.assertEquals(sut.getBlue(), newColor.getBlue());
  }
}
