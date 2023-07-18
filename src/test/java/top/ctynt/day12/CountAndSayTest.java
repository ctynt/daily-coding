package top.ctynt.day12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/18
 * @Description
 */

class CountAndSayTest {

    @Test
    void countAndSay() {
        CountAndSay cas = new CountAndSay();
        int num = 1;
        System.out.println(cas.countAndSay(num));
    }
}