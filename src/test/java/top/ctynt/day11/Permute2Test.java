package top.ctynt.day11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/16
 * @Description
 */

class Permute2Test {

    @Test
    void permuteUnique() {
        Permute2 p2 = new Permute2();
        int[] nums = {1,2,3};
        System.out.println(p2.permuteUnique(nums));
    }
}