package top.ctynt.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/2
 * @Description
 */

class TwoSumTest {

    @Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {1, 2, 3, 4};
        int target = 4;
        twoSum.twoSum(nums,target);

    }
}