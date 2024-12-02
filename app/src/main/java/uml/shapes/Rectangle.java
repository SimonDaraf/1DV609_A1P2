package uml.shapes;

import uml.structs.Point;

/**
 * Represents a rectangle shape.
 */
public class Rectangle extends Shape {
  private Point anchor;
  private float width;
  private float height;

  /**
   * Constructs a rectangle shape with default properties.
   *
   * <p> Anchor Position: (0, 0), </p>
   * <p> Width: 100, </p>
   * <p> Height: 100, </p>
   * <p> BackgroundColor: White, </p>
   * <p> LineColor: Black, </p>
   * <p> Border Option: Whole. </p>
   */
  public Rectangle() {
    super(new Color(255, 255, 255), new Color(0, 0, 0), BorderOptions.WHOLE);
    this.anchor = new Point();
    this.width = 100;
    this.height = 100;
  }

  /**
   * Constructs a rectangle shape with default properties.
   *
   * <p> BackgroundColor: White, </p>
   * <p> LineColor: Black, </p>
   * <p> Border Option: Whole. </p>
   *
   * @param anchor          - The anchor position.
   * @param width           - The desired width.
   * @param height          - The desired height.
   */
  public Rectangle(Point anchor, float width, float height) {
    super(new Color(255, 255, 255), new Color(0, 0, 0), BorderOptions.WHOLE);
    this.anchor = anchor;
    this.height = height;
    this.width = width;
  }

  /**
   * Constructs a rectangle shape.
   *
   * @param anchor          - The anchor position.
   * @param width           - The desired width.
   * @param height          - The desired height.
   * @param backgroundColor - The background color.
   * @param lineColor       - The line color.
   * @param borderOption    - The border option.
   */
  public Rectangle(Point anchor, float width, float height,
                   Color backgroundColor, Color lineColor, BorderOptions borderOption) {
    super(backgroundColor, lineColor, borderOption);
    this.anchor = anchor;
    this.height = height;
    this.width = width;
  }

  public Point getAnchorPosition() {
    return new Point(anchor);
  }

  public float getWidth() {
    return width;
  }

  public float getHeight() {
    return height;
  }

  public void setAnchorPosition(Point position) {
    anchor = new Point(position);
  }

  public void setWidth(float width) {
    this.width = clampWidthAndHeight(width);
  }

  public void changeWidth(float change) {
    width = clampWidthAndHeight(width + change);
  }

  public void setHeight(float height) {
    this.height = clampWidthAndHeight(height);
  }

  public void changeHeight(float change) {

  }

  private float clampWidthAndHeight(float value) {
    return Math.max(0, value);
  }
}
