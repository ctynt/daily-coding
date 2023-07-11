package top.ctynt.day7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/11
 * @Description
 */

class ReverseTest {

    @Test
    void reverse() {
        Reverse r = new Reverse();
        int i = 123;
        System.out.println(r.reverse(i));
    }
}