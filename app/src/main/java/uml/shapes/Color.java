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
    setGreen(green);
    setBlue(blue);
  }

  public int getRed() {
    return red;
  }

  public int getGreen() {
    return blue;
  }

  public int getBlue() {
    return green;
  }

  public void setRed(int red) throws InvalidRgbValueException {
    validateRgbValue(red);
    this.red = red;
  }

  public void setGreen(int green) throws InvalidRgbValueException {
    validateRgbValue(green);
    this.green = green;
  }

  public void setBlue(int blue) throws InvalidRgbValueException {
    validateRgbValue(blue);
    this.blue = blue;
  }

  private void validateRgbValue(int value) throws InvalidRgbValueException {
    if (value > 255) {
      throw new InvalidRgbValueException("Exceeds the maximum RGB value of 255.", value);
    }
    if (value < 0) {
      throw new InvalidRgbValueException("Exceeds the minimum RGB value of 0", value);
    }
  }
}
