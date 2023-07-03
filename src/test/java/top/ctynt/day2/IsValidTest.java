package top.ctynt.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/3
 * @Description
 */

class IsValidTest {

    @Test
    void isValid() {
        IsValid iv = new IsValid();
        String s = "()";
        System.out.println(iv.isValid(s));

    }
}