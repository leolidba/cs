package com.codersmart.algorithms.trainings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void lengthOfLongestSubstringCase1() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
    }
    @Test
    void lengthOfLongestSubstringCase2() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
    }
    @Test
    void lengthOfLongestSubstringCase3() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
    }
    @Test
    void lengthOfLongestSubstringCase4() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(5, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("tmmzuxt"));
    }
    @Test
    void lengthOfLongestSubstringCase5() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("dvdf"));
    }
    @Test
    void lengthOfLongestSubstringCase6() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(5, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("nfpdmpi"));
    }


}