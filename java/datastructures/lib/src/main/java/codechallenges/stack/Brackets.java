package codechallenges.stack;

import datastructures.stack.Stack;

public class Brackets {

  public boolean validateBrackets(String string) {

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < string.length(); i++) {
      char character = string.charAt(i);
      if (character == '(' || character == '{' || character == '[') {
        stack.push(character);
        continue;
      }
      if (stack.isEmpty()) {
          return false;
        }
      char check;
      switch (character) {
        case ')' -> {
          check = stack.pop();
          if (check == '{' || check == '[')
            return false;
        }
        case '}' -> {
          check = stack.pop();
          if (check == '(' || check == '[')
            return false;
        }
        case ']' -> {
          check = stack.pop();
          if (check == '(' || check == '{')
            return false;
        }
      }
  }
    return stack.isEmpty();
  }
}

