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
    void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
    }
    void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
    }
}