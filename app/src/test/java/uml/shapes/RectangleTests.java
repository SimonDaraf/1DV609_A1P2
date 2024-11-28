package uml.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uml.structs.Point;

public class RectangleTests {
  @Test
  public void shouldBeAbleToSetAnchorPosition() {
    Rectangle sut = new Rectangle();
    Point expected = new Point(10, 10);

    sut.setAnchorPosition(expected);
    Point actual = sut.getAnchorPosition();

    Assertions.assertEquals(expected.xpos, actual.xpos);
    Assertions.assertEquals(expected.ypos, actual.ypos);
  }
}
