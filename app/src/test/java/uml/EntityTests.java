package uml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uml.errors.InvalidVisibilityException;
import uml.shapes.Rectangle;
import static org.mockito.Mockito.*;

public class EntityTests {
  private Entity sut;

  @BeforeEach
  public void setup() {
    Rectangle mockedRec = mock(Rectangle.class);
    try {
      sut = new Entity("Test", "aaaaaa", mockedRec, Visibility.PUBLIC, Stereotype.ENTITY);
    } catch (InvalidVisibilityException e) {
      throw new RuntimeException(e);
    }
  }

  @Test
  public void shouldThrowErrorIfVisibilityIsPrivate() {
    try {
      sut.setVisibility(Visibility.PRIVATE);
      Assertions.fail("Did not fail when visibility was set to private.");
    } catch(InvalidVisibilityException e) {
      Assertions.assertTrue(true);
    }
  }
}
