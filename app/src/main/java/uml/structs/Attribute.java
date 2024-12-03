package uml.structs;

import uml.DefaultTypes;
import uml.Visibility;
import util.Cloneable;

/**
 * Represents an attribute.
 */
public class Attribute implements Cloneable<Attribute> {
  private String id;
  private String name;
  private DefaultTypes type;
  private Visibility visibility;

  /**
   * Constructs an attribute instance.
   *
   * @param id - The attribute id.
   * @param name - The attribute name.
   * @param type - The attribute type.
   * @param visibility - The attribute visibility.
   */
  public Attribute(String id, String name, DefaultTypes type, Visibility visibility) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.visibility = visibility;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public DefaultTypes getType() {
    return type;
  }

  public Visibility getVisibility() {
    return visibility;
  }

  @Override
  public Attribute cloneInstance() {
    return this;
  }
}
