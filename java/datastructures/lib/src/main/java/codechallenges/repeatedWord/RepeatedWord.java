package codechallenges.repeatedWord;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RepeatedWord {
  public String repeatedWord(String string) {
    String result = "";
    String trimmed = string.replace(",", "").toLowerCase();
    String[] wordsArray = trimmed.split(" ");
    HashMap<String, Integer> hashMap = new LinkedHashMap<>();
    for (String word : wordsArray) {
      if (hashMap.get(word) != null)
      {
        hashMap.put(word, hashMap.get(word) + 1);
        result = word;
        return result;
      } else {
        hashMap.put(word, 1);
      }
    }
    return result;
  }
}
