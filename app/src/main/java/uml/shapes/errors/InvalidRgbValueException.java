package uml.shapes.errors;

/**
 * An exception thrown when an invalid rgb value is given.
 */
public class InvalidRgbValueException extends Exception {
  /**
   * Creates a new invalidRgbValueException instance.
   *
   * @param errorMessage - The error message.
   * @param invalidValue - The invalid value.
   */
  public InvalidRgbValueException(String errorMessage, int invalidValue) {
    super(invalidValue + " : " + errorMessage);
  }
}
