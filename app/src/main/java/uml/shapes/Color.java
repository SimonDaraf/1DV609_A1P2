package uml.shapes;

import uml.shapes.errors.InvalidRgbValueException;

/**
 * A class holding rgb values.
 */
public class Color {
  private int red;
  private int green;
  private int blue;

  /**
   * Creates a new rgb color instance.
   *
   * @param red - The red value.
   * @param green - The green value.
   * @param blue - The blue value.
   */
  public Color(int red, int green, int blue) {
    setRed(red);
    setGreen(green);
    setBlue(blue);
  }

  public int getRed() {
    return red;
  }

  public int getGreen() {
    return green;
  }

  public int getBlue() {
    return blue;
  }

  public void setRed(int red) {
    this.red = validateRgbValue(red);
  }

  public void setGreen(int green) {
    this.green = validateRgbValue(green);
  }

  public void setBlue(int blue) {
    this.blue = validateRgbValue(blue);
  }

  /**
   * Change the color using another color instance.
   *
   * @param color - The color instance to copy.
   */
  public void setColor(Color color) {
    this.setRed(color.getRed());
    this.setGreen(color.getGreen());
    this.setBlue(color.getBlue());
  }

  private int validateRgbValue(int value) {
    return Math.min(Math.max(value, 0), 255); // Clamp to [0, 255].
  }
}
