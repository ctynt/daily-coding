package top.ctynt.day7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/11
 * @Description
 */

class LongestPalindromeTest {

    @Test
    void longestPalindrome() {
        LongestPalindrome lp = new LongestPalindrome();
        String s = "reserve";
        System.out.println(lp.longestPalindrome(s));
    }
}