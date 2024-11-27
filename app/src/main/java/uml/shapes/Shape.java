package uml.shapes;

/**
 * Represents an abstract shape.
 */
public abstract class Shape {
  private final Color backgroundColor;
  private final Color lineColor;
  private BorderOptions borderOption;

  /**
   * Constructor for abstract shape.
   *
   * @param backgroundColor - The background color.
   */
  public Shape(Color backgroundColor, Color lineColor, BorderOptions borderOption) {
    this.backgroundColor = backgroundColor;
    this.lineColor = lineColor;
    this.borderOption = borderOption;
  }

  public void changeBackgroundColor(Color color) {
    this.backgroundColor.setColor(color);
  }

  public void changeLineColor(Color color) {
    this.lineColor.setColor(color);
  }

  public void changeBorderOption(BorderOptions option) {
    this.borderOption = option;
  }

  public Color getBackgroundColor() {
    return this.backgroundColor;
  }

  public Color getLineColor() {
    return this.lineColor;
  }

  public BorderOptions getBorderOption() {
    return this.borderOption;
  }
}
