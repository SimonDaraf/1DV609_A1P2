package uml.shapes.dummies;

import uml.shapes.BorderOptions;
import uml.shapes.Color;
import uml.shapes.Shape;

/**
 * Shape dummy to test raw shape functionality.
 */
public class ShapeDummy extends Shape {
  public ShapeDummy(Color backgroundColor, Color lineColor, BorderOptions options) {
    super(backgroundColor, lineColor, options);
  }
}
