package datastructures.hashtable;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashMapTest {

  @Test
  @DisplayName("hash table add single value")
  void hashTableSingleValue(){
    HashMap<Integer, String> hashMap = new HashMap<>(16);
    hashMap.set(5, "Tony");
    assert(hashMap.get(5).equals("Tony"));
  }

  @Test
  @DisplayName("hash table add multiple values")
  void hashTableMultipleValues(){
    HashMap<Integer, String> hashMap = new HashMap<>(5);
    hashMap.set(0, "Tony");
    hashMap.set(1, "Alex");
    hashMap.set(2, "Jallow");
    hashMap.set(3, "Josh");
    hashMap.set(4, "Ed");
    assert(hashMap.get(0).equals("Tony"));
    assert(hashMap.get(1).equals("Alex"));
    assert(hashMap.get(2).equals("Jallow"));
    assert(hashMap.get(3).equals("Josh"));
    assert(hashMap.get(4).equals("Ed"));
    assertEquals("[[0=Tony], [1=Alex], [2=Jallow], [3=Josh], [4=Ed]]", hashMap.bucketArrayList.toString());;
  }

  @Test
  @DisplayName("hash table duplicate/collision")
  void hashTableDuplicateKeys(){
    HashMap<Integer, String> hashMap = new HashMap<>(16);
    hashMap.set(5, "Tony");
    assertThrows(IllegalArgumentException.class, () -> hashMap.set(5, "Alex"));
  }

  @Test
  @DisplayName("hash table contains key TRUE")
  void hashTableContainsExpectedTrue(){
    HashMap<Integer, String> hashMap = new HashMap<>(16);
    hashMap.set(0, "Tony");
    hashMap.set(1, "Alex");
   assert(hashMap.contains(0));
   assert(hashMap.contains(1));
  }

  @Test
  @DisplayName("hash table contains key FALSE")
  void hashTableContainsExpectedFalse(){
    HashMap<Integer, String> hashMap = new HashMap<>(16);
    hashMap.set(0, "Tony");
    hashMap.set(1, "Alex");
    assertFalse(hashMap.contains(2));
  }
}
