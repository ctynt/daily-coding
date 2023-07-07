package top.ctynt.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/7
 * @Description
 */

class LengthOfLastWordTest {

    @Test
    void lengthOfLastWord() {
        LengthOfLastWord lol = new LengthOfLastWord();
        String s = "word";
        System.out.println(lol.lengthOfLastWord(s));
    }
}