package top.ctynt.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/8
 * @Description
 */

class ClimbStairsTest {

    @Test
    void climbStairs() {
        ClimbStairs cs = new ClimbStairs();
        int num = 9;
        System.out.println(cs.climbStairs(num));
    }
}