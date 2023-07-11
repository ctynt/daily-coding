package top.ctynt.day6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/10
 * @Description
 */

class TitleToNumberTest {

    @Test
    void titleToNumber() {
        TitleToNumber tto = new TitleToNumber();
        String s = "A";
        System.out.println(tto.titleToNumber(s));
    }
}