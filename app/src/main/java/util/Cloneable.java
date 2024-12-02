package util;

/**
 * Provides an in-house cloneable interface.
 *
 * @param <T> - The cloneable type.
 */
public interface Cloneable<T> {
  /**
   * Returns a new instance with identical members.
   * !May not be a deep copy!
   *
   * @return - The cloned instance.
   */
  public T cloneInstance();
}
