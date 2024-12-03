package uml.structs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uml.DefaultTypes;
import uml.Visibility;

public class AttributeTests {
  @Test
  public void shouldBeCloneable() {
    Attribute sut = new Attribute("asdasd", "myAttribute", DefaultTypes.STRING, Visibility.PRIVATE);

    Attribute actual = sut.cloneInstance();

    Assertions.assertNotEquals(sut, actual);
    Assertions.assertEquals(sut.getId(), actual.getId());
    Assertions.assertEquals(sut.getName(), actual.getName());
    Assertions.assertEquals(sut.getType(), actual.getType());
    Assertions.assertEquals(sut.getVisibility(), actual.getVisibility());
  }
}
