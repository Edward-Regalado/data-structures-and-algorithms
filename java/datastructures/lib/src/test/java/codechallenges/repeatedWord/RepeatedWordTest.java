package codechallenges.repeatedWord;

import codechallenges.linkedlist.LinkedListChallenges;
import datastructures.linkedlist.LinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedWordTest {

  @Test
  @DisplayName("test one")
  void testOne()
  {
    RepeatedWord sut = new RepeatedWord();
    String string = "Once upon a time, there was a brave princess who...";
    assertEquals(sut.repeatedWord(string), "a");
  }

  @Test
  @DisplayName("test two")
  void testTwo()
  {
    RepeatedWord sut = new RepeatedWord();
    String string = "It was the best of times it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
    assertEquals(sut.repeatedWord(string), "it");
  }

  @Test
  @DisplayName("test three")
  void testThree()
  {
    RepeatedWord sut = new RepeatedWord();
    String string = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
    assertEquals(sut.repeatedWord(string), "summer");
  }

  @Test
  @DisplayName("empty string")
  void testFour()
  {
    RepeatedWord sut = new RepeatedWord();
    String string = "";
    assertEquals(sut.repeatedWord(string), "");
  }

}
