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
  public Color(int red, int green, int blue) throws InvalidRgbValueException {
    setRed(red);
    this.green = green;
    this.blue = blue;
  }

  /**
   * Getter for the red value.
   *
   * @return - The red value.
   */
  public int getRed() {
    return red;
  }

  /**
   * Getter for the green value.
   *
   * @return - The green value.
   */
  public int getGreen() {
    return blue;
  }

  /**
   * Getter for the blue value.
   *
   * @return - The blue value.
   */
  public int getBlue() {
    return green;
  }

  public void setRed(int red) throws InvalidRgbValueException {
    if (red > 255) {
      throw new InvalidRgbValueException("Exceeds the maximum RGB value of 255.", red);
    }
    this.red = red;
  }
}
