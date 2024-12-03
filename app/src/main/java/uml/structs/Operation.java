package uml.structs;

import uml.DefaultTypes;
import uml.Visibility;
import util.Cloneable;

/**
 * Represents an operation.
 */
public class Operation implements Cloneable<Operation> {
  private String id;
  private String name;
  private DefaultTypes returnType;
  private Visibility visibility;

  /**
   * Constructs an operation instance.
   *
   * @param id - The operation id.
   * @param name - The operation name.
   * @param returnType - The operation return type.
   * @param visibility - The operation visibility.
   */
  public Operation(String id, String name, DefaultTypes returnType, Visibility visibility) {
    this.id = id;
    this.name = name;
    this.returnType = returnType;
    this.visibility = visibility;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public DefaultTypes getReturnType() {
    return returnType;
  }

  public Visibility getVisibility() {
    return visibility;
  }

  @Override
  public Operation cloneInstance() {
    return this;
  }
}
