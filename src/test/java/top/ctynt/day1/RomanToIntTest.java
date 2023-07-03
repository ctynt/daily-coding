package top.ctynt.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/2
 * @Description
 */

class RomanToIntTest {

    @Test
    void romanToInt() {
        RomanToInt romanToInt = new RomanToInt();
        String i = "IV";
        System.out.println(romanToInt.romanToInt(i));
    }
}