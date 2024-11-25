package util;

import java.util.Random;

/**
 * A class containing methods for ID generation.
 */
public class IdGenerator {
  private final Random random;

  /**
   * Constructs a new instance of the IdGenerator.
   */
  public IdGenerator() {
    this.random = new Random();
  }

  /**
   * Generates an alphanumeric id.
   *
   * @param length - The desired ID length.
   * @return - The generated alphanumeric id.
   */
  public String generateId(int length) {
    return String.valueOf(getRandomAlphanumericCharacter()).repeat(Math.max(0, length));
  }

  private char getRandomAlphanumericCharacter() {
    int randomIndex = random.nextInt(62);
    int offset = 0;

    // Total amount of allowed characters is 62,
    // then just offset to match numeric value for corresponding char.
    if (randomIndex < 10) {
      offset = 48;
    } else if (randomIndex < 36) {
      offset = 55;
    } else {
      offset = 61;
    }

    return (char) (randomIndex + offset);
  }
}
