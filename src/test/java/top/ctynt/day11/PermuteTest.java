package top.ctynt.day11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/16
 * @Description
 */

class PermuteTest {

    @Test
    void permute() {
        Permute p = new Permute();
        int[] nums = {1,2,3};
        System.out.println(p.permute(nums));
    }
}