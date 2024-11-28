package uml.structs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTests {
  @Test
  public void shouldBeAbleToCreatePoint() {
    Point sut = new Point(10, 10);
    float expectedX = 10;
    float expectedY = 10;

    Assertions.assertEquals(expectedX, sut.x);
    Assertions.assertEquals(expectedY, sut.y);
  }

  @Test
  public void shouldBeAbleToCreateAPointWithoutParams() {
    Point sut = new Point();

    float expectedX = 0;
    float expectedY = 0;

    Assertions.assertEquals(expectedX, sut.x);
    Assertions.assertEquals(expectedY, sut.y);
  }

  @Test
  public void shouldBeAbleToCreatePointFromAnotherPoint() {
    Point expected = new Point(10, 10);
    Point sut = new Point(expected);

    Assertions.assertEquals(expected.x, sut.x);
    Assertions.assertEquals(expected.y, sut.y);
  }
}
