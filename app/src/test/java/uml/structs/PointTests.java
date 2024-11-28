package uml.structs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTests {
  @Test
  public void shouldBeAbleToCreatePoint() {
    Point sut = new Point(10, 10);
    float expectedX = 10;
    float expectedY = 10;

    Assertions.assertEquals(expectedX, sut.xpos);
    Assertions.assertEquals(expectedY, sut.ypos);
  }

  @Test
  public void shouldBeAbleToCreateAPointWithoutParams() {
    Point sut = new Point();

    float expectedX = 0;
    float expectedY = 0;

    Assertions.assertEquals(expectedX, sut.xpos);
    Assertions.assertEquals(expectedY, sut.ypos);
  }

  @Test
  public void shouldBeAbleToCreatePointFromAnotherPoint() {
    Point expected = new Point(10, 10);
    Point sut = new Point(expected);

    Assertions.assertEquals(expected.xpos, sut.xpos);
    Assertions.assertEquals(expected.ypos, sut.ypos);
  }
}
