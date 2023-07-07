package top.ctynt.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/7
 * @Description
 */

class AddBinaryTest {

    @Test
    void addBinary() {
        AddBinary ab = new AddBinary();
        String a = "Hello";
        String b = "Java";
        System.out.println(ab.addBinary(a,b));
    }
}