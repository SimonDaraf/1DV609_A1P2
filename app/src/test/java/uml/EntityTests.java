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

  @Test
  public void shouldThrowErrorIfVisibilityIsProtected() {
    try {
      sut.setVisibility(Visibility.PROTECTED);
      Assertions.fail("Did not fail when visibility was set to protected.");
    } catch(InvalidVisibilityException e) {
      Assertions.assertTrue(true);
    }
  }

  @Test
  public void shouldBeAbleToSetName() {
    String expected = "myEntity";
    sut.setName(expected);

    String actual = sut.getName();

    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void shouldBeAbleToSetStereotype() {
    Stereotype expected = Stereotype.ENUMERATION;
    sut.setStereotype(expected);

    Stereotype actual = sut.getStereotype();

    Assertions.assertEquals(expected, actual);
  }
}
