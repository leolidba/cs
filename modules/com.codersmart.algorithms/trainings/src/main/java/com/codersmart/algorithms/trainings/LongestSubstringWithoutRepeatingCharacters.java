package com.codersmart.algorithms.trainings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < s.length(); j++){
            Integer index = map.get(s.charAt(j));
            boolean found = index != null && index >=i;
            if(!found){
                map.put(s.charAt(j), j);
                ans = Math.max(ans, j - i + 1);
             }else{ // found
                i = index + 1;
                map.put(s.charAt(j), j);

            }
        }
        return ans;
    }

}
