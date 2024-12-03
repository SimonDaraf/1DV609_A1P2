package util;

import java.util.Random;

/**
 * A class containing methods for ID generation.
 */
public class IdGenerator {
  private final Random random;
  private static int bound = 62;
  private static int numberBound = 10;
  private static int lowerCaseBound = 36;
  private static int numberOffset = 48;
  private static int lowerCaseOffset = 55;
  private static int capitalCaseOffset = 61;

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
    int randomIndex = random.nextInt(bound);
    int offset;

    // Total amount of allowed characters is 62,
    // then just offset to match numeric value for corresponding char.
    if (randomIndex < numberBound) {
      offset = numberOffset;
    } else if (randomIndex < lowerCaseBound) {
      offset = lowerCaseOffset;
    } else {
      offset = capitalCaseOffset;
    }

    return (char) (randomIndex + offset);
  }
}
