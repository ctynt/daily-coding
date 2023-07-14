package top.ctynt.day9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/14
 * @Description
 */

class CombinationSum2Test {

    @Test
    void combinationSum2() {
        CombinationSum2 cs = new CombinationSum2();
        int[] nums = {2,3,6,7};
        int target = 7;
        System.out.println(cs.combinationSum2(nums,target));
    }
}