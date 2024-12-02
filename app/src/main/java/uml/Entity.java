package uml;

import uml.errors.InvalidVisibilityException;
import uml.shapes.Rectangle;

/**
 * Represents a UML Class entity.
 */
public class Entity {
  private String name;
  private final String id;
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

  public void setName(String name) {
    this.name = name;
  }

  public void setShape(Rectangle shape) {
    this.shape = shape;
  }

  public void setVisibility(Visibility visibility) throws InvalidVisibilityException {
    if (visibility != Visibility.PUBLIC && visibility != Visibility.PACKAGE) {
      throw new InvalidVisibilityException("Visibility on an entity can not be of type: " + visibility.toString());
    }
    this.visibility = visibility;
  }

  public void setStereotype(Stereotype stereotype) {

  }

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public Visibility getVisibility() {
    return visibility;
  }

  public Stereotype getStereotype() {
    return stereotype;
  }

  @Override
  public String toString() {
    return "";
  }
}
