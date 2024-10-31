package com.codedifferently.lesson16.xaviercruz;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class PersonTest {
  Person person = new Person("That one guy right there", 25, Position.ARSONIST, new ArrayList<>(Arrays.asList("Tall", "Insane", "Funny", "something else here idk")), Color.RED);

  @Test
  public void testGetName(){
    assertEquals("That one guy right there", person.getName());
  }

  @Test
  public void testChangeName(){
    person.changeName("new name right here bruh");
    assertEquals("new name right here bruh", person.getName());
  }

  @Test
  public void testGetAge(){
    assertEquals(25, person.getAge());
  }

  @Test
  public void testGetPosition(){
    assertEquals(Position.ARSONIST, person.getPosition());
  }

  @Test
  public void testGetTraits(){
    assertEquals(new ArrayList<>(Arrays.asList("Tall", "Insane", "Funny", "something else here idk")), person.getTraits());
  }

  @Test
  public void testGetEyeColor(){
    assertEquals(Color.RED, person.getEyeColor());
  }

 @Test
  public void testSetEyeColor() {
    Color color = Color.GREEN;

    person.setEyeColor(color);

    assertEquals(Color.GREEN, person.getEyeColor());
  }


  @Test
  public void testIncreaseAge(){
    person.increaseAge();
    assertEquals(26, person.getAge());
  }

  @Test
  public void testUpdateAge(){
    person.updateAge(99);
    assertEquals(99, person.getAge());
  }

  @Test
  public void testAddToTraits_Exception(){
    String[] newTraits = new String[]{"test", "test", "test", "test", "test", "test", "test"};
    assertThrows(TooManyTraitsException.class, () -> {
      person.addToTraits(newTraits);
    });
  }

}
