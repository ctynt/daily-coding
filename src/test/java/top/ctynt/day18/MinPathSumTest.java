package top.ctynt.day18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/26
 * @Description
 */

class MinPathSumTest {

    @Test
    void minPathSum() {
        MinPathSum mps = new MinPathSum();
        int[][] nums = {{1,3,2},{1,2,6},{8,6,10},{12,16,18}};
        System.out.println(mps.minPathSum(nums));
    }
}