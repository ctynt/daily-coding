package top.ctynt.day16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/24
 * @Description
 */

class ConvertTest {

    @Test
    void convert() {
        Convert c = new Convert();
        System.out.println(c.convert("hello",4));
    }
}