package uml;

import java.util.ArrayList;
import uml.errors.InvalidVisibilityException;
import uml.shapes.Rectangle;
import uml.structs.Attribute;

/**
 * Represents a UML Class entity.
 */
public class Entity {
  private String name;
  private final String id;
  private Rectangle shape;
  private Visibility visibility;
  private Stereotype stereotype;
  private final ArrayList<Attribute> attributes;

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
    this.shape = shape.cloneInstance();
    this.visibility = visibility;
    this.stereotype = stereotype;
    attributes = new ArrayList<>();
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setShape(Rectangle shape) {
    this.shape = shape.cloneInstance();
  }

  /**
   * Sets the visibility option on the entity.
   *
   * @param visibility - The visibility option.
   * @throws InvalidVisibilityException - Thrown when an invalid visibility is given.
   */
  public void setVisibility(Visibility visibility) throws InvalidVisibilityException {
    if (visibility != Visibility.PUBLIC && visibility != Visibility.PACKAGE) {
      throw new InvalidVisibilityException("Visibility on an entity can not be of type: " + visibility.toString());
    }
    this.visibility = visibility;
  }

  public void setStereotype(Stereotype stereotype) {
    this.stereotype = stereotype;
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

  /**
   * Get an immutable array of the entities attributes.
   *
   * @return - the immutable array of attributes.
   */
  public Attribute[] getAttributes() {
    Attribute[] attrArray = new Attribute[attributes.size()];

    for (int i = 0; i < attrArray.length; i++) {
      attrArray[i] = attributes.get(i).cloneInstance();
    }

    return attrArray;
  }

  public void addAttribute(Attribute attribute) {
    attributes.add(attribute);
  }

  @Override
  public String toString() {
    return "";
  }
}
