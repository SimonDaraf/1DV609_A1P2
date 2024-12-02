package uml;

import uml.errors.InvalidVisibilityException;
import uml.shapes.Rectangle;

/**
 * Represents a UML Class entity.
 */
public class Entity {
  private String name;
  private String id;
  private Rectangle shape;
  private Visibility visibility;
  private Stereotype stereotype;

  /**
   * Constructs a class entity.
   *
   * @param name - The entity name.
   * @param id - A unique id.
   * @param shape - The initialized shape to use.
   * @param visibility - The visibility of the entity.
   * @param stereotype - The entity stereotype.
   */
  public Entity(String name, String id, Rectangle shape,
                Visibility visibility, Stereotype stereotype) throws InvalidVisibilityException {
    this.name = name;
    this.id = id;
    this.shape = shape;
    this.visibility = visibility;
    this.stereotype = stereotype;
  }

  public void setVisibility(Visibility visibility) {

  }
}
