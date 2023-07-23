package top.ctynt.day16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/24
 * @Description
 */

class MyAtoiTest {

    @Test
    void myAtoi() {
        MyAtoi m = new MyAtoi();
        String str = "2147483646";
        System.out.println(m.myAtoi(str));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}