package top.ctynt.day17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/24
 * @Description
 */

class UniquePath2Test {

    @Test
    void uniquePathsWithObstacles() {
        UniquePath2 up2 = new UniquePath2();
        int[][] nums = {{0,0,0},{0,1,0},{1,1,0}};
        System.out.println(up2.uniquePathsWithObstacles(nums));

    }
}