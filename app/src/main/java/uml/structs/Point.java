package uml.structs;

/**
 * A structure for a point in 2D space.
 */
public class Point {
  public float xpos;
  public float ypos;

  /**
   * Constructs a new point and sets x and y to 0.
   */
  public Point() {
    xpos = 0;
    ypos = 0;
  }

  /**
   * Constructs a point and assigns given x and y value.
   *
   * @param x - The x value.
   * @param y - The y value.
   */
  public Point(float x, float y) {
    this.xpos = x;
    this.ypos = y;
  }

  /**
   * Constructs a point from another given point.
   *
   * @param point - The point to construct from.
   */
  public Point(Point point) {
    xpos = point.xpos;
    ypos = point.ypos;
  }
}
