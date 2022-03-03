package codechallenges.stack;

import datastructures.stack.Stack;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {
  @Test
  @DisplayName("validate brackets true")
  void validateBracketsTrue(){
    Brackets validate = new Brackets();
    assertTrue(validate.validateBrackets("[]"));
    assertTrue(validate.validateBrackets("{}{}{}"));
    assertTrue(validate.validateBrackets("{}(){}"));
    assertTrue(validate.validateBrackets("{}{Code}[Fellows](())"));
    assertTrue(validate.validateBrackets("[][](Hello)((World))"));
  }

  @Test
  @DisplayName("validate brackets false")
  void validateBracketsFalse(){
    Brackets validate = new Brackets();
    assertFalse(validate.validateBrackets("(()({}}]]"));
    assertFalse(validate.validateBrackets(")(}Hello (]"));
    assertFalse(validate.validateBrackets("{}{{{))[{"));
  }
}
