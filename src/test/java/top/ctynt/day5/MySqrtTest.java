package top.ctynt.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/8
 * @Description
 */

class MySqrtTest {

    @Test
    void mySqrt() {
        MySqrt ms = new MySqrt();
        int num = 9 ;
        System.out.println(ms.mySqrt(num));
    }
}