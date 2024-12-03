package uml.structs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uml.DefaultTypes;
import uml.Visibility;

public class OperationTests {
  @Test
  public void shouldBeAbleToCloneOperation() {
    Operation sut = new Operation("aaaaaa", "myOperation", DefaultTypes.VOID, Visibility.PUBLIC);

    Operation actual = sut.cloneInstance();

    Assertions.assertNotEquals(sut, actual);
    Assertions.assertEquals(sut.getId(), actual.getId());
    Assertions.assertEquals(sut.getName(), actual.getName());
    Assertions.assertEquals(sut.getReturnType(), actual.getReturnType());
    Assertions.assertEquals(sut.getVisibility(), actual.getVisibility());
  }
}
