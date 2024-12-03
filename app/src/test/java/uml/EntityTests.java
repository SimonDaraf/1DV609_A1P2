package uml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uml.errors.InvalidVisibilityException;
import uml.shapes.Rectangle;
import uml.structs.Attribute;

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

  @Test
  public void shouldBeAbleToAddAttributes() {
    Attribute mockedAttr = mock(Attribute.class);
    String expected = "attr1";
    when(mockedAttr.getId()).thenReturn(expected);

    sut.addAttribute(mockedAttr);
    Attribute[] attrs = sut.getAttributes();

    if (attrs.length == 0) {
      Assertions.fail("An empty array was returned.");
    }

    Assertions.assertEquals(expected, attrs[0].getId());
  }

  @Test
  public void attributesReturnedShouldBeImmutable() {
    Attribute mockedAttr = mock(Attribute.class);
    Attribute expectedAttr = mock(Attribute.class);
    String expectedId = "expected";

    when(mockedAttr.cloneInstance()).thenReturn(expectedAttr);
    when(mockedAttr.getId()).thenReturn("error");
    when(expectedAttr.getId()).thenReturn(expectedId);

    sut.addAttribute(mockedAttr);
    Attribute[] attributes = sut.getAttributes();

    if (attributes.length == 0) {
      Assertions.fail("An empty array was returned.");
    }

    Assertions.assertEquals(expectedId, attributes[0].getId());
  }
}
