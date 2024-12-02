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

  @Test
  public void shouldBeAbleToSetWidth() {
    Rectangle sut = new Rectangle();
    float expected = 150;

    sut.setWidth(expected);
    float actual = sut.getWidth();

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldBeAbleToSetHeight() {
    Rectangle sut = new Rectangle();
    float expected = 150;

    sut.setHeight(expected);
    float actual = sut.getHeight();

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldClampWidthTo0() {
    Rectangle sut = new Rectangle();
    float expected = 0;

    sut.setWidth(-10);
    float actual = sut.getWidth();

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldClampHeightTo0() {
    Rectangle sut = new Rectangle();
    float expected = 0;

    sut.setHeight(-10);
    float actual = sut.getHeight();

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldIncrementTheWidth() {
    Rectangle sut = new Rectangle();
    float expected = 110;

    sut.changeWidth(10);
    float actual = sut.getWidth();

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldDecrementTheWidth() {
    Rectangle sut = new Rectangle();
    float expected = 90;

    sut.changeWidth(-10);
    float actual = sut.getWidth();

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldClampWidthChangeTo0() {
    Rectangle sut = new Rectangle();
    float expected = 0;

    sut.changeWidth(-200);
    float actual = sut.getWidth();

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldIncrementTheHeight() {
    Rectangle sut = new Rectangle();
    float expected = 110;

    sut.changeHeight(10);
    float actual = sut.getHeight();

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldDecrementTheHeight() {
    Rectangle sut = new Rectangle();
    float expected = 90;

    sut.changeHeight(-10);
    float actual = sut.getHeight();

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldClampHeightChangeTo0() {
    Rectangle sut = new Rectangle();
    float expected = 0;

    sut.changeHeight(-200);
    float actual = sut.getHeight();

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldBeAbleToCloneRectangleInstance() {
    Rectangle sut = new Rectangle();

    sut.changeLineColor(new Color(0, 0, 0));
    sut.changeBackgroundColor(new Color(0, 0, 0));
    sut.setWidth(10);
    sut.setHeight(10);
    sut.setAnchorPosition(new Point(10, 10));
    sut.changeBorderOption(BorderOptions.DOTTED);

    Rectangle cloned = sut.clone();

    Assertions.assertNotEquals(sut, cloned);
    Assertions.assertEquals(sut.getWidth(), cloned.getWidth());
    Assertions.assertEquals(sut.getHeight(), cloned.getHeight());
    Assertions.assertEquals(sut.getAnchorPosition().xpos, cloned.getAnchorPosition().xpos);
    Assertions.assertEquals(sut.getAnchorPosition().ypos, cloned.getAnchorPosition().ypos);
    Assertions.assertEquals(sut.getBackgroundColor().getRed(), cloned.getBackgroundColor().getRed());
    Assertions.assertEquals(sut.getBackgroundColor().getGreen(), cloned.getBackgroundColor().getGreen());
    Assertions.assertEquals(sut.getBackgroundColor().getBlue(), cloned.getBackgroundColor().getBlue());
    Assertions.assertEquals(sut.getLineColor().getRed(), cloned.getLineColor().getRed());
    Assertions.assertEquals(sut.getLineColor().getGreen(), cloned.getLineColor().getGreen());
    Assertions.assertEquals(sut.getLineColor().getBlue(), cloned.getLineColor().getBlue());
    Assertions.assertEquals(sut.getBorderOption(), cloned.getBorderOption());
  }
}
