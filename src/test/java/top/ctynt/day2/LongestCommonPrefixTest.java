package top.ctynt.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/3
 * @Description
 */

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        LongestCommonPrefix lcr = new LongestCommonPrefix();
        String[] s = {"flower","flow","flight"};
        System.out.println(lcr.longestCommonPrefix(s));
    }
}