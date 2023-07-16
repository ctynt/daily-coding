package top.ctynt.day10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/15
 * @Description
 */

class RotateTest {

    @Test
    void rotate() {
        Rotate r = new Rotate();
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        r.rotate(nums);
    }
}