package top.ctynt.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/7
 * @Description
 */

class PlusOneTest {

    @Test
    void plusOne() {
        PlusOne po = new PlusOne();
        int[] nums = {1,2,3};
        System.out.println(po.plusOne(nums));
    }
}