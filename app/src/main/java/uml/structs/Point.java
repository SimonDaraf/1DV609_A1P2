package uml.structs;

/**
 * A structure for a point in 2D space.
 */
public class Point {
  public float x;
  public float y;

  /**
   * Constructs a new point and sets x and y to 0.
   */
  public Point() {
    x = 0;
    y = 0;
  }

  /**
   * Constructs a point and assigns given x and y value.
   *
   * @param x - The x value.
   * @param y - The y value.
   */
  public Point(float x, float y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Constructs a point from another given point.
   *
   * @param point - The point to construct from.
   */
  public Point(Point point) {
    x = point.x;
    y = point.y;
  }
}
