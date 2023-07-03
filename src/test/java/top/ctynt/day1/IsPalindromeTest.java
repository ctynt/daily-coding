package top.ctynt.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/2
 * @Description
 */

class IsPalindromeTest {

    @Test
    void isPalindrome() {
        IsPalindrome isPalindrome = new IsPalindrome();
        int i = 12331;
        System.out.println(isPalindrome.isPalindrome(i));
    }
}