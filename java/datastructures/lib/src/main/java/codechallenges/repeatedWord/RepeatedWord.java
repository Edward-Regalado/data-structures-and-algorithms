package codechallenges.repeatedWord;

import datastructures.hashtable.HashMap;

public class RepeatedWord {

    public String repeatedWord(String string )
    {
      String [] words = string.replaceAll("[^a-zA-Z]", "").toLowerCase().split("\\s+");
      HashMap<String, String> hashMap = new HashMap<String, String>();
      for (String word : words)
      {
        return word;
      }
      return null;
    }
}
