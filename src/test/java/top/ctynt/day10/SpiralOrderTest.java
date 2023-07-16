package top.ctynt.day10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/15
 * @Description
 */

class SpiralOrderTest {

    @Test
    void spiralOrder() {
        SpiralOrder so = new SpiralOrder();
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(so.spiralOrder(nums));
    }
}