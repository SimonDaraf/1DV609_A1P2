package uml.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uml.shapes.dummies.ShapeDummy;

public class ShapeTests {
  private Shape sut;

  @BeforeEach
  public void setupSut() {
    this.sut = new ShapeDummy(new Color(0, 0, 0), new Color(0, 0, 0), BorderOptions.WHOLE);
  }

  @Test
  public void shouldBeAbleToChangeBackgroundColor() {
    Color expected = new Color(255, 255, 255);
    sut.changeBackgroundColor(expected);

    Color actual = sut.getBackgroundColor();
    Assertions.assertEquals(actual.getRed(), expected.getRed());
    Assertions.assertEquals(actual.getGreen(), expected.getGreen());
    Assertions.assertEquals(actual.getBlue(), expected.getBlue());
  }
}
