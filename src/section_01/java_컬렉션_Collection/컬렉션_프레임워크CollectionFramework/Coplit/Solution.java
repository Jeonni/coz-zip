package section_01.java_컬렉션_Collection.컬렉션_프레임워크CollectionFramework.Coplit;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        HashMap<Character, Integer> output = solution.countAllCharacter("banana");
        System.out.println(output); // --> {b=1, a=3, n=2}
    }
}

public class Solution {
    public HashMap<Character, Integer> countAllCharacter(String str) {
        //TODO..

        if (str.isEmpty()) {
            return null;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (hashMap.containsKey(key)) {
                hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
            } else {
                hashMap.put(key, 1);
            }
        }

        return hashMap;
    }
}