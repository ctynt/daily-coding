package top.ctynt.day6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/10
 * @Description
 */

class LengthOfLongestSubstringTest {

    @Test
    void lengthOfLongestSubstring() {
        LengthOfLongestSubstring lols = new LengthOfLongestSubstring();
        String s = "abcabcbb";
        System.out.println(lols.lengthOfLongestSubstring(s));
    }
}