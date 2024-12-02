package uml.errors;

/**
 * Thrown when an invalid visibility is presented.
 */
public class InvalidVisibilityException extends Exception {
  /**
   * Should be thrown when the user has tried to give an invalid visibility option.
   *
   * @param message - The exception message.
   */
  public InvalidVisibilityException(String message) {
    super(message);
  }
}
