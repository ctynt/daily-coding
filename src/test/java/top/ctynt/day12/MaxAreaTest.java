package top.ctynt.day12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/18
 * @Description
 */

class MaxAreaTest {

    @Test
    void maxArea() {
        MaxArea ma = new MaxArea();
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(ma.maxArea(nums));
    }
}